package ir.reyhane.blog.modules.users.service;

import ir.reyhane.blog.modules.users.models.User;
import ir.reyhane.blog.modules.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user) {
        return this.userRepository.save(user);
    }

    public List<User> findALl(){
        return userRepository.findAll();
    }

}
