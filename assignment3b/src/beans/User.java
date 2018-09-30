//Taylor Rosby
//CST -235
//ICA 3

//This file creates a user
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ManagedBean
@ViewScoped
public class User {
	//Data validation for first and last name
	//checks to see if the input is null and meets the size requirements
	@NotNull(message = "Please enter a valid input")
	@Size(min=3, max=15)
	String firstname = "";
	
	@NotNull(message = "Please enter a valid input")
	@Size(min=3, max=15)
	String lastname = "";
	
	//constructor
	public User() {
		
		firstname = "Tay";
		lastname = "Austin";
	}
	
	//The getters and setters allow for the data to be passed from the form to the response
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	

}
