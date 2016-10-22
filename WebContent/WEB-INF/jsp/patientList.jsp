<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>操作页面</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/bootstrap.min.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.7.2.min" /></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/bootstrap.min"></script>

<script type="text/javascript">
	function delPatient() {
		document.patientForm.action = "${pageContext.request.contextPath }/delPatient.action";
		document.patientForm.submit();
	}
	function queryBy() {
		document.patientForm.action = "${pageContext.request.contextPath }/queryPatient.action";
		document.patientForm.submit();
	}
	function InsetPatient() {
		document.patientForm.action = "${pageContext.request.contextPath }/insetPatient.action";
		document.patientForm.submit();
	}
	function logout() {
		document.patientForm.action = "${pageContext.request.contextPath }/logout.action";
		document.patientForm.submit();
	}
</script>
<style type="text/css">
.form-control {
	width: 20%;
}
</style>

</head>
<body>
	<form name="patientForm"
		action="${pageContext.request.contextPath }/queryPatient.action"
		method="post" role="form">
		<div class="container-fluid">
			<div class="form-group">
				<label >名称关键字查询:</label> 
				<input name="patientName" class="form-control" />
			</div>
			<div class="form-group">	
				<input type="button" value="查询" onclick="queryBy()" class="btn btn-info" />
			</div>	
		<label>病人列表:</label>		
		</div>	
		<table class="table table-striped">
		
			<tr>
				<td>选择</td>
				<td>姓名</td>
				<td>性别</td>
				<td>电话</td>
				<td>家庭地址</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${patientList }" var="patient">
				<tr>
					<td><input type="checkbox" name="patientId"
						value="${patient.patientId}" /></td>
					<td>${patient.patientName }</td>
					<td>${patient.patientSex }</td>
					<td>${patient.patientPhone}</td>
					<td>${patient.patientAddress}</td>

					<td><a
						href="${pageContext.request.contextPath }/editPatient.action?id=${patient.patientId}"
						class="btn btn-info" role="button">修改</a>
						<a
						href="${pageContext.request.contextPath }/deletePatient.action?id=${patient.patientId}"
						class="btn btn-info" role="button">删除</a>
					</td>

				</tr>
			</c:forEach>
		</table>
		<div class="form-group" align="center">
				<input type="button" value="批量删除" onclick="delPatient()" class="btn btn-info" /> 
				<input type="button" value="添加病人" onclick="InsetPatient()" class="btn btn-info" />
				<input type="button" value="当前用户:${username}" class="btn btn-info" />
				<input type="button" value="登出 " onclick="logout()" class="btn btn-info" />
		</div>
	</form>
</body>

</html>