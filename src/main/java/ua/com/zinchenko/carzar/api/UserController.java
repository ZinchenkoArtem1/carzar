package ua.com.zinchenko.carzar.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.com.zinchenko.carzar.api.dto.UserDto;
import ua.com.zinchenko.carzar.api.mapper.UserMapper;
import ua.com.zinchenko.carzar.model.User;
import ua.com.zinchenko.carzar.service.UserService;

@RestController
@RequestMapping("/users/v1")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<UserDto> userLogin(@RequestBody User user) {
        User userFromDb = userService.isUserExist(user);
        if(userFromDb == null) {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
        return new ResponseEntity<>(UserMapper.modelToDto(userFromDb), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public UserDto getUserInfo(@PathVariable Integer id) {
        return UserMapper.modelToDto(userService.getById(id));
    }
}
