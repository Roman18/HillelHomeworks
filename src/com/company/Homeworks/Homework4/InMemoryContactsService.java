package com.company.Homeworks.Homework4;

import java.io.*;

public class InMemoryContactsService implements ContactsService {

    private ContactsList contactsList;
    public InMemoryContactsService(){

        this.contactsList=new ContactsList();
        loadFromFile(); //при инициализации загрузка из файла в список
    }

    private void loadFromFile(){
        File file=new File("D:\\Hillel\\src\\com\\company\\Homeworks\\Homework4\\addresses.txt");
        FileReader fr;
        BufferedReader bf=null;
        String str;
        try {
            if (!file.exists()){
                file.createNewFile();
            }
            fr=new FileReader(file);
            bf=new BufferedReader(fr);
            while (bf.ready()){
                str=bf.readLine();
                contactsList.add(new Contact(str.split(" ")[0],str.split(" ")[1]));
            }
        } catch (FileNotFoundException e){
            System.out.println("File not found!");
        } catch (IOException e){
            System.out.println("File is not ready!");
        } finally {
            try {
                bf.close();
            } catch (IOException e) {
                System.out.println("Error!");
            }
        }
    }
    @Override
    public ContactsList getAll() {
        return contactsList;
    }

    @Override
    public void remove(String name) {
int index=contactsList.get(name);
if (index==-1){
    System.out.println("Name is not exist in memory");
}else {
    System.out.println("Contact removed from list in memory!");
    contactsList.remove(index);
}
    }

    @Override
    public void add(Contact c) {
      contactsList.add(c);
    }
}
