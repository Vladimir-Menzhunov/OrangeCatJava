package com.company.Head;

public abstract class Head {
    private int size;

    public Head(int size) {
        this.size = size;
    }

    public void show() {
        System.out.println("Если ты меня не переопределишь, то у тебя глаз будет целой головой!");
        System.out.println("С размером = " + size);
    }
}
