package com.example.ung_dung_blog.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "blog")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nameBlog;
    @Column(name = "contentBlog", columnDefinition = "text")
    private String contentBlog;
    private LocalDateTime postingTime;
    @ManyToOne
    @JoinColumn(name = "id_category", nullable = false)
    private Category category;
    private Boolean isFlagDelete = true;

    public Blog() {
    }

    public Blog(Integer id, String nameBlog, String contentBlog, LocalDateTime postingTime) {
        this.id = id;
        this.nameBlog = nameBlog;
        this.contentBlog = contentBlog;
        this.postingTime = postingTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameBlog() {
        return nameBlog;
    }

    public void setNameBlog(String nameBlog) {
        this.nameBlog = nameBlog;
    }

    public String getContentBlog() {
        return contentBlog;
    }

    public void setContentBlog(String contentBlog) {
        this.contentBlog = contentBlog;
    }

    public LocalDateTime getPostingTime() {
        return postingTime;
    }

    public void setPostingTime(LocalDateTime postingTime) {
        this.postingTime = postingTime;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Boolean getFlagDelete() {
        return isFlagDelete;
    }

    public void setFlagDelete(Boolean flagDelete) {
        isFlagDelete = flagDelete;
    }
}

