package com.example.spring_init;

import com.controller.Hello;
import com.domain.Person;
import com.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringInitApplicationTests {

    @Autowired
    private Hello a;

    @Autowired
    private Person person;

    @Value("${person.name}")
    private String name;

    @Autowired
    private User user;

    @Test
    void contextLoads() {
        String hell = a.hell();
        System.out.println(hell);
        System.out.println("123456");
    }

    @Test
    void Test1(){
        System.out.println(user.getEmail());
//        System.out.println(person);
//        System.out.println(name);
    }

}
