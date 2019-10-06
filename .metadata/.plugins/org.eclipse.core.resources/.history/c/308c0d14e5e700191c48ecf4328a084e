<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="com.chat.graduated.vo.Groupvo"%>
<%@page import="com.chat.graduated.model.Grouplist"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">

<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link rel="stylesheet" href="/resources/group.css">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<style>
</style>
<%
	String userid = (String) session.getAttribute("id"); //세션에서 아이디얻어옴
	//if(userid==null){System.out.println("세션 ㄴㄴ");}
	//else{System.out.println("세션 =="+ userid);}

	Groupvo gvo = new Groupvo();
	Grouplist model = new Grouplist();
	//Groupvo sample = model.groupex(userid);

	//System.out.println(sample.getName());
	List<Groupvo> glist = model.grouplist(userid);
%>


<script>
	function test() {
		var con = document.getElementsByName("chk");
		for (var i = 0; i < con.length; i++) {
			if (con[i].style.display == 'none') {
				con[i].style.display = 'block';
			} else {
				con[i].style.display = 'none';
			}
		}
	}
	function profile(aa) {

		var con = document.getElementById(aa);
		con.style.display = 'block';

	}

	function prodel(aa) {
		var con = document.getElementById(aa);
		con.style.display = 'none';
	}
</script>
</head>
<body>
	<%@include file="./sidebar.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col-2"></div>
			<div class="col-10">
				<table class="table table-filter">
					<tbody>
						<%
							for (Groupvo vo : glist) {
						%>
						<tr>
							<td>
								<div name="chk" class="ckbox">
									<input type="checkbox" class="custom-control-input"
										id="checkbox1"> <label for="checkbox1"></label>
								</div>
							</td>
							<td><a href="#" class="pull-left"> <img
									src="https://s3.amazonaws.com/uifaces/faces/twitter/fffabs/128.jpg"
									class="media-photo">
							</a></td>
							<td><a href="chat?pin=<%=vo.getPin()%>">
									<div class="media">

										<div class="media-body">
											<span class="media-meta pull-right">Febrero 13, 2016</span>
											<h4 class="title">

												<%=vo.getGpin()%>	:	<%=vo.getName()%>
												<span class="pull-right pagado">(new)</span>
											</h4>
											<p class="summary">Recent Messages...</p>
										</div>
									</div></td>
							</a>
						</tr>

						<%		}		%>

					</tbody>
				</table>

			</div>
		</div>

	</div>

	<div class="container profile" id='pro'>
		<div class="row">
			<div class="col-lg-4 col-sm-6"></div>
			<div class="col-lg-4 col-sm-6">

				<div class="card hovercard">
					<div class="cardheader">
						<div class="exit" id="prodel" onclick="prodel('pro')">X</div>
					</div>
					<div class="avatar">

						<img alt="" src="http://lorempixel.com/100/100/people/9/">
					</div>
					<div class="info">
						<div class="title">
							<a target="_blank" href="https://scripteden.com/">Script Eden</a>
						</div>
						<div class="desc">Passionate designer</div>
						<div class="desc">Curious developer</div>
						<div class="desc">Tech geek</div>
					</div>
					<div class="bottom">

						<a class="btnround btn btn-warning btn-sm" rel="publisher"
							href="./profile.html"> <i class="fa fa-behance"></i>
						</a> <br>
						<div class="desc">profile edit</div>
						<br>
					</div>
				</div>

			</div>

		</div>
	</div>


	<div class="container profile " id="addmem">
		<div class="row">
			<div class="col-sm-3"></div>
			<div class="col-sm-6 addmember">
				<form class="text-center">
					<h2>추가할사람의 코드를 입력해주세요</h2>
					<input class="form-control form-control-lg" type="text"
						placeholder="코드를 입력해주세요"> <br>
					<button type="submit" class="btn btn-primary">추가</button>
					<button type="submit" class="btn btn-primary"
						onclick="prodel('addmem')">취소</button>
				</form>
			</div>
		</div>
	</div>
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
		integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
		integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
		crossorigin="anonymous"></script>

</body>
</body>
</html>