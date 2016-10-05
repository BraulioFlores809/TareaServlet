/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

import java.io.*;
import javax.servlet.*;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//@WebServlet(name = "ServletHolaMundo", urlPatterns = {"/ServletHolaMundo"})
public class HolaMmundo extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = new PrintWriter(res.getOutputStream());
        out.println("<html>");
        out.println("<head><title>Sservlet:v</title><style>\n" +
"            @import url(https://fonts.googleapis.com/css?family=Roboto+Condensed);\n" +
"        </style></head>");
        out.println("<body BGCOLOR=BLUE><div style = \"float: left; width:50%; height:50%; background-color:#186026; font-family: Roboto Condensed;\">");
        out.println("<center><Font color=\"white\" size=\"6\"><br><br><br><br>Hola   Mundo :3</font</center>");
        out.println("</div></body></html>");
        out.close();
    }

    public String getServletInfo() {
        return "Crea   una   página   HTML   que   dice   HolaMundo";
    }
}