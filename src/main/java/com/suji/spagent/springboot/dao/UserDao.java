package com.suji.spagent.springboot.dao;

import com.suji.spagent.springboot.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
    public static List<User> users;

    // temp set
    static {
        users = new ArrayList<>();
        users.add(new User(1,"testName1","testId1","1234"));
        users.add(new User(2,"testName2","testId2","1234"));
        users.add(new User(3,"testName3","testId3","1234"));
        users.add(new User(4,"testName4","testId4","1234"));
    }

    // get All Users
    public List<User> getAllUsers(){
        return users;
    }

    // get Select one User by UserId
    public User getUserById(String userId){
        return users
                .stream()
                .filter(user -> user.getUserId().equals(userId))
                .findAny()
                .orElse(new User(-1,"","",""));
    }

    // Insert User
    public User insertUser(User user){
        users.add(user);

        return user;
    }

    // Modify User
    public void UpdateUser(String userId, User user){
        users.stream()
                .filter(t -> t.getUserId().equals(userId))
                .findAny()
                .orElse(new User(-1,"","",""))
                .setUserName(user.getUserName());
    }

    // Delete User
    public void deleteUser(String UserId){
        users.removeIf(user -> user.getUserId().equals(UserId));
    }
}
