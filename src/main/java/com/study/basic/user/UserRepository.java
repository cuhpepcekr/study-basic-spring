package com.study.basic.user;

import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

@RepositoryDefinition(domainClass = User.class, idClass = Integer.class)
public interface UserRepository {

    List<User> findAll();

}


