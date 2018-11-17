package com.sincosys.dao;

import com.sincosys.model.User;

public interface UserDao {
    User getById(int userId);
}
