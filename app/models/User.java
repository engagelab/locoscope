package models;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity
public class User {

	@Id
	private ObjectId id;
	private String timeOfFirstLogin;
	private String fullName;
	private String photoURL;
	
	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	/**
	 * @return the timeOfFirstLogin
	 */
	public String getTimeOfFirstLogin() {
		return timeOfFirstLogin;
	}

	/**
	 * @param timeOfFirstLogin the timeOfFirstLogin to set
	 */
	public void setTimeOfFirstLogin(String timeOfFirstLogin) {
		this.timeOfFirstLogin = timeOfFirstLogin;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the photoURL
	 */
	public String getPhotoURL() {
		return photoURL;
	}

	/**
	 * @param photoURL the photoURL to set
	 */
	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

}
