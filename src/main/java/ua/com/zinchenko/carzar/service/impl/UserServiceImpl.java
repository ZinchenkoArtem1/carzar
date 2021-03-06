package ua.com.zinchenko.carzar.service.impl;

import org.springframework.stereotype.Service;
import ua.com.zinchenko.carzar.model.User;
import ua.com.zinchenko.carzar.persistence.UserRepository;
import ua.com.zinchenko.carzar.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User isUserExist(User user) {
        return userRepository.findByUserEmailAndPassword(user.getUserEmail(), user.getPassword());
    }

    @Override
    public User getById(Integer id) {
        return userRepository.getById(id);
    }
}
