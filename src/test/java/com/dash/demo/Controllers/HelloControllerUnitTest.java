package com.dash.demo.Controllers;

import com.dash.demo.controllers.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.validation.support.BindingAwareModelMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloControllerUnitTest {

    @Test
    public void sayHello() {
        HelloController controller = new HelloController();
        BindingAwareModelMap model = new BindingAwareModelMap();
        String result = controller.sayHello("Sameh", model);

        assertEquals("hello", result);
        assertEquals("Sameh", model.asMap().get("user"));
    }
}
