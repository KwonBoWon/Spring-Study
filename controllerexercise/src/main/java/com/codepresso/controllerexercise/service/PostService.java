package com.codepresso.controllerexercise.service;

import com.codepresso.controllerexercise.dto.PostDto;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    public PostDto getPost(Integer id){
        System.out.println("find post data from databse by " + id);
        System.out.println("validate data from databse");
        System.out.println("process data if necessary");

        return new PostDto(id, "title", "this is content", "dhlee");
    }
}
