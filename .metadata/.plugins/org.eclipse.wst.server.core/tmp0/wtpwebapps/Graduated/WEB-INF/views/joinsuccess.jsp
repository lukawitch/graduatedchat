<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!Doctype html>
<html>
<head>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<style>
.box_bg {
    height: 90vh; /*vh은 %게념과 비슷하다. 다만 %는 직개 부모 에도 %가 선언되어 있어야 한다면, vh은 나자신의 기준으로 커지는 것이다.*/

}
.table {
    width: 100%;
    height: 90vh;
    color: #fff;
    display: table; /*display 성질을 table롤 바꾸어 줘야 한다.*/
}
.table_cell {
    display: table-cell; /* 그 밑에 직개 자식에는 display 성질을 table-cell으로 바꾸어 줘야 한다.*/
    vertical-align: middle;  /*table에 관한 수직정렬 속성 top, middle, bottom 3가지가 있다.*/
    text-align: center;
    position: relative;
}
.table_cell p:nth-child(1) {
    width: 350px;
    margin: 0 auto;
}
.table_cell p:nth-child(2) {
    margin-top: 15%;
}
.table_cell p:nth-child(2) a {
    font-weight: 600;
}
	</style>

</head>
<body>
<div class="box_bg">
    
        
           <div class="table">
               <div class="table_cell"> 
                  <img src="/resources/finish.png" class="rounded mx-auto d-block" alt="..."  >
                  <a class="btn btn-outline-success" rel="publisher" href="/">돌아가기</a>
				<!-- <button type="button" class="btn btn-outline-success" onclick="location.href='' "></button> --> 
               </div>
            </div>
      
  
</div>




 <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>

</html>