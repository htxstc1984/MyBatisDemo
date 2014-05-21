package com.itg.my.data;

import com.itg.my.model.UserEntity;

public interface UserEntityMapper {

	int insert(UserEntity record);

	int insertSelective(UserEntity record);
}