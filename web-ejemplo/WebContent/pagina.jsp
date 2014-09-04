<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Un ejemplo de jsp para la calculadora</title>
	</head>
	<body>
		<h1>Resultados</h1>
		<p>Introduce los datos y pulsa una opción</p>
		<table border="1" width="600">
			<tr>
				<td align="center">
					<form action="./calculadora.html">
						Indica el operando 1:
						<input name="op1" value="${param.op1}" />
						<br/>
						Indica el operando 2:
						<input name="op2" value="${param.op2}" />
						<br/>
						Indica la operación:
						<br/>
						<input name="op" type="submit" value="sumar"/>
						<input name="op" type="submit" value="restar"/>
						<input name="op" type="submit" value="multiplicar"/>
						<input name="op" type="submit" value="dividir"/>
						<br/>
					O selecciona del menú desplegable:
					<br/>
					<select name="op">
						<option value="sumar" 
							${param.op=="sumar" ? "selected" : ""}>
							Suma
						</option>
						<option value="restar" 
							${param.op=="restar" ? "selected" : ""}>
							Resta
						</option>
						<option value="multiplicar" 
							${param.op=="multiplicar" ? "selected" : ""}>
							Producto
						</option>
						<option value="dividir" 
							${param.op=="dividir" ? "ced" : ""}>
							Cociente
						</option>
					</select>
					<input name="op" type="submit" value="Calcular" />
					</form>	
				</td>
				<td align="center">
					<img alt="Leo Harlem"
						 width="100"
						 src="http://www.mpcmanagement.es/wp-content/uploads/2013/12/correrharm.jpg"/>
				</td>
			</tr>
		</table>
		
		<p>En esta página se muestra el resultado de aplicar una operación 
		a través del servlet de ejemplo que hemos creado</p>
		<h2>Datos de entrada</h2>
		<p>
			Los datos de entrada son : 
			<br/>
			<ul>
				<li>Operando 1: ${param.op1}</li>
				<li>Operando 2: ${param.op2}</li>
				<li>Operación : ${param.op}</li>
			</ul>
		</p>
		
		<h2>Resultados</h2>
		<p>El resultado de la operación es ${r}</p>
	</body>
</html>