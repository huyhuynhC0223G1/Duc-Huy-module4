package com.example.ung_dung_blog_mo_rong.controller;


import com.example.ung_dung_blog_mo_rong.model.Blog;
import com.example.ung_dung_blog_mo_rong.service.IBlogService;
import com.example.ung_dung_blog_mo_rong.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;
    @GetMapping()
    public List<Blog> getBlogs(){
        return this.blogService.findAllByStatusIsFalse();
    }
@GetMapping("/detail/{id}")
}
