package com.chat.graduated;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chat.graduated.model.Join;
import com.chat.graduated.model.User;
import com.chat.graduated.vo.Uservo;

@Controller
public class IndexController {
	String a;
	String res;
    @RequestMapping(value = "/success",method=RequestMethod.POST)
    public String hello(@ModelAttribute Uservo vo,Model model) {
    	System.out.println(vo.getId());
    	System.out.println(vo.getPw());
    	User user=new User();
    	a=user.check(vo.getId(),vo.getPw());
    	if(a.equals("admin_NO")) {
    		res="index";
    		
    	}
    	else {
    		model.addAttribute("name",a);
    		res="success";
    	}
    	model.addAttribute("user", vo);
    	
        return res;
    }
    
    @RequestMapping(value="/join",method=RequestMethod.POST)
    public String join( @RequestParam(value="id", required=true) String userId
            , @RequestParam(value="pw",required=true) String password
            , @RequestParam(value="email",required=true) String email
            , @RequestParam(value="password_check",required=true) String password_check
            , HttpServletRequest request
            , HttpServletResponse response
             ) throws Exception{
         System.out.println(userId);
         System.out.println(password);
         Join join = new Join();
         int a;
     	if(password.equals(password_check)) {
     		a=join.insert(userId, password, email);
     		if(a==1) {
     			 response.setContentType("text/html; charset=UTF-8");
                 PrintWriter out = response.getWriter();
                 out.println("<script>alert('ID가 중복입니다'); history.go(-1);</script>");
                 out.flush(); 
     		}
     		
     	}
     		else {
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<script>alert('로그인 정보를 확인해주세요.'); history.go(-1);</script>");
            out.flush(); 
     		}
         
        return "joinsuccess";
    }
    
    
}