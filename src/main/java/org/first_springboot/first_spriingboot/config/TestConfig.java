package org.first_springboot.first_spriingboot.config;

import org.first_springboot.first_spriingboot.entities.User;
import org.first_springboot.first_spriingboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null,"Matheus","matheus@gmail.com","759999999","123456");
        User u2 = new User(null,"Rian","rian@gmail.com","7594444999","1286456");
        userRepository.saveAll(Arrays.asList(u1,u2));
    }
}
