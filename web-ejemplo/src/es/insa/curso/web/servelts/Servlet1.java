package es.insa.curso.web.servelts;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(
			HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		// 1º Extraer los datos de entrada de request
		// SIEMPRE VIENEN EN FORMATO DE TEXTO
		String op1 = request.getParameter("op1");
		String op2 = request.getParameter("op2");
		String ope = request.getParameter("op");
		// 2º Convertir los datos
		double x = Double.valueOf(op1);
		double y = Double.valueOf(op2);
		// 3º Delegar la ejecución concreta que toque
		double resultado = calcular(x,y,ope);
		// 4º Devolver los resultados al usuario
			// a) A lo bruto, como el sysout pero en web
		response.getWriter().print("El resultado es " + resultado);
			// b) Mediante una página web
		request.setAttribute("r", resultado);
		request.getRequestDispatcher("pagina.jsp").forward(request, response);
		// EL CÓDIGO QUE SE PONGA A PERTIR DE ESTE PUNTO NO SIRVE PARA NADA
	}

	private double calcular(double x, double y, String ope) {
		if ("sumar".equals(ope)){
			return x+y;
		}else if("restar".equals(ope)){
			return x-y;
		}else if("multiplicar".equals(ope)){
			return x*y;
		}else if("dividir".equals(ope)){
			return x/y;
		}else{
			return Double.NaN;
		}
	}

}
