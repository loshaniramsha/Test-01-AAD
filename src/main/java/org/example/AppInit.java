package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
      //  context.register(AppConfig.class);
        context.refresh();
        context.close();
    }
}