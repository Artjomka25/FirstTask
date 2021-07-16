package com.company;

public class LightBulb {
    private boolean isOn;
    private String color = "Прозрачный";
    private boolean broken = false;

    public void On() {
        if (!broken) {
            isOn = true;
            color = "Желтый";
        }
    }

    public void Off() {
        isOn = false;
        color = "Красный";
    }

    public void toBreak() {
        broken = true;
        isOn = false;
        color = "Красный";
    }

    public void displayInfo() {
        if (isOn) {
            System.out.println("Положение: Включена");
        } else {
            System.out.println("Положение: Выключена");
        }
        if (broken) {
            System.out.println("Состояние: Сломана");
        } else {
            System.out.println("Состояние: Рабочая");
        }
        System.out.println("Цвет: " + color);
    }
}
