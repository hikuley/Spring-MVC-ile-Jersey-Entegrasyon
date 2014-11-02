package com.ibrahimkuley.model;

import java.io.Serializable;

/**
 * Created by hikuley on 02.11.2014.
 */

public class Book implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String author;
    private String writeTime;

    public Book() {
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(String writeTime) {
        this.writeTime = writeTime;
    }
}
