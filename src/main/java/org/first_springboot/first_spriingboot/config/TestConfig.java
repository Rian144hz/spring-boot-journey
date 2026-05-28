package org.first_springboot.first_spriingboot.config;

import org.first_springboot.first_spriingboot.entities.Category;
import org.first_springboot.first_spriingboot.entities.Order;
import org.first_springboot.first_spriingboot.entities.Product;
import org.first_springboot.first_spriingboot.entities.User;
import org.first_springboot.first_spriingboot.enums.OrderStatus;
import org.first_springboot.first_spriingboot.repositories.CategoryRepository;
import org.first_springboot.first_spriingboot.repositories.OrderRepository;
import org.first_springboot.first_spriingboot.repositories.ProductRepository;
import org.first_springboot.first_spriingboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;


    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        User u1 = new User(null,"Matheus","matheus@gmail.com","759999999","123456");
        User u2 = new User(null,"Rian","rian@gmail.com","7594444999","1286456");

        Order o1 = new Order(null, Instant.parse("2026-05-27T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2026-06-24T03:42:10Z"),OrderStatus.SHIPPED, u2);
        Order o3 = new Order(null, Instant.parse("2026-07-23T15:21:22Z"),OrderStatus.DELIVERED, u1);

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");


        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));


    }
}
