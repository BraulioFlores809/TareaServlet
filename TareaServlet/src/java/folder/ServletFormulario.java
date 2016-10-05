/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Braulio Flores
 */
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.Date;

public class ServletFormulario extends HttpServlet {
    String nombre;

    public void doPost(HttpServletRequest peticion, HttpServletResponse respuesta)
            throws ServletException, IOException {
        nombre = peticion.getParameter("NOMBRE");
        PrintWriter out = new PrintWriter(respuesta.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Respuesta al Formulario del Servlet</title><style>\n" +
"            @import url(https://fonts.googleapis.com/css?family=Roboto+Condensed);\n" +
"        </style></head>");
        out.println("<body><div style = \"float: left; width:50%; height:50%; background-color:#706566; font-family: Roboto Condensed;\">");
        out.println("<br><br><br><br><p><h1><center><Font color=\"BLUE\">Your name is: <B>" + nombre + "</B></Font> </center></h1></p>");
        out.println("<center><Font color=\"white\" >Date: " + new Date()+"</Font> </center>");
        out.println("</div></body></html>");
        out.close();
    }
}