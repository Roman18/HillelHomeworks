package com.company.Homeworks.Homework6.ExtendingHomework4;


public class InMemoryContactsService implements ContactService {

    private ContactsList contactsList;

    public InMemoryContactsService() {
        this.contactsList = new ContactsList();
    }


    @Override
    public ContactsList getAll() {
        return contactsList;
    }

    @Override
    public void remove(String name) {
        int index = contactsList.get(name);
        if (index == -1) {
            System.out.println("Name is not exist in memory");
        } else {
            System.out.println("Contact removed from list in memory!");
            contactsList.remove(index);
        }
    }

    @Override
    public void add(Contact c) {
        contactsList.add(c);
    }

    @Override
    public void searchByName(String name) {
ContactsList list=contactsList.searchByName(name);
if (list.isEmpty()){
    System.out.println("Matches were not found");
}else {
    System.out.println(list);
}
    }

    @Override
    public void searchByPhone(String phone) {
        ContactsList list=contactsList.searchByNumber(phone);
        if (list.isEmpty()){
            System.out.println("Matches were not found");
        }else {
            System.out.println(list);
        }
    }

}
