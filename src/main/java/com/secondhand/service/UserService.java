package com.secondhand.service;
import com.secondhand.entity.User;
import com.secondhand.repository.UserRepository;
import org.springframework.stereotype.Service;
import jakarta.annotation.Resource;
@Service//标记这个类是业务层组件，交给Spring管理，它会自动创建这个类的对象

public class UserService {
    @Resource//把仓库对象拿到业务层里面使用
    private UserRepository userRepository;
    public User saveUser(User user){
        return userRepository.save(user);
    }

}
