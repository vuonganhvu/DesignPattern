package com.higgsup.designpattern.prototype.shallow;

/**
 * Created by anhvu on 21-Jun-18.
 */
public class Adset {
    private Long id;
    private String name;

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

    @Override
    public String toString() {
        return "Adset { id =" + id + ", name='" + name + " }";
    }
}
