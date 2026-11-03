package ua.edu.auk.sdt213.hw9.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller from section 6 "Controllers and Views" of the tutorial.
 * @Controller marks the class as a Spring MVC controller, so the
 * DispatcherServlet sends matching requests to its methods.
 */
@Controller
public class SampleController {

    /**
     * Handles GET /sample.
     * Returns the logical view name "sample", which the view resolver
     * turns into /WEB-INF/view/sample.jsp.
     */
    @GetMapping("/sample")
    public String showForm() {
        return "sample";
    }
}
