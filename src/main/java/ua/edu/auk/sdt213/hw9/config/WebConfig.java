package ua.edu.auk.sdt213.hw9.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Spring MVC configuration written in Java (section 3 of the tutorial).
 *
 * @Configuration - this class contains bean definitions.
 * @EnableWebMvc  - turns on the default Spring MVC setup
 *                  (handler mappings, handler adapters, message converters).
 * WebMvcConfigurer - lets us customize that default setup.
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    /**
     * Maps the root URL "/" straight to the "index" view.
     * No controller class is needed when a URL only has to show a page.
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }

    /**
     * View resolver (section 4 of the tutorial).
     * Turns a logical view name into a real file:
     * "index" -> /WEB-INF/view/index.jsp
     * Files inside WEB-INF cannot be opened directly from the browser,
     * they are reachable only through Spring MVC.
     */
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/view/");
        bean.setSuffix(".jsp");
        return bean;
    }
}
