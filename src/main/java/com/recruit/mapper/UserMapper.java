package com.recruit.mapper;

import java.util.List;

import com.recruit.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
	
	List<UserEntity> getAll();
	
	UserEntity getOne(Long id);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(Long id);

	UserEntity getUserByToken(String token);

	UserEntity getUserBySelect(UserEntity entity);


}