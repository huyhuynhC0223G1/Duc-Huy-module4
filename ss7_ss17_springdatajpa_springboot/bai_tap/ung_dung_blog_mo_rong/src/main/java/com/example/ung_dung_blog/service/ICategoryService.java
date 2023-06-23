package com.example.ung_dung_blog.service;

import com.example.ung_dung_blog.model.Blog;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICategoryService {
    List<Blog> findAll();
}

