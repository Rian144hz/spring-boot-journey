package org.first_springboot.first_spriingboot.resources;

import org.first_springboot.first_spriingboot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Matheus","matheus@gmail.com","(75)9947609","Usuario#111");
        return ResponseEntity.ok().body(u);
    }
}
