package com.luv2code.springdemo2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

    public static void main(String[] args) {

        // cargar el archivo de configuracion de spring

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // recibir el bean desde el contenedor spring

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

        //verificamos si estan apuntando al mismo objeto

        boolean result = (theCoach == alphaCoach);

        //imprimimos el resultado
        System.out.println("Apuntando hacia el mismo objeto: " + result);

        System.out.println("Ubicacion del bean theCoach: " + theCoach);

        System.out.println("Ubicacion del bean alphaCoach: " + alphaCoach);

        // cerramos la conexion
        context.close();
    }
}
