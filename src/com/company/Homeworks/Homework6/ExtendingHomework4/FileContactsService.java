package com.company.Homeworks.Homework6.ExtendingHomework4;



import com.company.Homeworks.Homework4.Contact;
import com.company.Homeworks.Homework4.ContactsList;
import com.company.Homeworks.Homework4.ContactsService;

import java.io.*;


public class FileContactsService implements ContactsService {
    private File file;


    public FileContactsService(){
        file=new File("D:\\Hillel\\src\\com\\company\\Homeworks\\Homework4\\addresses.txt");
    }
    @Override
    public ContactsList getAll() {
        FileReader fr;
        BufferedReader bf=null;
        String str;
        ContactsList contactsList=new ContactsList();
        try {
            fr = new FileReader(file);
             bf = new BufferedReader(fr);
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
        return contactsList;
    }

    @Override
    public void remove(String name) {
FileReader fr;
BufferedReader bf=null;
FileWriter fw;
BufferedWriter bw=null;
ContactsList contactsList=new ContactsList();
try {
    fr=new FileReader(file);
    bf=new BufferedReader(fr);
    String str;
    while (bf.ready()){
        str=bf.readLine();
        contactsList.add(new Contact(str.split(" ")[0],str.split(" ")[1]));
    }
    int item=contactsList.get(name);
    if (item==-1){
        System.out.println("Name is not exist in file");
    }else {
        System.out.println("Contact removed from list in file!");
        contactsList.remove(item);
    }

    fw=new FileWriter(file);
    bw=new BufferedWriter(fw);
    for (int i = 0; i <contactsList.size() ; i++) {
        bw.write(contactsList.get(i)+"\n");
    }
}catch (FileNotFoundException e){
    System.out.println("File not found!");
}catch (IOException e){
    System.out.println("File is not ready!");
} finally {
    try {
        bf.close();
        bw.close();
    } catch (IOException e) {
        System.out.println("Error!");
    }
}

    }

    @Override
    public void add(Contact c) {
        FileWriter fw;
        BufferedWriter bf=null;
        try {
            fw=new FileWriter(file,true);
bf=new BufferedWriter(fw);
            bf.write(c.getName()+" "+c.getPhone()+"\n");
        } catch (IOException e) {
            System.out.println("File is not ready!");
        }finally {
            try {
                bf.close();
            } catch (IOException e) {
                System.out.println("Error!");
            }
        }
    }
}
