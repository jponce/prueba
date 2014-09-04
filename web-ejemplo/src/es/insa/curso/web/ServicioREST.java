package es.insa.curso.web;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

// ESTO VA A SER UN SERVICIO REST CREADO CON JAX-RS
// PERO JAX-RS DE POR SÍ ES SÓLO UNA INTERFAZ
// JERSEY ES UNA VERSION DE JAX-RS
// PERO... SE CONFIGURA CON ANOTACIONES
// jj
@Path("/")
public class ServicioREST {

	public  ServicioREST(){
		
	}
	
	@GET
	@Path("/saludar")
	public String saludar(@QueryParam("nombre") String nombre){
		return "Hola " + nombre;
	}

	@POST
	@Path("/adios/{nombre}")
	public String despedirse(@PathParam("nombre") String nombre){
		return "Adios " + nombre;
	}

}
