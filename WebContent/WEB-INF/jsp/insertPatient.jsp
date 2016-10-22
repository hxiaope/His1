<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加病人</title>

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
	<form action="${pageContext.request.contextPath }/insertPatientSubmit.action" method="post">		
		<div class="container-fluid">
			<label>病人信息：</label>
			<div class="form-group">
				<input type="hidden" name="patientId"/>
			</div>
			<div class="form-group">
				<label>姓名:</label>
				<input type="text" name="patientName" class="form-control" placeholder="Name"/>
			</div>
			<div class="form-group">
				<label>性别:</label>
				<input type="text" name="patientSex" class="form-control" placeholder="Sex"/>
			</div>
			<div class="form-group">				
				<label>电话:</label>
				<input type="text" name="patientPhone" class="form-control" placeholder="Phone"/>
			</div>
			<div class="form-group">
				<label>家庭地址:</label>
				<input type="text" name="patientAddress" class="form-control" placeholder="Address"/>
			</div>
			<div class="form-group">
				<input type="submit" value="提交" class="btn btn-info"/>
			</div>
		</div>

	</form>
</body>

</html>