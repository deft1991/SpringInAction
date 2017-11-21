package ru.deft.Glava1;

public class BraveKnight implements Knight {
    Quest quest;

    public BraveKnight(Quest quest) { // внедрение зависимости через конструктор
        this.quest = quest;
    }

    public void embarkOnQuest(){
        quest.embark();
    }
}
