package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String birth;
    private String option;
    private String select1;
    private String select2;
    private String contacts;
    public User() {
        firstName = "";
        lastName = "";
        email = "";
        birth =null;
        select1="";
        select2="";
        contacts="";
    }

    public User(String firstName, String lastName, String email,String birth,String option,String select1,String select2,String contacts) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.birth = birth;
        this.option = option;
        this.select1 = select1;
        this.select2= select2;
        this.contacts=contacts;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }
    public String getSelect1() {
        return select1;
    }

    public void setSelect1(String select1) {
        this.select1 = select1;
    }
    public String getSelect2() {
        return select2;
    }

    public void setSelect2(String select2) {
        this.select2 = select2;
    }
    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }
}