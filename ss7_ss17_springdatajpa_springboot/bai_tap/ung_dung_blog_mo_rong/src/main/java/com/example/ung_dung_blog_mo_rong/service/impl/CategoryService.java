package com.example.ung_dung_blog_mo_rong.service.impl;

import com.example.ung_dung_blog_mo_rong.model.Category;
import com.example.ung_dung_blog_mo_rong.repository.ICategoryRepository;
import com.example.ung_dung_blog_mo_rong.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Page<Category> findAllByStratusIsFalse(Pageable pageable) {
        return categoryRepository.findAllByStratusIsFalse(pageable);
    }
}
