/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.1
 * Generated at: 2019-10-09 05:28:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.chat.graduated.model.Anniversary;
import com.chat.graduated.vo.CalenderVo;
import java.util.Calendar;
import com.chat.graduated.model.Lun;
import com.chat.graduated.vo.GetGroupMember;
import java.util.ArrayList;

public final class calender_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/views/./sidebar.jsp", Long.valueOf(1570597745211L));
    _jspx_dependants.put("jar:file:/C:/Users/hestia/Desktop/chattest/graduated/graduatedchat/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Graduated/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1564482954169L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.chat.graduated.model.Lun");
    _jspx_imports_classes.add("java.util.Calendar");
    _jspx_imports_classes.add("com.chat.graduated.vo.GetGroupMember");
    _jspx_imports_classes.add("com.chat.graduated.vo.CalenderVo");
    _jspx_imports_classes.add("com.chat.graduated.model.Anniversary");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write(" \r\n");
      out.write("   <head>\r\n");
      out.write("   <style>\r\n");
      out.write("body {\r\n");
      out.write("    font-family: Tahoma;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#calendar {\r\n");
      out.write("    width: 100%;    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#calendar a {\r\n");
      out.write("    color: #8e352e;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#calendar ul {\r\n");
      out.write("    list-style: none;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#calendar li {\r\n");
      out.write("    display: block;\r\n");
      out.write("    float: left;\r\n");
      out.write("    width:14.342%;\r\n");
      out.write("    padding: 5px;\r\n");
      out.write("    box-sizing:border-box;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    margin-right: -1px;\r\n");
      out.write("    margin-bottom: -1px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#calendar ul.weekdays {\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    background: #8e352e;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#calendar ul.weekdays li {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    line-height: 20px;\r\n");
      out.write("    border: none !important;\r\n");
      out.write("    padding: 10px 6px;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    font-size: 13px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#calendar .days li {\r\n");
      out.write("    height: 180px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#calendar .days li:hover {\r\n");
      out.write("    background: #d3d3d3;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#calendar .date {\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    margin-bottom: 5px;\r\n");
      out.write("    padding: 4px;\r\n");
      out.write("    background: #333;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    width: 20px;\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("    float: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#calendar .event {\r\n");
      out.write("    clear: both;\r\n");
      out.write("    display: block;\r\n");
      out.write("    font-size: 13px;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    padding: 5px;\r\n");
      out.write("    margin-top: 40px;\r\n");
      out.write("    margin-bottom: 5px;\r\n");
      out.write("    line-height: 14px;\r\n");
      out.write("    background: #e4f2f2;\r\n");
      out.write("    border: 1px solid #b5dbdc;\r\n");
      out.write("    color: #009aaf;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#calendar .event-desc {\r\n");
      out.write("    color: #666;\r\n");
      out.write("    margin: 3px 0 7px 0;\r\n");
      out.write("    text-decoration: none;  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#calendar .other-month {\r\n");
      out.write("    background: #f5f5f5;\r\n");
      out.write("    color: #666;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* ============================\r\n");
      out.write("                Mobile Responsiveness\r\n");
      out.write("   ============================*/\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("@media(max-width: 768px) {\r\n");
      out.write("\r\n");
      out.write("    #calendar .weekdays, #calendar .other-month {\r\n");
      out.write("        display: none;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #calendar li {\r\n");
      out.write("        height: auto !important;\r\n");
      out.write("        border: 1px solid #ededed;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("        margin-bottom: -1px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    #calendar .date {\r\n");
      out.write("        float: none;\r\n");
      out.write("    }\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("   </head>\r\n");

    Calendar cal = Calendar.getInstance();
    int year = request.getParameter("y") == null ? cal.get(Calendar.YEAR) : Integer.parseInt(request.getParameter("y"));
    int month = request.getParameter("m") == null ? cal.get(Calendar.MONTH) : (Integer.parseInt(request.getParameter("m")) - 1);

    // 시작요일 확인
    // - Calendar MONTH는 0-11까지임
    cal.set(year, month, 1);
    int bgnWeek = cal.get(Calendar.DAY_OF_WEEK);

    // 다음/이전월 계산
    // - MONTH 계산시 표기월로 계산하기 때문에 +1을 한 상태에서 계산함
    int prevYear = year;
    int prevMonth = (month + 1) - 1;
    int nextYear = year;
    int nextMonth = (month  + 1) + 1;

    // 1월인 경우 이전년 12월로 지정
    if (prevMonth < 1) {
        prevYear--;
        prevMonth = 12;
    }

    // 12월인 경우 다음년 1월로 지정
    if (nextMonth > 12) {
        nextYear++;
        nextMonth = 1;
    }
 

      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("                   <!--<ul class=\"dropdown-menu-over list-unstyled\">\r\n");
      out.write("                      <li class=\"header-ul text-center\">You have 4 messages</li>\r\n");
      out.write("                      <li>\r\n");
      out.write("                     \r\n");
      out.write("                        <ul class=\"menu list-unstyled\">\r\n");
      out.write("                          <li>\r\n");
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
      out.write("                        \r\n");
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
      out.write("                  </ul> --> \r\n");
      out.write("                  <div class=\"container\">\r\n");
      out.write("    <div class=\"row col-md-6 col-md-offset-2 custyle\">\r\n");
      out.write("    <table class=\"table table-striped custab\">\r\n");
      out.write("    <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("           \r\n");
      out.write("            <th>Touser</th>\r\n");
      out.write("            <th>Group</th>\r\n");
      out.write("            <th class=\"text-center\">Action</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </thead>\r\n");
      out.write("    ");

					ArrayList<GetGroupMember> list= new ArrayList<GetGroupMember>(); 
					list = (ArrayList<GetGroupMember>)session.getAttribute("groupaccept");
					
		            if(list.isEmpty()){
		            }	
		            else{
					for(int i=0;i<list.size();i++){
					
      out.write("\r\n");
      out.write("            <tr>\r\n");
      out.write("               \r\n");
      out.write("                <td>");
      out.print(list.get(i).getTouser() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(list.get(i).getGroupname() );
      out.write("</td>\r\n");
      out.write("                <td class=\"text-center\"><a class='btn btn-info btn-xs' href=\"accept?state=apply&group=");
      out.print(list.get(i).getGroupname() );
      out.write("\"><span class=\"glyphicon glyphicon-edit\"></span>apply</a> <a href=\"#\" class=\"btn btn-danger btn-xs\"><span class=\"glyphicon glyphicon-remove\"></span> Del</a></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
}} 
      out.write("\r\n");
      out.write("           \r\n");
      out.write("    </table>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
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
      out.write("            <li> <a href=\"makegroup\"><i class=\"fa fa-plus fa-3x\"></i> <span class=\"nav-label\">GAdd</span></a> </li>\r\n");
      out.write("            <li> <a href=\"useradd\" class=\"collapsed active\" > <i class=\"fa fa-user-plus fa-3x\"></i> <span class=\"nav-label\">UAdd</span>  </a></li>\r\n");
      out.write("          <li> <a href=\"#\"><i class=\"fa fa-user-times fa-3x\"></i> <span class=\"nav-label\">Delete</span></a> </li>\r\n");
      out.write("          <li> <a href=\"index\" class=\"collapsed active\" ><i class=\"fa fa-sign-out fa-3x\"></i> <span class=\"nav-label\">Signout</span></a></li>\r\n");
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
      out.write("<div id=\"calendar-wrap\">\r\n");
      out.write(" <header>\r\n");
      out.write("      <h1><a href=\"?y=");
      out.print(prevYear);
      out.write('&');
      out.write('m');
      out.write('=');
      out.print(prevMonth);
      out.write("\">◁</a> ");
      out.print(year);
      out.write('년');
      out.write(' ');
      out.print(month+1);
      out.write("월 <a href=\"?y=");
      out.print(nextYear);
      out.write('&');
      out.write('m');
      out.write('=');
      out.print(nextMonth);
      out.write("\">▷</a></h1>\r\n");
      out.write(" </header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"calendar\">\r\n");
      out.write(" <ul class=\"weekdays\">\r\n");
      out.write("                    <li>Sunday</li>\r\n");
      out.write("                    <li>Monday</li>\r\n");
      out.write("                    <li>Tuesday</li>\r\n");
      out.write("                    <li>Wednesday</li>\r\n");
      out.write("                    <li>Thursday</li>\r\n");
      out.write("                    <li>Friday</li>\r\n");
      out.write("                    <li>Saturday</li>\r\n");
      out.write(" </ul>\r\n");
      out.write("<ul class=\"days\">\r\n");


Lun lun = new Lun();
CalenderVo item = new CalenderVo();
	String m;
String y=String.valueOf(cal.get(Calendar.YEAR));
String d;
if(cal.get(Calendar.MONTH)+1>9){
m=String.valueOf(cal.get(Calendar.MONTH)+1);}
else{
	m=0+String.valueOf(cal.get(Calendar.MONTH)+1);
}
if(cal.get(Calendar.DATE)>9){
d=String.valueOf(cal.get(Calendar.DATE));}
else{
	d=0+String.valueOf(cal.get(Calendar.DATE));
}

System.out.println(y);
System.out.println(m);
System.out.println(d);
item=lun.getitem(y,m,d);
System.out.println(item.getGanG());
    // 시작요일까지 이동
    for (int i=1; i<bgnWeek; i++) out.println(" <li class='day'><div class='date'>&nbsp</div></li>");

    // 첫날~마지막날까지 처리
    // - 날짜를 하루씩 이동하여 월이 바뀔때까지 그린다
    while (cal.get(Calendar.MONTH) == month) {
    	 y=String.valueOf(cal.get(Calendar.YEAR));
   
    	if(cal.get(Calendar.MONTH)+1>9){
    	m=String.valueOf(cal.get(Calendar.MONTH)+1);}
    	else{
    		m=0+String.valueOf(cal.get(Calendar.MONTH)+1);
    	}
    	if(cal.get(Calendar.DATE)>9){
    	d=String.valueOf(cal.get(Calendar.DATE));}
    	else{
    		d=0+String.valueOf(cal.get(Calendar.DATE));
    	}
		Anniversary anni = new Anniversary();
    	item=lun.getitem(y,m,d);
    	String ani=anni.Anistatic(cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE));
        out.println("<li class='day'><div class='date'>" + cal.get(Calendar.DATE) + "</div><div>"+item.getGanG()+"<span>"+item.getMon()+"."+item.getDay()+"</span> </div><div></div>"+ani+"</li>");

        // 토요일인 경우 다음줄로 생성
        if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) out.println("</ul><ul class='days'>");

        // 날짜 증가시키지
        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE)+1);
    }

    // 끝날부터 토요일까지 빈칸으로 처리
    for (int i=cal.get(Calendar.DAY_OF_WEEK); i<=7; i++) out.println(" <li class='day'><div class='date'>&nbsp</div></li>");

      out.write("\r\n");
      out.write("       \r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
