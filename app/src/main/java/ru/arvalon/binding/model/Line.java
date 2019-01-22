package ru.arvalon.binding.model;

/**
 * Created by arvalon on 29.01.2018.
 */

public class Line implements Metro {
    private String name;
    public Line(String name){
        this.name=name;
    }

    @Override
    public String name() {
        return name;
    }
}
