package com.company.Homeworks.Homework4;

public class Menu {
    private MenuAction [] menuActions;
    private int index; // для записи пунктов меню в массив
    private ContactsService csMemory;
    private ContactsService csFile;

    public Menu(){
        this.menuActions=new MenuAction[3];
        this.csMemory=new InMemoryContactsService();
        this.csFile=new FileContactsService();
    }

    public void addAction(MenuAction menuAction){
        menuActions[index++]=menuAction;
    }
    public void run(int number){
        menuActions[number].doAction(csMemory,csFile);
    }
}
