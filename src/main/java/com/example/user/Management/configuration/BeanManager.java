package com.example.user.Management.configuration;

import com.example.user.Management.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {

    @Bean
    public List<User> getInitializedList()
    {

        User initUser = new User(1,"Rahul","Noida",99999999);
        List<User> initList = new ArrayList<>();
        initList.add(initUser);

        return initList;
    }
}
