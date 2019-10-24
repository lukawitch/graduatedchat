<%@page import="com.chat.graduated.vo.GetGroupMember"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<link rel="stylesheet" href="resources/sidebar.css">

<header class="header">
	<nav class="navbar navbar-toggleable-md navbar-light pt-0 pb-0 ">
		<button class="navbar-toggler navbar-toggler-right" type="button"
			data-toggle="collapse" data-target="#navbarNavDropdown"
			aria-controls="navbarNavDropdown" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<a class="navbar-brand p-0 mr-5" href="#" style="visibility: hidden"><img
			src="http://via.placeholder.com/61x14"></a>
		<div class="float-left">
			<a href="#" class="button-left"><span class="fa fa-fw fa-bars "
				style="visibility: hidden"></span></a>
		</div>
		<div class="collapse navbar-collapse flex-row-reverse"
			id="navbarNavDropdown">
			<ul class="navbar-nav">
				<li class="nav-item dropdown messages-menu"><a
					class="nav-link dropdown-toggle" href="main"> <i
						class="fa fa-home" aria-hidden="true"></i>
				</a></li>
				<li class="nav-item dropdown messages-menu"><a
					class="nav-link dropdown-toggle" href="calender"> <i
						class="fa fa-calendar-check-o" aria-hidden="true"></i> <span
						class="label label-success bg-success">10</span>
				</a></li>
				<li class="nav-item dropdown messages-menu"><a
					class="nav-link dropdown-toggle" href="http://example.com"
					id="navbarDropdownMenuLink" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false"> <i
						class="fa fa-bell-o"></i> <span
						class="label label-success bg-success">10</span>
				</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">

						<div class="container">
							<div class="row col-md-6 col-md-offset-2 custyle">
								<table class="table table-striped custab">
									<thead>
										<tr>

											<th>Touser</th>
											<th>Group</th>
											<th class="text-center">Action</th>
										</tr>
									</thead>
							<%-- 		<%
										ArrayList<GetGroupMember> list = new ArrayList<GetGroupMember>();
										list = (ArrayList<GetGroupMember>) session.getAttribute("groupaccept");

										if (list.isEmpty()) {
											System.out.println("groupaccept 비었다");
											
										} else {
											for (int i = 0; i < list.size(); i++) {
												if (list.get(i).getState().equals("apply")) {
													System.out.println("apply 어쩌구 if 조건");
												} else {
									%> 
									<tr>

										<td><%=list.get(i).getTouser()%></td>
										<td><%=list.get(i).getGroupname()%></td>
										<td class="text-center"><a class='btn btn-info btn-xs'
											href="accept?state=apply&group=<%=list.get(i).getGroupname()%>"><span
												class="glyphicon glyphicon-edit"></span>apply</a> <a href="#"
											class="btn btn-danger btn-xs"><span
												class="glyphicon glyphicon-remove"></span> Del</a></td>
									</tr>
									<%
										}
											}
										}
									%>
--%>
								</table>
							</div>
						</div>
					</div></li>
				<li class="nav-item dropdown notifications-menu"><a
					class="nav-link dropdown-toggle" href="http://example.com"
					id="navbarDropdownMenuLink" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false"> <i
						class="fa fa-envelope-o"></i> <span
						class="label label-warning bg-warning">10</span>
				</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
						<ul class="dropdown-menu-over list-unstyled">
							<li class="header-ul text-center">You have 10 notifications</li>
							<li>
								<!-- inner menu: contains the actual data -->
								<ul class="menu list-unstyled">
									<li><a href="#"> <i class="fa fa-users text-aqua"></i>
											5 new members joined today
									</a></li>
									<li><a href="#"> <i class="fa fa-warning text-yellow"></i>
											Very long description here that may not fit into the page and
											may cause design problems
									</a></li>
									<li><a href="#"> <i class="fa fa-users text-red"></i>
											5 new members joined
									</a></li>
									<li><a href="#"> <i
											class="fa fa-shopping-cart text-green"></i> 25 sales made
									</a></li>
									<li><a href="#"> <i class="fa fa-user text-red"></i>
											You changed your username
									</a></li>
								</ul>
							</li>
							<li class="footer-ul text-center"><a href="messageview">View
									all</a></li>
						</ul>
					</div></li>

				<li class="nav-item dropdown  user-menu"><a
					class="nav-link dropdown-toggle" href="http://example.com"
					id="navbarDropdownMenuLink" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false"> <img
						src="http://via.placeholder.com/160x160" class="user-image"
						alt="User Image"> <span class="hidden-xs">${name}</span>
				</a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
						<a class="dropdown-item" href="index">로그아웃</a> <a
							class="dropdown-item" href="#">Another action</a> <a
							class="dropdown-item" href="#">Something else here</a>
					</div></li>
			</ul>
		</div>
	</nav>
</header>
<div class="main">
	<aside>
		<div class="sidebar left ">

			<ul class="list-sidebar bg-defoult">


				<li><a href="mode" class="collapsed active"> <i
						class="fa fa-users fa-3x"></i> <span class="nav-label">Change</span>
				</a></li>


				<li><a href="makegroup"><i class="fa fa-plus fa-3x"></i> <span
						class="nav-label">GAdd</span></a></li>
				<li><a href="useradd" class="collapsed active"> <i
						class="fa fa-user-plus fa-3x"></i> <span class="nav-label">UAdd</span>
				</a></li>
				<li><a href="#"><i class="fa fa-user-times fa-3x"></i> <span
						class="nav-label">Delete</span></a></li>
				<li><a href="index" class="collapsed active"><i
						class="fa fa-sign-out fa-3x"></i> <span class="nav-label">Signout</span></a></li>



			</ul>
		</div>
	</aside>
</div>

