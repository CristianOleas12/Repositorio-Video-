<%-- 
    Document   : index
    Created on : 20 may 2024, 3:27:55 p. m.
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>

     <form action="index.jsp" method="POST">
    <input type="text" name="saludo" value="" />
    <input type="submit" value="Enviar" />
 </form>
    </body>
        <%-- start web service invocation --%><hr/>
    <%
    try {
	webservicecli.Servicios_Service service = new webservicecli.Servicios_Service();
	webservicecli.Servicios port = service.getServiciosPort();
	 // TODO initialize WS operation arguments here
	java.lang.String name = request.getParameter("saludo");
	// TODO process result here
	java.lang.String result = port.hello(name);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>
    <h1>Perimetro!</h1>
        <form action="index.jsp" method="POST">
            <input type="text" name="lado" value="" />
            <input type="submit" value="Enviar" />
        </form>
    </body>
    
        
    <%-- start web service invocation --%><hr/>
    <%
    try {
	webservicecli.Servicios_Service service = new webservicecli.Servicios_Service();
	webservicecli.Servicios port = service.getServiciosPort();
	 // TODO initialize WS operation arguments here
         // Obtén el parámetro "lado" de la solicitud como cadena
            String ladoStr = request.getParameter("lado");

            // Verifica que el parámetro no sea nulo y conviértelo a int
            double lado = 0.0;
            if (ladoStr != null && !ladoStr.isEmpty()) {
                lado = Double.parseDouble(ladoStr);
            } else {
                throw new IllegalArgumentException("El parámetro 'lado' es nulo o vacío");
            }
	// TODO process result here
	double result = port.perimetro(lado);
	out.println("Result = "+result);
    } catch (Exception ex) {
	// TODO handle custom exceptions here
    }
    %>
    <%-- end web service invocation --%><hr/>

</html>
