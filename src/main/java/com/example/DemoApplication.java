package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* Classe principal de l'application sample spring boot.
**/
@SpringBootApplication
final class DemoApplication {

        /**
        * Constructeur privé.
        * lève une exception si instanciation de cette classe.
        **/
        private DemoApplication() {
        }

        /**
        * Méthode principale de DemoApplication.
        * Lance l'application Spring-Boot.
        * @param args : arguement de l'application
        **/
        public static void main(final String[] args) {
          SpringApplication.run(DemoApplication.class, args);
        }
}
