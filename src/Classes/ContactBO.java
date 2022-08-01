package Classes;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ContactBO {
    public List<Contact> FindContact(List<Contact> contactList, List<String> name) {
        return contactList.stream().filter(T -> name.contains(T.getName())).collect(Collectors.toList());
    }
    public List<Contact> FindContact(List<Contact> contactList, LocalDate dateCreated) {
        return contactList.stream().filter(T -> T.getDateCreated().equals(dateCreated)).collect(Collectors.toList());
    }
    public List<Contact> FindContact(List<Contact> contactList, String domain) {
        return contactList.stream().filter(T -> T.getEmail().contains(domain)).collect(Collectors.toList());
    }
}
