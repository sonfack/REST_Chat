package vn.edu.ifi.chatbot.model;

import java.util.Date;

public class Profile {
	private long profileId; 
	private String name ; 
	private String phone; 
	private String email; 
	private Date created ; 
	
	public Profile() {
		
	}
	
	

	public Profile(long profileId, String name, String phone, String email) {
		super();
		this.profileId = profileId;
		this.name = name;
		this.phone = phone;
		this.email = email;

	}



	public long getProfileId() {
		return profileId;
	}

	public void setProfileId(long profileId) {
		this.profileId = profileId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	

}
