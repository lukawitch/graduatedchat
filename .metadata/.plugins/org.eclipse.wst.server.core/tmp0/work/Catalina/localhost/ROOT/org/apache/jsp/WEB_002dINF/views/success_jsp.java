/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2019-07-18 06:58:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.chat.graduated.vo.Groupvo;
import com.chat.graduated.model.Grouplist;
import java.util.List;

public final class success_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/./sidebar.jsp", Long.valueOf(1562167133667L));
    _jspx_dependants.put("jar:file:/C:/Users/hestia/Desktop/chattest/graduated/graduatedchat/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Graduated/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1554194380912L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.chat.graduated.vo.Groupvo");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.chat.graduated.model.Grouplist");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/group.css\">\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<style>\r\n");
      out.write("</style>\r\n");

	String userid = (String) session.getAttribute("id"); //세션에서 아이디얻어옴
	//if(userid==null){System.out.println("세션 ㄴㄴ");}
	//else{System.out.println("세션 =="+ userid);}

	Groupvo gvo = new Groupvo();
	Grouplist model = new Grouplist();
	//Groupvo sample = model.groupex(userid);

	//System.out.println(sample.getName());
	List<Groupvo> glist = model.grouplist(userid);

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\tfunction test() {\r\n");
      out.write("\t\tvar con = document.getElementsByName(\"chk\");\r\n");
      out.write("\t\tfor (var i = 0; i < con.length; i++) {\r\n");
      out.write("\t\t\tif (con[i].style.display == 'none') {\r\n");
      out.write("\t\t\t\tcon[i].style.display = 'block';\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tcon[i].style.display = 'none';\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction profile(aa) {\r\n");
      out.write("\r\n");
      out.write("\t\tvar con = document.getElementById(aa);\r\n");
      out.write("\t\tcon.style.display = 'block';\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tfunction prodel(aa) {\r\n");
      out.write("\t\tvar con = document.getElementById(aa);\r\n");
      out.write("\t\tcon.style.display = 'none';\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/resources/sidebar.css\">\r\n");
      out.write("\r\n");
      out.write("  <header class=\"header\">\r\n");
      out.write("          <nav class=\"navbar navbar-toggleable-md navbar-light pt-0 pb-0 \">\r\n");
      out.write("            <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavDropdown\" aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"navbar-brand p-0 mr-5\" href=\"#\" style=\"visibility:hidden \"><img src=\"http://via.placeholder.com/61x14\"></a>\r\n");
      out.write("            <div class=\"float-left\"> <a href=\"#\" class=\"button-left\"><span class=\"fa fa-fw fa-bars \" style=\"visibility:hidden \"></span></a> </div>\r\n");
      out.write("            <div class=\"collapse navbar-collapse flex-row-reverse\" id=\"navbarNavDropdown\">\r\n");
      out.write("              <ul class=\"navbar-nav\">\r\n");
      out.write("              <li class=\"nav-item dropdown messages-menu\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                  <a class=\"nav-link dropdown-toggle\" href=\"main\">\r\n");
      out.write("                    <i class=\"fa fa-home\" aria-hidden=\"true\"></i>\r\n");
      out.write("                  </a>\r\n");
      out.write("                 \r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"nav-item dropdown messages-menu\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                  <a class=\"nav-link dropdown-toggle\" href=\"calender\">\r\n");
      out.write("                    <i class=\"fa fa-calendar-check-o\" aria-hidden=\"true\"></i>\r\n");
      out.write("                    <span class=\"label label-success bg-success\">10</span>\r\n");
      out.write("                  </a>\r\n");
      out.write("                 \r\n");
      out.write("              </li>\r\n");
      out.write("                <li class=\"nav-item dropdown messages-menu\">\r\n");
      out.write("                  <a class=\"nav-link dropdown-toggle\" href=\"http://example.com\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                    <i class=\"fa fa-bell-o\"></i>\r\n");
      out.write("                    <span class=\"label label-success bg-success\">10</span>\r\n");
      out.write("                  </a>\r\n");
      out.write("                  <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n");
      out.write("                    <ul class=\"dropdown-menu-over list-unstyled\">\r\n");
      out.write("                      <li class=\"header-ul text-center\">You have 4 messages</li>\r\n");
      out.write("                      <li>\r\n");
      out.write("                        <!-- inner menu: contains the actual data -->\r\n");
      out.write("                        <ul class=\"menu list-unstyled\">\r\n");
      out.write("                          <li><!-- start message -->\r\n");
      out.write("                          <a href=\"#\">\r\n");
      out.write("                            <div class=\"pull-left\">\r\n");
      out.write("                              <img src=\"http://via.placeholder.com/160x160\" class=\"rounded-circle  \" alt=\"User Image\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h4>\r\n");
      out.write("                            Support Team\r\n");
      out.write("                            <small><i class=\"fa fa-clock-o\"></i> 5 mins</small>\r\n");
      out.write("                            </h4>\r\n");
      out.write("                            <p>Why not buy a new awesome theme?</p>\r\n");
      out.write("                          </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <!-- end message -->\r\n");
      out.write("                        <li>\r\n");
      out.write("                          <a href=\"#\">\r\n");
      out.write("                            <div class=\"pull-left\">\r\n");
      out.write("                              <img src=\"http://via.placeholder.com/160x160\" class=\"rounded-circle \" alt=\"User Image\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h4>\r\n");
      out.write("                            AdminLTE Design Team\r\n");
      out.write("                            <small><i class=\"fa fa-clock-o\"></i> 2 hours</small>\r\n");
      out.write("                            </h4>\r\n");
      out.write("                            <p>Why not buy a new awesome theme?</p>\r\n");
      out.write("                          </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                          <a href=\"#\">\r\n");
      out.write("                            <div class=\"pull-left\">\r\n");
      out.write("                              <img src=\"http://via.placeholder.com/160x160\" class=\"rounded-circle \" alt=\"User Image\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h4>\r\n");
      out.write("                            Developers\r\n");
      out.write("                            <small><i class=\"fa fa-clock-o\"></i> Today</small>\r\n");
      out.write("                            </h4>\r\n");
      out.write("                            <p>Why not buy a new awesome theme?</p>\r\n");
      out.write("                          </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                          <a href=\"#\">\r\n");
      out.write("                            <div class=\"pull-left\">\r\n");
      out.write("                              <img src=\"http://via.placeholder.com/160x160\" class=\"rounded-circle \" alt=\"User Image\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h4>\r\n");
      out.write("                            Sales Department\r\n");
      out.write("                            <small><i class=\"fa fa-clock-o\"></i> Yesterday</small>\r\n");
      out.write("                            </h4>\r\n");
      out.write("                            <p>Why not buy a new awesome theme?</p>\r\n");
      out.write("                          </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                          <a href=\"#\">\r\n");
      out.write("                            <div class=\"pull-left\">\r\n");
      out.write("                              <img src=\"http://via.placeholder.com/160x160\" class=\"rounded-circle \" alt=\"User Image\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <h4>\r\n");
      out.write("                            Reviewers\r\n");
      out.write("                            <small><i class=\"fa fa-clock-o\"></i> 2 days</small>\r\n");
      out.write("                            </h4>\r\n");
      out.write("                            <p>Why not buy a new awesome theme?</p>\r\n");
      out.write("                          </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                      </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"footer-ul text-center\"><a href=\"#\">See All Messages</a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\"nav-item dropdown notifications-menu\">\r\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" href=\"http://example.com\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                  <i class=\"fa fa-envelope-o\"></i>\r\n");
      out.write("                  <span class=\"label label-warning bg-warning\">10</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n");
      out.write("                  <ul class=\"dropdown-menu-over list-unstyled\">\r\n");
      out.write("                    <li class=\"header-ul text-center\">You have 10 notifications</li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                      <!-- inner menu: contains the actual data -->\r\n");
      out.write("                      <ul class=\"menu list-unstyled\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                          <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-users text-aqua\"></i> 5 new members joined today\r\n");
      out.write("                          </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                          <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-warning text-yellow\"></i> Very long description here that may not fit into the\r\n");
      out.write("                            page and may cause design problems\r\n");
      out.write("                          </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                          <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-users text-red\"></i> 5 new members joined\r\n");
      out.write("                          </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                          <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-shopping-cart text-green\"></i> 25 sales made\r\n");
      out.write("                          </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                          <a href=\"#\">\r\n");
      out.write("                            <i class=\"fa fa-user text-red\"></i> You changed your username\r\n");
      out.write("                          </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                      </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li class=\"footer-ul text-center\"><a href=\"messageview\">View all</a></li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("              </li>\r\n");
      out.write("              \r\n");
      out.write("              <li class=\"nav-item dropdown  user-menu\">\r\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" href=\"http://example.com\" id=\"navbarDropdownMenuLink\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                  <img src=\"http://via.placeholder.com/160x160\" class=\"user-image\" alt=\"User Image\" >\r\n");
      out.write("                  <span class=\"hidden-xs\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n");
      out.write("                  <a class=\"dropdown-item\" href=\"index\">로그아웃</a>\r\n");
      out.write("                  <a class=\"dropdown-item\" href=\"#\">Another action</a>\r\n");
      out.write("                  <a class=\"dropdown-item\" href=\"#\">Something else here</a>\r\n");
      out.write("                </div>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("        </nav>\r\n");
      out.write("      </header>\r\n");
      out.write("      <div class=\"main\">\r\n");
      out.write("        <aside>\r\n");
      out.write("          <div class=\"sidebar left \">\r\n");
      out.write("            \r\n");
      out.write("            <ul class=\"list-sidebar bg-defoult\">\r\n");
      out.write("    \r\n");
      out.write("         \r\n");
      out.write("            <li> <a href=\"mode\" class=\"collapsed active\" > <i class=\"fa fa-users fa-3x\"></i> <span class=\"nav-label\">Change</span> </a></li>\r\n");
      out.write("         \r\n");
      out.write("              \r\n");
      out.write("            <li> <a href=\"group\"><i class=\"fa fa-plus fa-3x\"></i> <span class=\"nav-label\">GAdd</span></a> </li>\r\n");
      out.write("            <li> <a href=\"useradd\" class=\"collapsed active\" > <i class=\"fa fa-user-plus fa-3x\"></i> <span class=\"nav-label\">UAdd</span>  </a></li>\r\n");
      out.write("          <li> <a href=\"#\"><i class=\"fa fa-user-times fa-3x\"></i> <span class=\"nav-label\">Delete</span></a> </li>\r\n");
      out.write("          <li> <a href=\"logout\" class=\"collapsed active\" ><i class=\"fa fa-sign-out fa-3x\"></i> <span class=\"nav-label\">Signout</span></a></li>\r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("  \r\n");
      out.write("    </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    </aside>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-2\"></div>\r\n");
      out.write("\t\t\t<div class=\"col-10\">\r\n");
      out.write("\t\t\t\t<table class=\"table table-filter\">\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t");

							for (Groupvo vo : glist) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div name=\"chk\" class=\"ckbox\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" class=\"custom-control-input\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tid=\"checkbox1\"> <label for=\"checkbox1\"></label>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"#\" class=\"pull-left\"> <img\r\n");
      out.write("\t\t\t\t\t\t\t\t\tsrc=\"https://s3.amazonaws.com/uifaces/faces/twitter/fffabs/128.jpg\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"media-photo\">\r\n");
      out.write("\t\t\t\t\t\t\t</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"chat\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"media\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"media-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"media-meta pull-right\">Febrero 13, 2016</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h4 class=\"title\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
      out.print(vo.getGpin());
      out.write('	');
      out.write(':');
      out.write('	');
      out.print(vo.getName());
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"pull-right pagado\">(new)</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<p class=\"summary\">Recent Messages...</p>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div></td>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
		}		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container profile\" id='pro'>\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-sm-6\"></div>\r\n");
      out.write("\t\t\t<div class=\"col-lg-4 col-sm-6\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"card hovercard\">\r\n");
      out.write("\t\t\t\t\t<div class=\"cardheader\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"exit\" id=\"prodel\" onclick=\"prodel('pro')\">X</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"avatar\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<img alt=\"\" src=\"http://lorempixel.com/100/100/people/9/\">\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"info\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\t<a target=\"_blank\" href=\"https://scripteden.com/\">Script Eden</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"desc\">Passionate designer</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"desc\">Curious developer</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"desc\">Tech geek</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"bottom\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<a class=\"btnround btn btn-warning btn-sm\" rel=\"publisher\"\r\n");
      out.write("\t\t\t\t\t\t\thref=\"./profile.html\"> <i class=\"fa fa-behance\"></i>\r\n");
      out.write("\t\t\t\t\t\t</a> <br>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"desc\">profile edit</div>\r\n");
      out.write("\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container profile \" id=\"addmem\">\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-3\"></div>\r\n");
      out.write("\t\t\t<div class=\"col-sm-6 addmember\">\r\n");
      out.write("\t\t\t\t<form class=\"text-center\">\r\n");
      out.write("\t\t\t\t\t<h2>추가할사람의 코드를 입력해주세요</h2>\r\n");
      out.write("\t\t\t\t\t<input class=\"form-control form-control-lg\" type=\"text\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"코드를 입력해주세요\"> <br>\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">추가</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\"\r\n");
      out.write("\t\t\t\t\t\tonclick=\"prodel('addmem')\">취소</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Optional JavaScript -->\r\n");
      out.write("\t<!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</body>\r\n");
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
