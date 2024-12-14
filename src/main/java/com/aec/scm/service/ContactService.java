package com.aec.scm.service;

import java.util.List;

import com.aec.scm.model.Contact;

public interface ContactService {
    
    Contact save(Contact contact);

    List<Contact> getAll();

    Contact getById(long  id);

    void delete(long id);

    Contact update(Contact contact);
}
