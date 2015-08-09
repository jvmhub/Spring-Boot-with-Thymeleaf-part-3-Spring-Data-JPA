package com.jvmhub.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.jvmhub.springboot.domain.PostEntity;

public interface PostRepository extends CrudRepository<PostEntity, Long> {
	List<PostEntity> findByTitle(String title);
}
