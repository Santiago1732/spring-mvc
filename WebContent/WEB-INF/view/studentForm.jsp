<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="procesarInformacion" modelAttribute="student">
		
		<input type="text" name="nombre	"
			placeholder="Ingrese nombre"></input>
		
		<input type="text" name="apellido"
			placeholder="Ingrese apellido"></input>
		
		<input type="text" name="dni"
			placeholder="Ingrese dni"></input>
		
		<input type="text" name="numeroLegajo"
			placeholder="Ingrese numero de legajo"></input>			
		
<!-- 		<br><br>	 -->
<%-- 		<form:select path="especialidad"> --%>
<%-- 			<form:options items="${student.especialidad}"/> --%>
<%-- 		</form:select> --%>
			
		<br><br>	
			<input type="submit"></input>
	 
		</form>
	
	

</body>
</html>