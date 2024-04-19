package com.vj.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.vj.joblisting.model.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
