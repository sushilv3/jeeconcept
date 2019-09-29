package testin.kodecamp.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.SelectItem;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import in.kodecamp.beans.ContactDetails;

@Named
@ViewScoped
public class TestContactBean implements Serializable{

	private String contact;
	private String selectedServiceProvider;
	
	private List<SelectItem> serviceProviders = new ArrayList<>();
	
	private List<ContactDetails> contacts = new ArrayList<>();

	
	@Inject
	private TestItemsList testLItemsList;
	
	@PostConstruct
	public void init() {
		this.serviceProviders.clear();
		this.serviceProviders.addAll(testLItemsList.items());
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}



	public String getSelectedServiceProvider() {
		return selectedServiceProvider;
	}

	public void setSelectedServiceProvider(String selectedServiceProvider) {
		this.selectedServiceProvider = selectedServiceProvider;
	}

	public List<SelectItem> getServiceProviders() {
		return serviceProviders;
	}

	public void setServiceProviders(List<SelectItem> serviceProviders) {
		this.serviceProviders = serviceProviders;
	}

	public TestItemsList getTestLItemsList() {
		return testLItemsList;
	}

	public void setTestLItemsList(TestItemsList testLItemsList) {
		this.testLItemsList = testLItemsList;
	}

	public List<ContactDetails> getContacts() {
		return contacts;
	}

	public void setContacts(List<ContactDetails> contacts) {
		this.contacts = contacts;
	}
	public void addNew() {
		
		
		this.contacts.add(new ContactDetails(this.contact, this.selectedServiceProvider));
		
		System.out.println("add new method called: " + this.contacts);
	}
}
