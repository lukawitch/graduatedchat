/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2019-10-05 04:59:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import com.chat.graduated.vo.Uservo;

public final class usermemberlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.chat.graduated.vo.Uservo");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("  @keyframes check {0% {height: 0;width: 0;}\r\n");
      out.write("    25% {height: 0;width: 10px;}\r\n");
      out.write("    50% {height: 20px;width: 10px;}\r\n");
      out.write("  }\r\n");
      out.write("  .checkbox{background-color:#fff;display:inline-block;height:28px;margin:0 .25em;width:28px;border-radius:4px;border:1px solid #ccc;float:left}\r\n");
      out.write("  .checkbox span{display:block;height:28px;position:relative;width:28px;padding:0}\r\n");
      out.write("  .checkbox span:after{-moz-transform:scaleX(-1) rotate(135deg);-ms-transform:scaleX(-1) rotate(135deg);-webkit-transform:scaleX(-1) rotate(135deg);transform:scaleX(-1) rotate(135deg);-moz-transform-origin:left top;-ms-transform-origin:left top;-webkit-transform-origin:left top;transform-origin:left top;border-right:4px solid #fff;border-top:4px solid #fff;content:'';display:block;height:20px;left:3px;position:absolute;top:15px;width:10px}\r\n");
      out.write("  .checkbox span:hover:after{border-color:#999}\r\n");
      out.write("  .checkbox input{display:none}\r\n");
      out.write("  .checkbox input:checked + span:after{-webkit-animation:check .8s;-moz-animation:check .8s;-o-animation:check .8s;animation:check .8s;border-color:#555}\r\n");
      out.write(".checkbox input:checked + .default:after{border-color:#444}\r\n");
      out.write(".checkbox input:checked + .primary:after{border-color:#2196F3}\r\n");
      out.write(".checkbox input:checked + .success:after{border-color:#8bc34a}\r\n");
      out.write(".checkbox input:checked + .info:after{border-color:#3de0f5}\r\n");
      out.write(".checkbox input:checked + .warning:after{border-color:#FFC107}\r\n");
      out.write(".checkbox input:checked + .danger:after{border-color:#f44336}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<main class=\"login-form\">\r\n");
      out.write("    <div class=\"cotainer\">\r\n");
      out.write("        <div class=\"row justify-content-center\">\r\n");
      out.write("            <div class=\"col-md-8\">\r\n");
      out.write("            <form method=\"post\" action=\"getfriendlist\">\r\n");
      out.write("                <div class=\"card\">\r\n");
      out.write("                    <div class=\"card-header\">친구 목록\r\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-outline-info\" style=\"float:right\" value=\"check\"></div>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("\r\n");
      out.write("  <table class=\"table table-hover\">\r\n");
      out.write("  <thead>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"col\">#</th>\r\n");
      out.write("      <th scope=\"col\">ID</th>\r\n");
      out.write("      <th scope=\"col\">Name</th>\r\n");
      out.write("\t\t<th scope=\"col\">check</th>\r\n");
      out.write("    </tr>\r\n");
      out.write("  </thead>\r\n");
      out.write("  <tbody>\r\n");
      out.write("    <!--  <tr>\r\n");
      out.write("      <th scope=\"row\">1</th>\r\n");
      out.write("      <td>Mark</td>\r\n");
      out.write("      <td>Otto</td>\r\n");
      out.write("\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("      <th scope=\"row\">2</th>\r\n");
      out.write("      <td>Jacob</td>\r\n");
      out.write("      <td>Thornton</td>\r\n");
      out.write("\r\n");
      out.write("    </tr>-->\r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    ");

    ArrayList<Uservo> hihi=(ArrayList)session.getAttribute("list");
    String id= (String)session.getAttribute("id");
    System.out.println(id);
    for(int i=0;i<hihi.size();i++){
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("   <tr><td>  ");
      out.print(i+1 );
      out.write("</td>\r\n");
      out.write("   <td>  ");
      out.print(hihi.get(i).getId() );
      out.write("</td>\r\n");
      out.write("   <td>  ");
      out.print(hihi.get(i).getName() );
      out.write("</td>\r\n");
      out.write("   <td> \r\n");
      out.write("          <label class=\"checkbox\">\r\n");
      out.write("          <input type=\"checkbox\" name=\"check\" value=\"");
      out.print(hihi.get(i).getId() );
      out.write("\"/>\r\n");
      out.write("          <span class=\"danger\"></span>\r\n");
      out.write("           </label></td></tr>\r\n");
      out.write("       \r\n");
      out.write("  \r\n");
      out.write("    \r\n");
      out.write(" ");
   }
    
      out.write("\r\n");
      out.write("  </form>\r\n");
      out.write("\r\n");
      out.write("  </tbody>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</main>\r\n");
      out.write("</body>\r\n");
      out.write("<!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("</html>");
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