package org.academiadecodigo.codezillas.converters;

import org.academiadecodigo.codezillas.command.UserDto;
import org.academiadecodigo.codezillas.persistence.model.User;
import org.academiadecodigo.codezillas.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User convertUserDtoToUser(UserDto userDto) {

        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setPassword(userDto.getPassword());

        return user;

    }

    public UserDto convertUserToUserDto(User user) {

        UserDto userDto = new UserDto();

        userDto.setId(user.getId());
        userDto.setUserName(user.getUserName());
        userDto.setPassword(user.getPassword());

        return userDto;
    }


}
