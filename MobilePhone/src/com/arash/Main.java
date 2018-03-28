package com.arash;

public class Main {

    public static void main(String[] args) {

        MobilePhone mobile = new MobilePhone();
        Contact contact1 = new Contact("Jimmy", "4445556789");
        Contact contact2 = new Contact("Tom", "1234456789");

        mobile.storeContact(contact1);
        mobile.storeContact(contact2);
        mobile.modifyContact(contact1);

    }
}
