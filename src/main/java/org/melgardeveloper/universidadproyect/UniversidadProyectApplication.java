package org.melgardeveloper.universidadproyect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UniversidadProyectApplication {

    public static void main(String[] args) {
        String[] beanDefinitionsNames = SpringApplication.run(UniversidadProyectApplication.class, args).getBeanDefinitionNames();
        for (String str : beanDefinitionsNames ){
            System.out.println(str);
        }
    }
}
