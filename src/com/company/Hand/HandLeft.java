package com.company.Hand;

public class HandLeft extends Hand
{
    public HandLeft(int powerHand, String itemInHand) {
        super(powerHand, itemInHand);
    }

    @Override
    public String toString() { // Полиморфизм - один метод много реализаций. (Ad-hoc-полиморфизм, переопределение метода)
        return "Левая рука: " + "\n" + "Мощь левой руки: " + getPowerHand() +
                "\n" + "Предмет в левой руке: " + getItemInHand();

    }

    @Override
    public String showAbilityHand() { // Полиморфизм - один метод много реализаций. (Ad-hoc-полиморфизм, переопределение метода)

        return "Всем хай с вами левая рука кота, я могу клац-клац по кнопкам мыши!";
    }
}
