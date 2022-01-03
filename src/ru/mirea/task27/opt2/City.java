package ru.mirea.task27.opt2;

public class City {
    private String town;
    private String country;

    public City(String country, String town) {
        this.country = country;
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public String getTown() {
        return town;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
