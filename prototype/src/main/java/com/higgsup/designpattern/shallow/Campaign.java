package com.higgsup.designpattern.shallow;

/**
 * Created by anhvu on 21-Jun-18.
 */
public class Campaign implements Cloneable {
    private Long id;
    private String name;
    private Adset adset;

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

    public Adset getAdset() {
        return adset;
    }

    public void setAdset(Adset adset) {
        this.adset = adset;
    }

    @Override
    protected Campaign clone() throws CloneNotSupportedException {
        return (Campaign) super.clone();
    }
}
