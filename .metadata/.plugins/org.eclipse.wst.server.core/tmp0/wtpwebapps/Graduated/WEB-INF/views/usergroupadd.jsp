<%@page import="com.chat.graduated.vo.Groupvo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c"  uri="http://java.sun.com/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<style>
</style>
</head>
<body>
<main class="login-form">
    <div class="cotainer">
        <div class="row justify-content-center">
            <div class="col-md-8">
                <div class="card">
                    <div class="card-header">UserAdd</div>
                    <div class="card-body">
                       
					   <div class="row">
                                <div class="col-md-6">
                                <form action="centerchk" method="get">
                                    <select class="form-control" name="check">
										  <option>Default select</option>
										   <%
					List<Groupvo> grouplist=(List<Groupvo>)session.getAttribute("grouplist");
                    if(grouplist==null){
                    	
                    
                    %>
					
					<%}
                    else{
                    	for(int i=0;i<grouplist.size();i++){
                    		
                    	
                    
                    %>
                    <option value=<%=grouplist.get(i).getName() %>><%=grouplist.get(i).getName() %></option>
                    <%
                    	}}
                    %>
										</select>
                                </div>
                            

                          

                           

                            <div class="col-md-6">
                             <input type="submit"  class="btn btn-primary"/>
                               </div> 
                            </div>
                    </div>
                    </form>
                    <div>
 
                   <h3> 	</h3>

                                  
                    </div>
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