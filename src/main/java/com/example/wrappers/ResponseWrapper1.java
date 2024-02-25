package com.example.wrappers;

import javax.servlet.*;
import java.util.*;

// Cette classe étend ServletResponseWrapper qui est une implémentation de l'interface ServletResponse
public class ResponseWrapper1 extends ServletResponseWrapper {
    // Le constructeur prend une réponse Servlet comme argument
    public ResponseWrapper1(ServletResponse res) {
        // Appelle le constructeur de la superclasse ServletResponseWrapper avec la
        // réponse passée en argument
        super(res);
    }

    // Cette méthode est appelée pour obtenir la locale de la réponse
    public Locale getLocale() {
        System.out.println("Wrapper class called by Filter");

        // Appelle la méthode getLocale de la superclasse ServletResponseWrapper
        Locale loc = super.getLocale();

        // Obtient le pays et la langue de la locale
        String country = loc.getCountry();
        String language = loc.getLanguage();

        // Si le pays n'est pas les États-Unis, une nouvelle locale est créée pour les
        // États-Unis
        if (!country.equals("US")) {
            @SuppressWarnings("deprecation")
            Locale loc1 = new Locale("English, US");
            loc = loc1;
        }

        // Affiche le pays et la langue
        System.out.println(country);
        System.out.println(language);
        // Renvoie la locale
        return loc;
    }
}