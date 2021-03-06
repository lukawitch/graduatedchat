<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<style>
	  body,html{
			height: 100%;
			margin: 0;
			background: #7F7FD5;
	       background: -webkit-linear-gradient(to right, #91EAE4, #86A8E7, #7F7FD5);
	        background: linear-gradient(to right, #91EAE4, #86A8E7, #7F7FD5);
		}
		.addon {
background: #fff;
border: 1px solid #C0CAE3;
margin-bottom: 20px;
border-radius: 3px;
-moz-border-radius: 3px;
-webkit-border-radius: 3px;
}
.addon li {
padding: 10px;
border-top: 1px solid #eee;
overflow: hidden;
}
.addon li {
list-style:none;
}

.clearfix {
display: block;
}
.clearfix:after {
content: " ";
display: block;
height: 0;
clear: both;
visibility: hidden;
overflow: hidden;
}

li {
display: list-item;
text-align: -webkit-match-parent;
} ul {
margin: 0;
padding: 0;
border: 0;
font-size: 100%;
font: inherit;
vertical-align: baseline;
}
 ul {
list-style: none;
}
.round {
border-radius:100%;
  display: block;
height: 48px;
width: 49px;
float: left;
}
.addon li em {
background: url(http://d1dls1ko4h0b59.cloudfront.net/assets/campaign-legend-d95e12bce50a8e18d8bd3c96383c352f.png) no-repeat;
display: block;
height: 48px;
width: 49px;
float: left;
}
.addon li em.extra {
background-position: -118px 0;
}
.addon li em.hot {
background-position: -58px 0;
}
.addon p {
padding: 10px 15px;
margin: 0;
font: 600 16px/22px "myriad-pro",Arial,"Helvetica Neue",Helvetica,sans-serif;
}
p {
display: block;
-webkit-margin-before: 1em;
-webkit-margin-after: 1em;
-webkit-margin-start: 0px;
-webkit-margin-end: 0px;
}

.addon li .legend-info {
float: left;
margin-left: 10px;
width: 155px;
}

.addon strong {
display: block;
margin: 0 0 4px;
}

strong {
font-weight: bold;
}
</style>
	<script>
function showdel(aa){
 var con = document.getElementById(aa);
 if( con.style.display == 'block'){
  con.style.display = 'none';
 }
 else{
  con.style.display = 'block';
 }
}
</script>
</head>
<body>
<%@include file="./sidebar.jsp" %>
 <div class="container">
	<div class="row">
<div class="col-2"></div>
			<div class="col-10">
			<div class="addon">
<ul>
            <li class="clearfix">
              <a href="profile">
              <img class="round" src="https://8share-production-my.s3.amazonaws.com/campaigns/4898/photos/profile/thumb_copy.png?1397732185">
              <div class="legend-info">
                <strong>내자신</strong>상태메세지
                </div></a>
              </li>
			  </ul>
			  </div>
<div class="addon">

			  
          <p onclick="showdel('aa')">그룹1</p>
          <ul id='aa'>
            <li class="clearfix">
              <a href="personalchat" target="_blank">
              <img class="round" src="https://8share-production-my.s3.amazonaws.com/campaigns/4898/photos/profile/thumb_copy.png?1397732185">
              <div class="legend-info">
                <strong>Social Good</strong>Help share a cause and do good.
                </div></a>
              </li>
            <li class="clearfix">
              <em class="hot"></em>
              <div class="legend-info">
                <strong>Fire Hot</strong>Featured hot special at the moment.
              </div>
            </li>
            <li class="clearfix">
              <em class="extra"></em>
              <div class="legend-info">
                <strong>Extra Fun</strong>Contests, surveys, prizes and more fun stuff.
              </div>
            </li>
          </ul>
        </div>
		<div class="addon">
          <p onclick="showdel('bb')">그룹2</p>
          <ul id='bb'>
            <li class="clearfix">
              <a href="#" target="_blank">
              <img class="round" src="https://8share-production-my.s3.amazonaws.com/campaigns/4898/photos/profile/thumb_copy.png?1397732185">
              <div class="legend-info">
                <strong>Social Good</strong>Help share a cause and do good.
                </div></a>
              </li>
            <li class="clearfix">
              <em class="hot"></em>
              <div class="legend-info">
                <strong>Fire Hot</strong>Featured hot special at the moment.
              </div>
            </li>
            <li class="clearfix">
              <em class="extra"></em>
              <div class="legend-info">
                <strong>Extra Fun</strong>Contests, surveys, prizes and more fun stuff.
              </div>
            </li>
          </ul>
        </div>
</div>
</div>
</div>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>