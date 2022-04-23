package main;

import java.util.Date;

public class Appointment {
	
	
	private String appointmentId;
	private Date appointmentDate;
	private String description;
	
	public Appointment(String appointmentId, String appointmentDate, String description) {
		if(appointmentId == null || appointmentId.length() > 10) {
			throw new IllegalArgumentException("Invalid Input");
		}
		
		if(appointmentDate == null || appointmentDate.before()) {
			throw new IllegalArgumentException("Invalid Input)");
		}
				
		if(description == null || description.length() > 50) {
			throw new IllegalArgumentException("Invalid Input");
		}
		
		this.appointmentId = appointmentId;
		this.description = description;
	}
	
	public String getAppointmentId() {
		return appointmentId;
	}
	
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	
	
	public String getdescription() {
		return description;
	
	}
	
	

}
