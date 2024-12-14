package com.aec.scm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="contacts")
public class Contact {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private String description;
    private String websiteLink;
    private String linkedInLink;

    // public Contact(){}

    // public Contact(String address, String description, String email, long id, String linkedInLink, String name, String phoneNumber, String websiteLink) {
    //     this.address = address;
    //     this.description = description;
    //     this.email = email;
    //     this.id = id;
    //     this.linkedInLink = linkedInLink;
    //     this.name = name;
    //     this.phoneNumber = phoneNumber;
    //     this.websiteLink = websiteLink;
    // }

    // public long getId() {
    //     return id;
    // }
    // public void setId(long  id) {
    //     this.id = id;
    // }
    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public String getEmail() {
    //     return email;
    // }
    // public void setEmail(String email) {
    //     this.email = email;
    // }
    // public String getPhoneNumber() {
    //     return phoneNumber;
    // }
    // public void setPhoneNumber(String phoneNumber) {
    //     this.phoneNumber = phoneNumber;
    // }
    // public String getAddress() {
    //     return address;
    // }
    // public void setAddress(String address) {
    //     this.address = address;
    // }
    // public String getDescription() {
    //     return description;
    // }
    // public void setDescription(String description) {
    //     this.description = description;
    // }
    // public String getWebsiteLink() {
    //     return websiteLink;
    // }
    // public void setWebsiteLink(String websiteLink) {
    //     this.websiteLink = websiteLink;
    // }
    // public String getLinkedInLink() {
    //     return linkedInLink;
    // }
    // public void setLinkedInLink(String linkedInLink) {
    //     this.linkedInLink = linkedInLink;
    // }

    
}
