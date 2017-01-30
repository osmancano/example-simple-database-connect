package com.ironyard.data;

/**
 * Created by jasonskipper on 1/30/17.
 */
public class Pet {
    private String name;
    private int age;
    private String owner;
    private String color;
    private String type;
    private long id;

    public Pet(){

    }

    public Pet(String name, int age, String owner, String color, String type) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.color = color;
        this.type = type;
    }

    public Pet(String name, int age, String owner, String color, String type, long id) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.color = color;
        this.type = type;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
