package com.techprimers.mongo.springbootmongodbexample.resource;


import com.techprimers.mongo.springbootmongodbexample.document.Users;
import com.techprimers.mongo.springbootmongodbexample.repository.UsersRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersResource {

    private UsersRepository usersRepository;

    public UsersResource(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/all")
    public List<Users> getAllUsers(){
      return   usersRepository.findAll();
    }

    @GetMapping("/find/{name}")
    public Users getByName(@PathVariable String name){
        return usersRepository.findByName(name);

    }

    @GetMapping("/delete/{name}")
    public void deleteRec(@PathVariable String name){
        Users users = usersRepository.findByName(name);
        usersRepository.delete(users);
    }
}
