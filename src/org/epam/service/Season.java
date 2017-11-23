package org.epam.service;

import org.epam.controller.newEnum;

import java.util.ArrayList;

public class Season extends newEnum<Season> {
    public static final Season WINTER = new Season("Winter");
    public static final Season SPRING = new Season("Spring");
    public static final Season SUMMER = new Season("Summer");
    public static final Season AUTUMN = new Season("Autumn");
    public static final ArrayList VALUES = newEnum.values();

    protected Season(String name){
        super(name);
    }

}
