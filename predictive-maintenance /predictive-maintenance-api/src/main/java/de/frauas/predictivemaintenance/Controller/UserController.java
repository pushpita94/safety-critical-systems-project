package de.frauas.predictivemaintenance.Controller;

import de.frauas.predictivemaintenance.Model.User;
import de.frauas.predictivemaintenance.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
public class UserController {
    private static final Logger LOGGER = Logger.getLogger(OpenApiController.class.getName());

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> getAllUsers() {
        Iterable<User> allUsers = userRepository.findAll();
        return allUsers;
    }

    public boolean doesUsernameExist(String username) {
        return userRepository.existsByUsername(username);
    }

    public User getUserByUsername(String username) {
        if (userRepository.existsByUsername(username)) {
            LOGGER.info("Username " + username + "found! Fetching details..");
            return userRepository.findByUsername(username).get(0);
        } else {
            LOGGER.warning("Username " + username + "not found!");
            return null;
        }
    }
}
