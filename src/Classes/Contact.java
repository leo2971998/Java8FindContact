package Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contact {
    private String name;
    private String company;
    private String title;
    private String mobile;
    private String alternateMobile;
    private String email;
    private LocalDate dateCreated;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAlternateMobile() {
        return alternateMobile;
    }

    public void setAlternateMobile(String alternateMobile) {
        this.alternateMobile = alternateMobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Contact() {
    }

    public Contact(String name, String company, String title, String mobile, String alternateMobile, String email, LocalDate dateCreated) {
        this.name = name;
        this.company = company;
        this.title = title;
        this.mobile = mobile;
        this.alternateMobile = alternateMobile;
        this.email = email;
        this.dateCreated = dateCreated;
    }
    public static Contact CreateContact(String details) {
        String[] str = new String[7];
        str = details.split(",");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        Contact C = new Contact(str[0], str[1], str[2], str[3], str[4], str[5], LocalDate.parse(str[6], formatter));
        return C;
    }
    public String Display() {
        return String.format("%5s %20s %20s %20s %20s %20s %20s", name, company, title, mobile, alternateMobile, email, dateCreated);
    }
}
