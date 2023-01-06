package mk.fcse.musicplatformbackend.service;

import mk.fcse.musicplatformbackend.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
