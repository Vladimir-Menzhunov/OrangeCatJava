package com.company.Head.Face;

public class Eyes extends Face{
    String eyeStyle;


    public Eyes(int size, String eyeStyle) {
        super(size);
        this.eyeStyle = eyeStyle;
    }

    @Override // Полиморфизм - один метод много реализаций (Ad-hoc-полиморфизм переопределение метода)
    public void show() {
        System.out.println("Что за глазки у товарища?");
        System.out.println("---- " + eyeStyle);//стиль не знаю но очки крутые!
    }
}
