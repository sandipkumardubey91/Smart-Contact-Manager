package com.aec.scm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aec.scm.model.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact, Long> {

}