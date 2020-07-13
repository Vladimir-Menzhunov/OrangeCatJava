package com.company.Head.Face;

public class Mouth extends Face{
    boolean mustache;

    public Mouth(int size, boolean mustache) {
        super(size);
        this.mustache = mustache;
    }

    @Override
    public void show() { // Полиморфизм - один метод много реализаций (Ad-hoc-полиморфизм переопределение метода)
        System.out.print("Привет, я пасть ");
        if(mustache) {
            System.out.println("усатого кота.");
        } else {
            System.out.println("кота.");
        }
    }
}
