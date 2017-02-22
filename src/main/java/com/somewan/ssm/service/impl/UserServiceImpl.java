package com.somewan.ssm.service.impl;

import com.somewan.ssm.dao.UserDao;
import com.somewan.ssm.model.User;
import com.somewan.ssm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by wan on 2017/2/23.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    public List<User> getAllUser() {
        return userDao.selectAllUser();
    }
}
