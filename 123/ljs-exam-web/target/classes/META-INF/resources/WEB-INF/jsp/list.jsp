<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel = "stylesheet"  href = "<%=request.getContextPath()%>/css/index3.css"> 
</head>
<body>
<form action="list" method="get">
<table>
	<tr>
	
		<td colspan="11">
			姓名:<input type="text" name="cname">
			违纪事项:<input type="text" name="doing">
			处理人:<input type="text" name="people">
			<input type="button" value="查询" onclick="submit()">
		</td>
	</tr>
	<tr>
	<td>编号</td>
	<td>姓名</td>
	<td>事故/违纪</td>
	<td>处理/扣分</td>
	<td>处理结果</td>
	<td>处理教师</td>
	<td>所属事故等级</td>
	<td>操作
		<input type="button" value="添加" onclick="addOne()">
	</td>
	</tr>
	<c:forEach items="${list }" var="e">
	<tr>
		<td>${e.uid }</td>
		<td>${e.uname }</td>
		<td>${e.udoing }</td>
		<td>${e.unum }</td>
		<td>${e.uover }</td>
		<td>${e.upeople }</td>
		<td style="color: red;">${e.tp.tname }</td>
		<td>
			<input type="button" value="查看/修改"  onclick="updateOne(${e.uid})">
			<input type="button" value="删除" onclick="deleteOne(${e.uid})">

		</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="11">
		<a href="list?page=1">首页</a>
		<a href="list?page=${page-1>0 ? page-1 : 1}">上一页</a>
		<a href="list?page=${page+1>totle ? totle : page+1}">下一页</a>
		<a href="list?page=${totle }">尾页</a>
		</td>
	</tr>
</table>
</form>
<script type="text/javascript" src="/../js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	function addOne(){
		location = "addOne";
	}
	function updateOne(id){
		location = "updateOne?id="+id;
	}
	function deleteOne(id){
		$.post("deleteOne",{id:id},function(flag){
			if(flag){
				alert("$");
				location="list";
			}else{
				alert("!");
			}
		},"json")
	}
</script>
</body>
</html>