/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2019-05-26 03:29:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class makegroup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("\t<style>\r\n");
      out.write(".filebox input[type=\"file\"] \r\n");
      out.write("{ position: absolute;\r\n");
      out.write("width: 1px; \r\n");
      out.write("height: 1px; \r\n");
      out.write("padding: 0; \r\n");
      out.write("margin: -1px; \r\n");
      out.write("overflow: hidden; \r\n");
      out.write("clip:rect(0,0,0,0); border: 0; } \r\n");
      out.write(".filebox label { \r\n");
      out.write("display: inline-block; \r\n");
      out.write("padding: .5em .75em; \r\n");
      out.write("color: #999; \r\n");
      out.write("font-size: inherit; \r\n");
      out.write("line-height: normal; \r\n");
      out.write("vertical-align: middle; \r\n");
      out.write("background-color: #fdfdfd; \r\n");
      out.write("cursor: pointer; \r\n");
      out.write("border: 1px solid #ebebeb; \r\n");
      out.write("border-bottom-color: #e2e2e2; \r\n");
      out.write("border-radius: .25em; } \r\n");
      out.write("/* named upload */ \r\n");
      out.write(".filebox .upload-name { \r\n");
      out.write("display: inline-block; \r\n");
      out.write("padding: .5em .75em; \r\n");
      out.write("/* label의 패딩값과 일치 */ \r\n");
      out.write("font-size: inherit; \r\n");
      out.write("font-family: inherit; \r\n");
      out.write("line-height: normal; \r\n");
      out.write("vertical-align: middle; \r\n");
      out.write("background-color: #f5f5f5; \r\n");
      out.write("border: 1px solid #ebebeb; \r\n");
      out.write("border-bottom-color: #e2e2e2; \r\n");
      out.write("border-radius: .25em; \r\n");
      out.write("-webkit-appearance: none; \r\n");
      out.write("/* 네이티브 외형 감추기 */ \r\n");
      out.write("-moz-appearance: none; \r\n");
      out.write("appearance: none; }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script>\r\n");
      out.write("\tfunction Back()\r\n");
      out.write("{\r\n");
      out.write("    window.history.back();\r\n");
      out.write("}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\r\n");
      out.write("\t <div class=\"container\">\r\n");
      out.write("       <div class=\"row\">\r\n");
      out.write(" \r\n");
      out.write("\t\t<div class=\"col-md-3\"></div>\r\n");
      out.write("        <form action=\"\" method=\"post\" class=\"col-md-6\">\r\n");
      out.write("\t\t       <p class=\"h2 text-center\">Group</p>\r\n");
      out.write("          <div class=\"preview text-center\">\r\n");
      out.write("                <img class=\"preview-img\" src=\"http://simpleicon.com/wp-content/uploads/account.png\" alt=\"Preview Image\" width=\"200\" height=\"200\"/>\r\n");
      out.write("                <div class=\"browse-button\">\r\n");
      out.write("                    <i class=\"fa fa-pencil-alt\"></i>\r\n");
      out.write("                 <div class=\"filebox\"> \r\n");
      out.write("\t\t\t\t <input class=\"upload-name\" value=\"파일선택\" disabled=\"disabled\"> \r\n");
      out.write("\t\t\t\t <label for=\"ex_filename\">업로드</label> \r\n");
      out.write("\t\t\t\t <input type=\"file\" id=\"ex_filename\" class=\"upload-hidden\"> \r\n");
      out.write("\t\t\t\t </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <span class=\"Error\"></span>\r\n");
      out.write("            </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("                <label>그룹이름:</label>\r\n");
      out.write("                <input class=\"form-control\" type=\"text\" name=\"fullname\" required placeholder=\"Enter Your Full Name\"/>\r\n");
      out.write("                <span class=\"Error\"></span>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("<a href=\"./personal.html\" class=\"btn btn-outline-success btn-xs pull-right\"><b>+</b>멤버추가</a>\r\n");
      out.write("\t\t\t\t\t<div >\r\n");
      out.write("\t\t\t\t<table class=\"table table-striped custab\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t<th>이름</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th>ID</th>\r\n");
      out.write("\t\t\t\t\t\t\t<th class=\"text-center\">Action</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>News</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>News Cate</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"text-center\"><a href=\"#\" class=\"btn btn-danger btn-xs\"><span class=\"glyphicon glyphicon-remove\"></span> Del</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Products</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Main Products</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"text-center\"> <a href=\"#\" class=\"btn btn-danger btn-xs\"><span class=\"glyphicon glyphicon-remove\"></span> Del</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Blogs</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>Parent Blogs</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td class=\"text-center\"><a href=\"#\" class=\"btn btn-danger btn-xs\"><span class=\"glyphicon glyphicon-remove\"></span>Del</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("            </div>            \r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <input class=\"btn btn-outline-success btn-block\" type=\"submit\" value=\"만들기\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t  <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t</body>\r\n");
      out.write("\t</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
