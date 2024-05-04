package org.szm.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.szm.entity.User;
import org.szm.service.UserService;
import org.szm.service.dao.UserMapper;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getPerson() {
        List<User> person = userMapper.getPerson();

        for (User user : person) {
            log.info(user.toString());
        }

        User user = userMapper.selectById("1");
        System.out.println("1:"+user.toString());
        return person;
    }


}
