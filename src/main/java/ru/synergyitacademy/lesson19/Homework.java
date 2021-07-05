package ru.synergyitacademy.lesson19;

import ru.synergyitacademy.lesson19.dto.Contact;
import ru.synergyitacademy.lesson19.dto.PhoneBook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Homework {

    private static final List<Contact> CONTACTS;
    private static final Set<String> NAMES = new HashSet<>(5);
    private static final Set<String> LASTNAMES = new HashSet<>(5);

    static {
        LASTNAMES.add("Ivanov");
        LASTNAMES.add("Petrov");
        LASTNAMES.add("Sidorov");
        LASTNAMES.add("Kuznetsov");
        LASTNAMES.add("Orlov");

        NAMES.add("Vitalii");
        NAMES.add("Alexey");
        NAMES.add("Sergey");
        NAMES.add("Nikolay");
        NAMES.add("Dmitry");

        CONTACTS = new ArrayList<>(25);

        for (int i = 0; i < 25; i++) {
            Contact contact = new Contact();
            contact.setFirstName(new ArrayList<>(NAMES).get(generateNumber(4)));
            contact.setLastName(new ArrayList<>(LASTNAMES).get(generateNumber(4)));
            CONTACTS.add(contact);
        }

    }

    public static void main(String[] args) {

        List<PhoneBook> result = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            PhoneBook phoneBook = getRandomPhoneBook("927");

            List<PhoneBook> contacts = new ArrayList<>();
            int size = generateNumber(7);
            for (int j = 0; j < size; j++) {
                PhoneBook phoneBookContact = getRandomPhoneBook("917");
                contacts.add(phoneBookContact);
            }

            phoneBook.setContacts(contacts);
            result.add(phoneBook);
        }

        for (PhoneBook phoneBook : result) {
            System.out.println(phoneBook);
        }

        Set<PhoneBook> commonContacts = new HashSet<>();
        for (int k1 = 0; k1 < result.size(); k1++) {
            PhoneBook p1 = result.get(k1);
            for (int k2 = k1 + 1; k2 < result.size() - k1; k2++) {
                PhoneBook p2 = result.get(k2);
                commonContacts.addAll(intersect(p1, p2));
            }
        }
        System.out.println("--------------");
        System.out.println(commonContacts);
    }

    private static PhoneBook getRandomPhoneBook(String code) {
        PhoneBook phoneBook = new PhoneBook(code);
        Contact contact = CONTACTS.get(generateNumber(15));
        phoneBook.setName(contact.getFirstName());
        phoneBook.setLastName(contact.getLastName());
        return phoneBook;
    }

    private static int generateNumber(int bound) { // 0..bound
        int result = bound + 1;
        while (result >= bound + 1) {
            result = Math.abs(new Random().nextInt(bound + 1));
        }
        return result;
    }

    private static List<PhoneBook> intersect(PhoneBook p1, PhoneBook p2) {
        List<PhoneBook> phoneBooks = new ArrayList<>(p1.getContacts());
        phoneBooks.retainAll(p2.getContacts());
        return phoneBooks;
    }
}
