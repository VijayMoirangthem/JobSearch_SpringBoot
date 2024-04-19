package com.vj.joblisting.repository;

import java.util.List;

import com.vj.joblisting.model.Post;

public interface SearchRepository {

    List<Post> findByText(String text);

}
