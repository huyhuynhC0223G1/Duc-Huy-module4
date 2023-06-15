package com.example.dictionary.repository.impl;

import com.example.dictionary.repository.IDictionaryRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepository implements IDictionaryRepository {
    public Map<String, String> dictionary() {
        return new HashMap<String, String>() {
            {
                put("hello", "xin chào");
                put("goodbye", "chào tạm biệt");
                put("book", "quyển sách");
                put("pen", "cái bút");
            }
        };
    }
}
