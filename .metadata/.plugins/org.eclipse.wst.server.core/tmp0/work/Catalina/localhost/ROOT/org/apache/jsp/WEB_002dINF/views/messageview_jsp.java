/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2019-06-09 05:59:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class messageview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/./sidebar.jsp", Long.valueOf(1559883934194L));
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
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n");
      out.write("<style>\r\n");
      out.write(".custab{\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    padding: 5px;\r\n");
      out.write("    margin: 5% 0;\r\n");
      out.write("    box-shadow: 3px 3px 2px #ccc;\r\n");
      out.write("    transition: 0.5s;\r\n");
      out.write("    }\r\n");
      out.write(".custab:hover{\r\n");
      out.write("    box-shadow: 3px 3px 0px transparent;\r\n");
      out.write("    transition: 0.5s;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
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
      out.write("                  <a class=\"nav-link dropdown-toggle\" href=\"success\">\r\n");
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
      out.write("                  <a class=\"dropdown-item\" href=\"#\">Action</a>\r\n");
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
      out.write("            <li> <a href=\"personal\" class=\"collapsed active\" > <i class=\"fa fa-users fa-3x\"></i> <span class=\"nav-label\">Change</span> </a></li>\r\n");
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
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("<div class=\"col-2\"></div>\r\n");
      out.write("\t\t\t<div class=\"col-10\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<div class=\"row\">\r\n");
      out.write("    \t\t<div class=\"col-md-1\"></div>\r\n");
      out.write("    <div class=\"col-md-10 col-md-offset-2 custyle\">\r\n");
      out.write("    <table class=\"table table-striped custab\">\r\n");
      out.write("    <thead>\r\n");
      out.write("   \r\n");
      out.write("        <tr>\r\n");
      out.write("            <th>번호</th>\r\n");
      out.write("            <th>ID(이름)</th>\r\n");
      out.write("            <th>그룹이름</th>\r\n");
      out.write("            <th class=\"text-center\">수락/거절</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>1</td>\r\n");
      out.write("                <td>Honggill(홍길동)</td>\r\n");
      out.write("                <td>모임1</td>\r\n");
      out.write("                <td class=\"text-center\"><a class='btn btn-info btn-xs' href=\"#\"><span class=\"glyphicon glyphicon-edit\"></span> 수락</a> <a href=\"#\" class=\"btn btn-danger btn-xs\"><span class=\"glyphicon glyphicon-remove\"></span> 거절</a></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>2</td>\r\n");
      out.write("                <td>Products</td>\r\n");
      out.write("                <td>Main Products</td>\r\n");
      out.write("                <td class=\"text-center\"><a class='btn btn-info btn-xs' href=\"#\"><span class=\"glyphicon glyphicon-edit\"></span> 수락</a> <a href=\"#\" class=\"btn btn-danger btn-xs\"><span class=\"glyphicon glyphicon-remove\"></span> 거절</a></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <td>3</td>\r\n");
      out.write("                <td>Blogs</td>\r\n");
      out.write("                <td>Parent Blogs</td>\r\n");
      out.write("                <td class=\"text-center\"><a class='btn btn-info btn-xs' href=\"#\"><span class=\"glyphicon glyphicon-edit\"></span> 수락</a> <a href=\"#\" class=\"btn btn-danger btn-xs\"><span class=\"glyphicon glyphicon-remove\"></span> 거절</a></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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