package com.board.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.board.dtos.UserDto;

@Mapper
public interface UserMapper {
	public int addUser(UserDto dto);
	public UserDto loginUser(UserDto dto);
}
