package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class JavaServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaServletApplication.class, args);
    }
}
