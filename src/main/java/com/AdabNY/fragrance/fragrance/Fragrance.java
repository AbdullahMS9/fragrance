package com.AdabNY.fragrance.fragrance;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="fragrance_info")
public class Fragrance {
    @Id
    @Column(name="url", unique = true)
    private String url;

    private String perfume;
    private String brand;
    private String country;
    private String gender;

    private String rating_val;
    private int rating_count;
    private int year;

    private String top;
    private String middle;
    private String base;

    private String perfumer1;
    private String perfumer2;

    private String mainaccord1;
    private String mainaccord2;
    private String mainaccord3;
    private String mainaccord4;
    private String mainaccord5;
    // END OF DATA MEMBERS

    // #########################################################################

    // START OF CONSTRUCTORS
    public Fragrance() {
    }

    public Fragrance(String perfume) {
        this.perfume = perfume;
    }

    public Fragrance(String url, String perfume, String brand, String country, String gender,
                     String rating_val, int rating_count, int year, String top, String middle,
                     String base, String perfumer1, String perfumer2, String mainaccord1, String mainaccord2,
                     String mainaccord3, String mainaccord4, String mainaccord5) {
        this.url = url;
        this.perfume = perfume;
        this.brand = brand;
        this.country = country;
        this.gender = gender;
        this.rating_val = rating_val;
        this.rating_count = rating_count;
        this.year = year;
        this.top = top;
        this.middle = middle;
        this.base = base;
        this.perfumer1 = perfumer1;
        this.perfumer2 = perfumer2;
        this.mainaccord1 = mainaccord1;
        this.mainaccord2 = mainaccord2;
        this.mainaccord3 = mainaccord3;
        this.mainaccord4 = mainaccord4;
        this.mainaccord5 = mainaccord5;
    }
    // END OF CONSTRUCTORS

    // #########################################################################

    // START OF GETTERS & SETTERS
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPerfume() {
        return perfume;
    }

    public void setPerfume(String perfume) {
        this.perfume = perfume;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRating_val() {
        return rating_val;
    }

    public void setRating_val(String rating_val) {
        this.rating_val = rating_val;
    }

    public int getRating_count() {
        return rating_count;
    }

    public void setRating_count(int rating_count) {
        this.rating_count = rating_count;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTop() {
        return top;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public String getMiddle() {
        return middle;
    }

    public void setMiddle(String middle) {
        this.middle = middle;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getPerfumer1() {
        return perfumer1;
    }

    public void setPerfumer1(String perfumer1) {
        this.perfumer1 = perfumer1;
    }

    public String getPerfumer2() {
        return perfumer2;
    }

    public void setPerfumer2(String perfumer2) {
        this.perfumer2 = perfumer2;
    }

    public String getMainaccord1() {
        return mainaccord1;
    }

    public void setMainaccord1(String mainaccord1) {
        this.mainaccord1 = mainaccord1;
    }

    public String getMainaccord2() {
        return mainaccord2;
    }

    public void setMainaccord2(String mainaccord2) {
        this.mainaccord2 = mainaccord2;
    }

    public String getMainaccord3() {
        return mainaccord3;
    }

    public void setMainaccord3(String mainaccord3) {
        this.mainaccord3 = mainaccord3;
    }

    public String getMainaccord4() {
        return mainaccord4;
    }

    public void setMainaccord4(String mainaccord4) {
        this.mainaccord4 = mainaccord4;
    }

    public String getMainaccord5() {
        return mainaccord5;
    }

    public void setMainaccord5(String mainaccord5) {
        this.mainaccord5 = mainaccord5;
    }
    // END OF GETTERS AND SETTERS

    // #########################################################################
}
