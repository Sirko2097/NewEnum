package org.epam.service;

import org.epam.controller.newEnum;

import java.util.ArrayList;

public class Season extends newEnum<Season> {
    public static final Season WINTER = new Season("WINTER");
    public static final Season SPRING = new Season("SPRING");
    public static final Season SUMMER = new Season("SUMMER");
    public static final Season AUTUMN = new Season("AUTUMN");
    private static final ArrayList VALUES = newEnum.values();

    private Season(String name){
        super(name);
    }

    public static ArrayList<Season> getVALUES() {
        return (ArrayList<Season>) VALUES;
    }
}

