package com.demo.fileio;

import java.io.Serializable;

public class SerializableDemo implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // won't be serialized
    private transient int id = 4;

    public int getId(){
        return id;
    }

    private String gender;
    public String getGender(){
        return gender;
    }

}
