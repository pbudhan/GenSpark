package org.example;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean(name = "student")
    public Student enrollNewStudent(){
        return new Student(12345,"Tommy","3237427138");
    }

    @Bean(name = "address")
    public Address newAddy(){
        return new Address();
    }
}
