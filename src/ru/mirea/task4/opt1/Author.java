package ru.mirea.task4.opt1;

public class Author {
    private Author() {};
    private String name, email;
    private char gender;


    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Author:\nname: " + name + "\nemail: " + email + "\ngender: " + gender;
    }
}
