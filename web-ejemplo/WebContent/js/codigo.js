// Ya que el código está separado (en otro fichero fuera del html)
// lo voy a separar todo
// y voy a poner aquí los eventos

function testAjax(){
	ajax = new XMLHttpRequest();
	// Abro la conexión
	ajax.open("POST", "http://localhost:8080/web-ejemplo/rest/adios/Javi", true);
	// Tengo que preparar la respuesta
	ajax.onreadystatechange = responder;
	// Tengo que hacer la petición
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

// me invento una función main
function main(){
	// aquí voy a enlazar todos los eventos
	var boton1 = document.getElementById("probarAjax");
	boton1.onclick = testAjax;
}

// la funcion main se va a ejecutar cuando se cargue la página
window.onload = main;
