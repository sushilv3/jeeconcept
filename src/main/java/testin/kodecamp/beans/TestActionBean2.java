package testin.kodecamp.beans;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Named;

@Named
@RequestScoped
public class TestActionBean2 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String value;
	private String name;
	private String address;
	private boolean rendered = false;
	
	public boolean isRendered() {
		return rendered;
	}

	public void setRendered(boolean rendered) {
		this.rendered = rendered;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void ajaxMethod(final AjaxBehaviorEvent event) {
		System.out.println("ajax method called");
	}
	
}
