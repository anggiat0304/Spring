package coki.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextTest {
    @Test
    public void testApplicationContext(){
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloConfiguration.class);
        Assertions.assertNotNull(context);
    }
}
