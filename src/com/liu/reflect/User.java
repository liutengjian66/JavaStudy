package com.liu.reflect;

import java.util.List;
import java.util.Map;

public class User {
    private int id=101;
    private String name;
    private Double salary=999.5;

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
    public User(){}

    public void setAll(List<Double> list,Map<Integer,String > map,int id){}

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
