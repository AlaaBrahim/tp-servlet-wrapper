package com.example.filters;

import java.io.*;
import javax.servlet.*;

import com.example.wrappers.RequestWrapper1;
import com.example.wrappers.ResponseWrapper1;

// Cette classe implémente l'interface Filter qui est utilisée pour créer un filtre
public class MyFilter1 implements Filter {
    // Cette méthode est appelée par le conteneur de servlets pour indiquer à un
    // filtre qu'il est
    // en cours de mise en service. Nous n'avons rien à initialiser dans ce cas,
    // donc la méthode est vide.
    public void init(FilterConfig filterConfig) {
    }

    // Cette méthode est appelée par le conteneur de servlets pour indiquer à un
    // filtre qu'il est
    // en cours de mise hors service. Nous n'avons rien à nettoyer dans ce cas, donc
    // la méthode est vide.
    public void destroy() {
    }

    // Cette méthode est appelée chaque fois qu'un client demande une ressource web,
    // c'est-à-dire qu'elle pré-traite la requête.
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        // Définit le type de contenu de la réponse à "text/html"
        response.setContentType("text/html");
        // Obtient un PrintWriter pour envoyer la réponse textuelle à la requête
        PrintWriter out = response.getWriter();
        // Envoie un message au client
        out.println("<b> <i>Filtering request and passing it to Wrapper class</i> </b> <br/>");
        out.println("<b> <i>Filter is filtering the response and passing it to Wrapper class</i> </b> <br/>");

        // Appelle le constructeur de la classe RequestWrapper1
        RequestWrapper1 requestWrapper = new RequestWrapper1(request);
        // Appelle le constructeur de la classe ResponseWrapper1
        ResponseWrapper1 responseWrapper = new ResponseWrapper1(response);

        // Cette méthode appelle le prochain filtre dans la chaîne
        chain.doFilter(requestWrapper, responseWrapper);
    }
}