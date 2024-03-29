<%@page import="com.chat.graduated.model.Anniversary"%>
<%@page import="com.chat.graduated.vo.CalenderVo"%>
<%@page import="java.util.Calendar"%>
<%@page import="com.chat.graduated.model.Lun"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 
   <head>
   <style>
body {
    font-family: Tahoma;
}

header {
    text-align: center;
}

#calendar {
    width: 100%;    
}

#calendar a {
    color: #8e352e;
    text-decoration: none;
}

#calendar ul {
    list-style: none;
    padding: 0;
    margin: 0;
    width: 100%;
}

#calendar li {
    display: block;
    float: left;
    width:14.342%;
    padding: 5px;
    box-sizing:border-box;
    border: 1px solid #ccc;
    margin-right: -1px;
    margin-bottom: -1px;
}

#calendar ul.weekdays {
    height: 40px;
    background: #8e352e;
}

#calendar ul.weekdays li {
    text-align: center;
    text-transform: uppercase;
    line-height: 20px;
    border: none !important;
    padding: 10px 6px;
    color: #fff;
    font-size: 13px;
}

#calendar .days li {
    height: 180px;
}

#calendar .days li:hover {
    background: #d3d3d3;
}

#calendar .date {
    text-align: center;
    margin-bottom: 5px;
    padding: 4px;
    background: #333;
    color: #fff;
    width: 20px;
    border-radius: 50%;
    float: right;
}

#calendar .event {
    clear: both;
    display: block;
    font-size: 13px;
    border-radius: 4px;
    padding: 5px;
    margin-top: 40px;
    margin-bottom: 5px;
    line-height: 14px;
    background: #e4f2f2;
    border: 1px solid #b5dbdc;
    color: #009aaf;
    text-decoration: none;
}

#calendar .event-desc {
    color: #666;
    margin: 3px 0 7px 0;
    text-decoration: none;  
}

#calendar .other-month {
    background: #f5f5f5;
    color: #666;
}

/* ============================
                Mobile Responsiveness
   ============================*/


@media(max-width: 768px) {

    #calendar .weekdays, #calendar .other-month {
        display: none;
    }

    #calendar li {
        height: auto !important;
        border: 1px solid #ededed;
        width: 100%;
        padding: 10px;
        margin-bottom: -1px;
    }

    #calendar .date {
        float: none;
    }
}
</style>
   </head>
<%
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
 
%>
<body>
<%@include file="./sidebar.jsp" %>
<div class="container">
	<div class="row">
<div class="col-2"></div>
			<div class="col-10">
<div id="calendar-wrap">
 <header>
      <h1><a href="?y=<%=prevYear%>&m=<%=prevMonth%>">◁</a> <%=year%>년 <%=month+1%>월 <a href="?y=<%=nextYear%>&m=<%=nextMonth%>">▷</a></h1>
 </header>


<div id="calendar">
 <ul class="weekdays">
                    <li>Sunday</li>
                    <li>Monday</li>
                    <li>Tuesday</li>
                    <li>Wednesday</li>
                    <li>Thursday</li>
                    <li>Friday</li>
                    <li>Saturday</li>
 </ul>
<ul class="days">
<%

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
%>
       
</div>
</div>
</div>
</div>
</div>

</body>
</html>