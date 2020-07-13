package com.company.Head;

public class Ears extends Head {
    boolean isSharp;

    public Ears(int size, boolean isSharp) {
        super(size);
        this.isSharp = isSharp;
    }

    @Override
    public void show() { // Полиморфизм - один метод много реализаций (Ad-hoc-полиморфизм переопределение метода)
        System.out.println("На связи уши!");
        System.out.println("Слушаем вас.");
        if (isSharp) {
            System.out.println("Ммм....., а кот у нас остряк оказывается.");
        } else {
            System.out.println("Скажите, а когда уши висят - это нормально?");
        }
    }
}
