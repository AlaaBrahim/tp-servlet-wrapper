package com.example.servlets;

import javax.servlet.*;
import java.io.*;
import java.util.Locale;

// Cette classe étend GenericServlet, une classe abstraite qui implémente l'interface Servlet
public class MyServlet1 extends GenericServlet {
    // La méthode service est appelée pour chaque requête reçue
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        // Définit le type de contenu de la réponse à "text/html"
        response.setContentType("text/html");
        // Obtient un PrintWriter pour envoyer la réponse textuelle à la requête
        PrintWriter out = response.getWriter();
        // Affiche un message dans la console du serveur
        System.out.println("Servlet is called");

        // Obtient la locale de la réponse
        Locale loc = response.getLocale();
        // Envoie la locale à l'utilisateur
        out.println("Locale set for this application is " + loc.toString());

        // Obtient le paramètre "username" de la requête
        String name = request.getParameter("username");
        // Envoie le nom de l'utilisateur
        out.println(name);
    }
}