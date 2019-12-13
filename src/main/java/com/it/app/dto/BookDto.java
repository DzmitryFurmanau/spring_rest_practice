package com.it.app.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class BookDto {

    private Long id;

    @Column(unique = true, nullable = false)
    @NotNull(message = "{book.name.notNull}")
    @NotEmpty(message = "{book.name.notEmpty}")
    @Size(min = 3, max = 50, message = "{book.name.size}")
    private String name;

    @Column(unique = true, nullable = false)
    @NotNull(message = "{book.count.notNull}")
    @NotEmpty(message = "{book.count.notEmpty}")
    private Integer count;

    @Column(unique = true, nullable = false)
    @NotNull(message = "{book.genre.notNull}")
    @NotEmpty(message = "{book.genre.notEmpty}")
    @Size(min = 3, max = 50, message = "{book.genre.size}")
    private String genre;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
