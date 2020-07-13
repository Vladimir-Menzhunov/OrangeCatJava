package com.company.Hand;

public class HandRight extends Hand{
    public HandRight(int powerHand, String itemInHand) {
        super(powerHand, itemInHand);
    }

    @Override
    public String toString() { // Полиморфизм - один метод много реализаций. (Ad-hoc-полиморфизм, переопределение метода)
        return "Правая рука: " + "\n" + "Мощь правой руки: " + getPowerHand() +
                "\n" + "Предмет в правой руке: " + getItemInHand();

    }

    @Override
    public String showAbilityHand() { // Полиморфизм - один метод много реализаций (Ad-hoc-полиморфизм переопределение метода)

        return "Привет!!! Я правая рука, смотри что могу: " + "\n" + "QWERTYUIOP[]ASDFGHJKL;'ZXCVBNM,./" + "\n" +
                "Все видели?";
    }
}
