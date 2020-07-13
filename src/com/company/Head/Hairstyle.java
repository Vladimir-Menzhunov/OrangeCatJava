package com.company.Head;

public class Hairstyle extends Head{

    String nameHairstyle;

    public Hairstyle(int size, String nameHairstyle) {
        super(size);
        this.nameHairstyle = nameHairstyle;
    }

    @Override
    public void show() { // Полиморфизм - один метод много реализаций (Ad-hoc-полиморфизм переопределение метода)
        System.out.println("Hey everybody, the " + nameHairstyle + " hairstyle of this cat!");
    }
}
