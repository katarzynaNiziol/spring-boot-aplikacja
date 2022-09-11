package pl.katarzynaniziol.springbootaplikacja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAplikacjaApplication implements CommandLineRunner {

    @Autowired
    UserService userService;

    public static void main(String[] args) {

        SpringApplication.run(SpringBootAplikacjaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userService.registerUser("Katarzyna");
    }
}
