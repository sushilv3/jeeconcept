package testin.kodecamp.beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

@Named
@RequestScoped
public class TestActionResultBean2 {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String action1() {
		System.out.println("ActionsBean 2 : CommandButton: Action");
		final String msg = "Hello " + this.value;
		return "testactionresult2?faces-redirect=true&amp;msg=" + msg;
	}

// Navigation rules does not work
	public String action2() {
		System.out.println("CommandButton : Default ActionListener");
	
		final String msg = "Hello " + this.value;
		return "testactionresult2?faces-redirect=true&amp;msg=" + msg;
	}
	
}
