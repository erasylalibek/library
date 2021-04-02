package kz.iitu.library;

import kz.iitu.library.config.SpringConfiguration;
import kz.iitu.library.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Menu menu = context.getBean("menu", Menu.class);
        menu.menu(context);
    }

}
