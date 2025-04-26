package service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import entity.User;
import mapper.UserMapper;
import service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}