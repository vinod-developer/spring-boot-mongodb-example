package com.techprimers.mongo.springbootmongodbexample.mongodbconfig;


import com.techprimers.mongo.springbootmongodbexample.document.Users;
import com.techprimers.mongo.springbootmongodbexample.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories (basePackageClasses = UsersRepository.class)
@Configuration
public class MongoDBConfig {

    @Bean
    CommandLineRunner commandLineRunner(UsersRepository usersRepository){
        return strings -> {
            usersRepository.save(new Users(1, "vinodIndia", "dev", 2000L));
            usersRepository.save(new Users(2, "vinodUSA", "devops", 2000L));
            usersRepository.save(new Users(3, "vinodGER", "test", 2000L));
        };


    }
}
