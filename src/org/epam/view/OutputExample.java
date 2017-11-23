package org.epam.view;

import org.epam.service.Season;

public class OutputExample {
    public static void printExample() {
        for (Season elem : Season.getVALUES()) {
            System.out.println(elem.name());
        }
    }
}
