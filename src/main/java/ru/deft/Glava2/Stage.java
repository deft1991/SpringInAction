package ru.deft.Glava2;

public class Stage {
    public Stage() {
    }

    private static class StageSingletonHolder{
        static Stage instance = new Stage(); // Создание экземпляра
    }

    public static Stage getInstance(){
        return StageSingletonHolder.instance; // Возвращает экземпляр
    }

    public void turnOnLights(){

    }

    public void turnOffLights(){

    }
}
