//Taylor Rosby
//CST -235
//ICA 3

//This file controls the idle response

package controllers;

	import javax.faces.application.FacesMessage;
	import javax.faces.bean.ManagedBean;
	import javax.faces.context.FacesContext;
	 
	@ManagedBean
	public class IdleMonitor {
	     
		//the response if the user is idle
	    public void onIdle() {
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, 
	                                        "No activity", "You have been idle for a least 5 seconds"));
	    }
	 
	    //the response when the user becomes active again
	    public void onActive() {
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,
	                                        "Welcome Back", ""));
	    }
	}
