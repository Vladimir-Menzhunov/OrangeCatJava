package com.company.Hand;

public abstract class Hand
{
    private int powerHand;
    private String itemInHand;

    public Hand(int powerHand, String itemInHand)
    {
        this.powerHand = powerHand;
        this.itemInHand = itemInHand;
    }

    public String showAbilityHand()
    {
        return "Всем привет с вами рука, я могу что-то делать!";
    }

    public int getPowerHand() {
        return powerHand;
    }

    public String getItemInHand() {
        return itemInHand;
    }


    public void setPowerHand(int powerHand) {
        this.powerHand = powerHand;
    }

    public void setItemInHand(String itemInHand) {
        this.itemInHand = itemInHand;
    }


    @Override
    public String toString() {  // Полиморфизм - один метод много реализаций. (Ad-hoc-полиморфизм, переопределение метода)
        return "Рука: " +
                "\n" + "Мощь руки: " + powerHand +
                "\n" + "Предмет в руке: " + itemInHand;
    }
}
