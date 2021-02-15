package com.gourianova.binocularvision.dao;

import com.gourianova.binocularvision.entity.User;

public interface UserDao {

        User findByLogin(String login);
        Boolean save(User user);
   }
