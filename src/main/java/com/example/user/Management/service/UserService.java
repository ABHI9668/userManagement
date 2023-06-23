package com.example.user.Management.service;


import com.example.user.Management.model.User;
import com.example.user.Management.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;
    public List<User> getAllUsers() {
        return userRepo.getUsers();
    }

    public String createUsers(User user) {
        List<User> originalList = getAllUsers();
        originalList.add(user);
        return "New user added";
    }

    public String  deleteUser(@RequestParam User user) {
        List<User> originalList = getAllUsers();

//        for(User myuser : originalList)
//        {
            originalList.remove(user);
//            {
//                originalList.remove(user);
//                return "user deleted:" + user;
//            }
//        }
        return "user :" + user+ " not deleted as it doesn't exist" ;
    }
}
