<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改病人信息</title>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.min.css"/>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.7.2.min"/></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap.min"></script>
<style type="text/css">
	.form-control{
		width:20%;
	}
</style>

</head>
<body>
	<form
		action="${pageContext.request.contextPath }/editPatientSubmit.action"
		method="post">
		<div class="container-fluid">
			<lable>病人信息:</lable>
		</div>
		<div class="container-fluid">
			<div class="form-group">
				<label>病人ID:</label>
				<input type="text" name="patientId" value="${patient.patientId }" class="form-control" readonly/>
			</div>
			<div class="form-group">
				<label>姓名:</label>
				<input type="text" name="patientName" value="${patient.patientName}" class="form-control"/>
			</div>
			<div class="form-group">
				<label>性别:</label>
				<input type="text" name="patientSex" value="${patient.patientSex}" class="form-control"/>
			</div>
			<div class="form-group">
				<label>联系电话:</label>
				<input type="text" name="patientPhone" value="${patient.patientPhone}" class="form-control"/>
			</div>
			<div class="form-group">
				<label>家庭住址:</label>
				<input type="text" name="patientAddress" value="${patient.patientAddress}" class="form-control"/>
			</div>
			<div class="form-group">
				<input type="submit" value="提交" class="btn btn-info"/>
			</div>
		</div>
	</form>
</body>

</html>