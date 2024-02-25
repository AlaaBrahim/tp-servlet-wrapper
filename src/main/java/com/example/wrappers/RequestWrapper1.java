package com.example.wrappers;

import javax.servlet.*;

// Cette classe étend ServletRequestWrapper qui est une implémentation de l'interface ServletRequest
public class RequestWrapper1 extends ServletRequestWrapper {
    // Le constructeur prend une requête Servlet comme argument
    public RequestWrapper1(ServletRequest req) {
        // Appelle le constructeur de la superclasse ServletRequestWrapper avec la
        // requête passée en argument
        super(req);
    }

    // Cette méthode est appelée pour obtenir la valeur d'un paramètre de la requête
    public String getParameter(String str) {
        // Appelle la méthode getParameter de la superclasse ServletRequestWrapper
        String name = super.getParameter(str);
        // Si le nom est vide, un message est renvoyé à l'utilisateur pour lui demander
        // d'entrer son nom
        if (name.equals("")) {
            name = "Please, enter your name in the form";
        }
        // Renvoie le nom
        return name;
    }
}