package ru.netology.Authorization_service;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Component
public class UserRepository {

    List<User> userRepository;

    public UserRepository() {
        userRepository = Arrays.asList(new User("Nastia", "1005"),
                new User("Pavel", "0101"),
                new User("Igor", "574871"));
    }

    public List<Authorities> getUserAuthorities(String login, String password) {

        for (User user : userRepository) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return Arrays.asList(Authorities.values());
            }
        }
        return new ArrayList<>();
    }
}
