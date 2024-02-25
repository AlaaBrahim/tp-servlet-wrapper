# ServletRequest Wrapper Demo

Ce projet est une simple application qui met en œuvre les wrappers ServletRequest et ServletResponse dans une application Java Servlet.

## Prérequis

- Java 8 ou supérieur
- Maven

## Comment exécuter l'application

1. Clonez le dépôt git :

   ```bash
   git clone https://github.com/AlaaBrahim/tp-servlet-wrapper
   ```

2. Accédez au répertoire du projet
3. Exécutez l'application avec Maven :

   ```bash
   mvn tomcat7:run
   ```

4. Ouvrez un navigateur et accédez à `http://localhost:8080`.

## Fonctionnalités

- L'utilisateur est invité à entrer son nom et sa ville.
- Les informations sont envoyées à une servlet via un formulaire.
- Les wrappers sont utilisés pour manipuler la requête et la réponse.
