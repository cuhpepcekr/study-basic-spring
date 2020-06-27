package com.study.basic.post;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PostRepository extends CrudRepository<Post, Integer> {

    Post findById(int id);

    List<Post> findAll();


}