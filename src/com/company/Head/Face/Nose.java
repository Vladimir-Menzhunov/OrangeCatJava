package com.company.Head.Face;

public class Nose extends Face{
    String colorNose;

    public Nose(int size, String colorNose) {
        super(size);
        this.colorNose = colorNose;
    }

    @Override // Полиморфизм - один метод много реализаций (Ad-hoc-полиморфизм переопределение метода)
    public void show() {
        System.out.println("Так, нос у кота " + colorNose + ", мокрый");
    }
}
