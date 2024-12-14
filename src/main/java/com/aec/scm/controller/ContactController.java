package com.aec.scm.controller;


import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import com.aec.scm.model.Contact;
import com.aec.scm.service.ContactService;

@Controller
// @RequestMapping("/contact/")
@CrossOrigin
public class ContactController {

    @Autowired
    private ContactService contactService;

	@GetMapping("/")
	public String home()
	{
		return "index";
	}

	@GetMapping("/dashboard")
	public String dashboard()
	{
		return "dashboard";
	}

	@GetMapping("/sign-in")
	public String SignIn()
	{
		return "signin";
	}

	@GetMapping("/sign-up")
	public String SignUp()
	{
		return "signup";
	}

    @GetMapping("/contacts")
	public String listContacts(Model model) {
		model.addAttribute("contacts", contactService.getAll());
		return "contacts";
	}
	
	@GetMapping("/contacts/new")
	public String createContactForm(Model model) {
		Contact contact = new Contact();
		model.addAttribute("contact", contact);
		return "create_contact";
	}
	
	@PostMapping("/contacts")
	public String saveContacts(@ModelAttribute("contact") Contact contact) {
		contactService.save(contact);
		
		return "redirect:/contacts";
	}
	
	@GetMapping("/contacts/edit/{id}")
	public String editContactForm(@PathVariable Long id, Model model) {
		model.addAttribute("contact", contactService.getById(id));
		
		return "edit_contact";
	}
	
	@PostMapping("/contacts/{id}")
	public String updateContact(@PathVariable Long id, @ModelAttribute("contact") Contact contact, Model model) {
		
		Contact existingContact = contactService.getById(id);
		existingContact.setId(id);
		existingContact.setName(contact.getName());
		existingContact.setEmail(contact.getEmail());
		existingContact.setAddress(contact.getAddress());
        existingContact.setDescription(contact.getDescription());
        existingContact.setLinkedInLink(contact.getLinkedInLink());
        existingContact.setWebsiteLink(contact.getWebsiteLink());
        existingContact.setPhoneNumber(contact.getPhoneNumber());
		contactService.update(contact);
		return "redirect:/contacts";
	}
	
	@GetMapping("/contacts/{id}")
	public String delete(@PathVariable Long id) {
		contactService.delete(id);
		return "redirect:/contacts";
	}
    
}

