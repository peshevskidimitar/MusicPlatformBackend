package mk.fcse.musicplatformbackend.service.impl;

import mk.fcse.musicplatformbackend.model.User;
import mk.fcse.musicplatformbackend.repository.UserRepository;
import mk.fcse.musicplatformbackend.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

}
