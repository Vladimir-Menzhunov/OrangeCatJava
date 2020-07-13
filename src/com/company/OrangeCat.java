package com.company;

import com.company.Hand.Hand;
import com.company.Hand.HandLeft;
import com.company.Hand.HandRight;
import com.company.Head.Ears;
import com.company.Head.Face.Eyes;
import com.company.Head.Face.Mouth;
import com.company.Head.Face.Nose;
import com.company.Head.Hairstyle;
import com.company.Head.Head;

public class OrangeCat {
    Head eyes;
    Head ears;
    Head hairStyle;
    Head nose;
    Head mouth;
    Hand handLeft;
    Hand handRight;


    OrangeCat() {
        eyes = new Eyes(10, "стиль не знаю, но очки крутые!"); // Полиморфизм типов - 1 тип множесво подтипов.
        ears = new Ears(25, true); // Полиморфизм типов - 1 тип множесво подтипов.
        hairStyle = new Hairstyle(5, "CREATIVE"); // Полиморфизм типов - 1 тип множесво подтипов.
        nose = new Nose(3, "Black"); // Полиморфизм типов - 1 тип множесво подтипов.
        mouth = new Mouth(4, true); // Полиморфизм типов - 1 тип множесво подтипов.
        handLeft = new HandLeft(100, "мышь"); // Полиморфизм типов - 1 тип множесво подтипов.
        handRight = new HandRight(50, "клавиатура"); // Полиморфизм - 1 тип множество подтипов
    }

    public void showCat() {
        System.out.println("Сейчас мы немного узнаем о коте:");
        System.out.println("--------------------------");
        eyes.show();
        System.out.println("--------------------------");
        ears.show();
        System.out.println("--------------------------");
        hairStyle.show();
        System.out.println("--------------------------");
        nose.show();
        System.out.println("--------------------------");
        mouth.show();
        System.out.println("--------------------------");
        System.out.println(handLeft.toString());
        System.out.println(handLeft.showAbilityHand());
        System.out.println("--------------------------");
        System.out.println(handRight.toString());
        System.out.println(handRight.showAbilityHand());
        System.out.println("--------------------------");
    }
}
