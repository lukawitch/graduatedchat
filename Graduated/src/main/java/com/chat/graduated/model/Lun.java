package com.chat.graduated.model;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.chat.graduated.vo.CalenderVo;


public class Lun {
 public CalenderVo getitem(String y,String m, String d) {
	 CalenderVo setvalue=new CalenderVo();
	 String year=y;
	 String mon=m;
	 String day=d;
	 System.out.println(mon);
	  try {
   	   StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B090041/openapi/service/LrsrCldInfoService/getLunCalInfo"); 
   	   urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=FBj3U74WoSJVQRx6Jxzi9POVE5lbTeRlgUOpv39uzs7qijqvcU%2BQakUabpDgy2Ds3%2BaCoz2UNmg%2BSAXETib%2Fig%3D%3D"); /*Service Key*/
          urlBuilder.append("&" + URLEncoder.encode("solYear","UTF-8") + "=" + URLEncoder.encode(year, "UTF-8")); /*연*/
          urlBuilder.append("&" + URLEncoder.encode("solMonth","UTF-8") + "=" + URLEncoder.encode(mon, "UTF-8")); /*월*/
          urlBuilder.append("&" + URLEncoder.encode("solDay","UTF-8") + "=" + URLEncoder.encode(day, "UTF-8")); /*일*/
          URL url = new URL(urlBuilder.toString());
          HttpURLConnection conn = (HttpURLConnection) url.openConnection();
          conn.setRequestMethod("GET");
          conn.setRequestProperty("Content-type", "application/json");
          System.out.println("Response code: " + conn.getResponseCode());
          BufferedReader rd;
          if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
              rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
          } else {
              rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
          }
          StringBuilder sb = new StringBuilder();
          String line;
        
          while ((line = rd.readLine()) != null) {
              sb.append(line);
              System.out.println();
              
          }
          rd.close();
          conn.disconnect();
          System.out.println(sb.toString());
          
          DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
          factory.setNamespaceAware(true);
          DocumentBuilder builder;
          Document doc = null;


          InputSource is = new InputSource(new StringReader(sb.toString()));
          builder = factory.newDocumentBuilder();
          doc = builder.parse(is);
          XPathFactory xpathFactory = XPathFactory.newInstance();
          XPath xpath = xpathFactory.newXPath();
          // XPathExpression expr = xpath.compile("/response/body/items/item");
          XPathExpression expr = xpath.compile("//items/item");
          NodeList nodeList = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
          //List<String> list=new ArrayList<String>();
         
          for (int i = 0; i < nodeList.getLength(); i++) {
              NodeList child = nodeList.item(i).getChildNodes();
              for (int j = 0; j < child.getLength(); j++) {
                  Node node = child.item(j);
                 
                  
                  if(node.getNodeName().equals("lunIljin")) {
               	   String a=String.valueOf( node.getTextContent());
               	   //System.out.println(a);
               	  // list.add(a);
               	   
               	   setvalue.setGanG(a);
                  }
                  if(node.getNodeName().equals("lunDay")) {
               	   int a= Integer.parseInt( node.getTextContent());
               	   //System.out.println(a);
               	  // list.add(a);
               	   
               	   setvalue.setDay(a);
                  }
                  if(node.getNodeName().equals("lunMonth")) {
               	   int a= Integer.parseInt( node.getTextContent());
               	  // System.out.println(a);
               	  // list.add(a);
               	   
               	   setvalue.setMon(a);
                  }
                 
              }
              System.out.println(setvalue.getGanG());
              System.out.println(setvalue.getDay());
              System.out.println(setvalue.getMon());
          }
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	 return setvalue;
 }
}
