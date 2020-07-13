package com.company.Head.Face;

import com.company.Head.Head;

abstract class Face extends Head {
    public Face(int size) {
        super(size);
    }

    @Override
    public void show() { // Полиморфизм - один метод много реализаций (Ad-hoc-полиморфизм переопределение метода)
        System.out.println("Я личико котика.");
    }
}
