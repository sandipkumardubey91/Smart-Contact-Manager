package com.aec.scm.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aec.scm.model.Contact;
import com.aec.scm.repository.ContactRepo;
import com.aec.scm.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepo contactRepo;

    @Override
    public Contact save(Contact contact) {
        return contactRepo.save(contact);
    }

    @Override
    public List<Contact> getAll() {
        return contactRepo.findAll();
    }

    @Override
    public Contact getById(long id) {
        return contactRepo.findById(id).get();
    }

    @Override
    public void delete(long id) {
         contactRepo.deleteById(id);
    }


    @Override
	public Contact update(Contact contact) {
	
		return contactRepo.save(contact);
	}
}
