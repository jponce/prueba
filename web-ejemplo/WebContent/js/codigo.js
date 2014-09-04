// Ya que el c�digo est� separado (en otro fichero fuera del html)
// lo voy a separar todo
// y voy a poner aqu� los eventos

function testAjax(){
	ajax = new XMLHttpRequest();
	// Abro la conexi�n
	ajax.open("POST", "http://localhost:8080/web-ejemplo/rest/adios/Javi", true);
	// Tengo que preparar la respuesta
	ajax.onreadystatechange = responder;
	// Tengo que hacer la petici�n
	ajax.send();
}

function responder(){
	// El 4 es que el servidor a terminado de procesar
	// El 200 es ok en estatus de la respuesta
	if(ajax.readyState == 4 && ajax.status == 200){
		var resultado = ajax.responseText;
		alert(resultado);
	}
}

// me invento una funci�n main
function main(){
	// aqu� voy a enlazar todos los eventos
	var boton1 = document.getElementById("probarAjax");
	boton1.onclick = testAjax;
}

// la funcion main se va a ejecutar cuando se cargue la p�gina
window.onload = main;
