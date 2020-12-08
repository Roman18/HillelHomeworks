package com.company.Homeworks.Homework4;

public class ContactsList {
    private Contact[] contacts;
    private int index=0;

    public ContactsList() {
        contacts = new Contact[10];
    }

    public void add(Contact c) {
        if (contacts.length == index) {
            changeSize();
        }
        contacts[index++] = c;
    }

    private void changeSize() {
        Contact[] buffer = new Contact[(int) (contacts.length * 1.5)];
        for (int i = 0; i < contacts.length; i++) {
            buffer[i] = contacts[i];
        }
        contacts = buffer;
    }

public int get(String name){ // получение индекса по имени (если совпадений не обнаружено, то возвращает -1)
    for (int i = 0; i <index ; i++) {
        if (contacts[i].getName().equals(name)){
            return i;
        }
    }
    return -1;
}
public Contact get(int i){// получение элемента по индексу (для перебора элементов)
        return contacts[i];
}

    public void remove(int index) {

        Contact[] buffer = new Contact[contacts.length - 1];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = contacts[i < index ? i : i + 1];
        }
        contacts = buffer;
        this.index--;

    }
    @Override
    public String toString() {
        if (index==0){
            return "List is empty!";
        }
        String result = "" ;
        for (int i = 0; i < index; i++) {
            if (i == index - 1) {
                result += contacts[i];
            } else {
                result += contacts[i] + ", " ;
            }
        }
        return result;
    }

    public int size(){
        return index;
    }

}
