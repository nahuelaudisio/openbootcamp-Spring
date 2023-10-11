package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // opcion 1 - crear un objeto normal
        Calculadora calculator2 = new Calculadora();

        // OPCION 2 - RECIBIR UN OBJETO SPRING
    Calculadora calculator = (Calculadora) context.getBean("calculadora");

        String texto = calculator.holaMundo();

     System.out.println(texto);

    }
}
