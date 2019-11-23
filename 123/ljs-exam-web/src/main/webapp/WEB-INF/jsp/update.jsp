<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel = "stylesheet"  href = "<%=request.getContextPath()%>/css/index.css"> 
</head>
<body>
<form action="update" method="post">
<table>
	<c:forEach items="${findUplist }" var="f">
	<tr>
		<td>姓名</td>
		<td>
			<input type="hidden" name="uid" value="${f.uid }">
			<input type="text" name="uname" value="${f.uname }">
		</td>
	<tr/>
	<tr>
		<td>事故/违纪</td>
		<td>
			<input type="text" name="udoing" value="${f.udoing }">
		</td>
	<tr/>
	<tr>
		<td>处理/扣分</td>
		<td>
			<input type="text" name="unum" value="${f.unum }">
		</td>
	<tr/>
	<tr>
		<td>处理结果</td>
		<td>
			<input type="text" name="uover" value="${f.uover }">
		</td>
	<tr/>
	<tr>
		<td>处理教师</td>
		<td>
			<input type="text" name="upeople" value="${f.upeople }">
		</td>
	<tr/>
	<tr>
		<td>所属事故等级</td>
		<td>
			<select name="tid">
			<option value="${f.tid}" >-#-${f.tp.tname }-#-</option>
				<c:forEach items="${findtplist }" var="e">
					<option value="${e.tid}" name="tid">${e.tname }</option>
				</c:forEach>
			</select>
		</td>
	<tr/>
	<tr>
		<td colspan="11">
			<input type="button" value="修改" onclick="submit()">
			<input type="button" value="返回" onclick="back()">
		</td>
	</tr>
	</c:forEach>
</table>

</form>
<script type="text/javascript" src="/../js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	function back(){
		location="index";
	}
</script>
</body>
</html>