import Classes.*;

import java.sql.Array;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of contact details: ");
        int num = sc.nextInt();
        sc.nextLine();
        List<Contact> C = new ArrayList<Contact>();
        List<Contact> result = new ArrayList<Contact>();
        ContactBO CBO =  new ContactBO();
        for (int i = 0; i < num; i++) {
            C.add(Contact.CreateContact(sc.nextLine()));
        }
        System.out.println("Enter a search type: ");
        System.out.println("1. Name");
        System.out.println("2. Date Created");
        System.out.println("3. Email Domain");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Enter the names:");
                String name = sc.nextLine();
                List<String> names = Arrays.asList(name.split(","));
                result = CBO.FindContact(C, names);
                result.stream().forEach(T -> System.out.println(T.Display()));
                break;
            case 2:
                System.out.println("Enter the date to search contacts that were created on that date: ");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                result = CBO.FindContact(C, LocalDate.parse(sc.nextLine(), formatter));
                result.stream().forEach(T -> System.out.println(T.Display()));
                break;
            case 3:
                System.out.println("Enter the Email domain to search contacts that have same email domain: ");
                String domain = sc.nextLine();
                result = CBO.FindContact(C, domain);
                result.stream().forEach(T -> System.out.println(T.Display()));
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}