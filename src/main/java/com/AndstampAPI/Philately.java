package com.AndstampAPI;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "philately")
public class Philately {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "stamp_name")
    private String stampname;

    @Column(name = "country_name")
    private String countryname;

    @Column(name = "year_released")
    private Integer year;

    // Default constructor
    public Philately() {}

    // Parameterized constructor
    public Philately(String stampname, String lastName, Integer year) {
        this.stampname = stampname;
        this.countryname = lastName;
        this.year = year;
    }

    // Getter and Setter for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter for stampname
    public String getStampname() {
        return stampname;
    }

    public void setStampname(String stampname) {
        this.stampname = stampname;
    }

    // Getter and Setter for countryname
    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname ;
    }

    // Getter and Setter for email
    public Integer getYear() {
        return year;
    }

    public void setEmail(Integer year) {
        this.year = year;
    }

	public void setYear(Integer year) {
		// TODO Auto-generated method stub
		
	}

}
