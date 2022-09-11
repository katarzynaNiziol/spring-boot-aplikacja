package pl.katarzynaniziol.springbootaplikacja;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnection {
    @Value("localhost")
    private String host;

    @Value("katarzyna")
    private String username;

    @Value("password")
    private String password;


    public void addUserToDatabase(String name) {
        System.out.println("User added to db.");
    }
}
