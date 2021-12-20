package ua.com.zinchenko.carzar.service;

import ua.com.zinchenko.carzar.model.User;

public interface UserService {

    User isUserExist(User user);
    User getById(Integer id);
}
