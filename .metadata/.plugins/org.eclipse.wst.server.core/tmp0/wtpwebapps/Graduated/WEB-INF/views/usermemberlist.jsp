<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.chat.graduated.vo.Uservo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<style>

  @keyframes check {0% {height: 0;width: 0;}
    25% {height: 0;width: 10px;}
    50% {height: 20px;width: 10px;}
  }
  .checkbox{background-color:#fff;display:inline-block;height:28px;margin:0 .25em;width:28px;border-radius:4px;border:1px solid #ccc;float:left}
  .checkbox span{display:block;height:28px;position:relative;width:28px;padding:0}
  .checkbox span:after{-moz-transform:scaleX(-1) rotate(135deg);-ms-transform:scaleX(-1) rotate(135deg);-webkit-transform:scaleX(-1) rotate(135deg);transform:scaleX(-1) rotate(135deg);-moz-transform-origin:left top;-ms-transform-origin:left top;-webkit-transform-origin:left top;transform-origin:left top;border-right:4px solid #fff;border-top:4px solid #fff;content:'';display:block;height:20px;left:3px;position:absolute;top:15px;width:10px}
  .checkbox span:hover:after{border-color:#999}
  .checkbox input{display:none}
  .checkbox input:checked + span:after{-webkit-animation:check .8s;-moz-animation:check .8s;-o-animation:check .8s;animation:check .8s;border-color:#555}
.checkbox input:checked + .default:after{border-color:#444}
.checkbox input:checked + .primary:after{border-color:#2196F3}
.checkbox input:checked + .success:after{border-color:#8bc34a}
.checkbox input:checked + .info:after{border-color:#3de0f5}
.checkbox input:checked + .warning:after{border-color:#FFC107}
.checkbox input:checked + .danger:after{border-color:#f44336}

</style>
</head>
<body>
<main class="login-form">
    <div class="cotainer">
        <div class="row justify-content-center">
            <div class="col-md-8">
            <form method="post" action="getfriendlist">
                <div class="card">
                    <div class="card-header">친구 목록
                    <input type="submit" class="btn btn-outline-info" style="float:right" value="check"></div>
                    <div class="card-body">

  <table class="table table-hover">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">ID</th>
      <th scope="col">Name</th>
		<th scope="col">check</th>
    </tr>
  </thead>
  <tbody>
    <!--  <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>

    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>

    </tr>-->
 
  

    <%
    ArrayList<Uservo> hihi=(ArrayList)session.getAttribute("list");
    String id= (String)session.getAttribute("id");
    System.out.println(id);
    for(int i=0;i<hihi.size();i++){%>

        
   <tr><td>  <%=i+1 %></td>
   <td>  <%=hihi.get(i).getId() %></td>
   <td>  <%=hihi.get(i).getName() %></td>
   <td> 
          <label class="checkbox">
          <input type="checkbox" name="check" value="<%=hihi.get(i).getId() %>"/>
          <span class="danger"></span>
           </label></td></tr>
       
  
    
 <%   }
    %>
  </form>

  </tbody>
</table>

                </div>
            </div>
        </div>
    </div>
    </div>

</main>
</body>
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</html>