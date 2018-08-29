package com.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MyObject {
    private int id;
    private Object obj;

    public MyObject() {
    }

    public MyObject(int id, Object obj) {
        this.id = id;
        this.obj = obj;
    }

    @JsonProperty
    public int getId() {
        return id;
    }

    @JsonProperty
    public Object getObj() {
        return obj;
    }
}
