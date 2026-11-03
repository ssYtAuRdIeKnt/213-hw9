package ua.edu.auk.sdt213.hw9;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point of the application.
 * Spring Boot starts an embedded Tomcat server and registers the
 * DispatcherServlet - the front controller of Spring MVC that receives
 * every HTTP request and routes it to the right controller.
 */
@SpringBootApplication
public class SpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }
}
