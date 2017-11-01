package me.iticket.android.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Vinicius
 *
 */
@JsonInclude(Include.NON_NULL)
public class UserDTO extends UserSimpleDTO{

    // super: id, name, cpf
    private Date createdAt = null;
    private Date bornDate = null;
    private String email = null;
    private String cellphone = null;
    private String facebookId = null;
    private String gplusId = null;
    private String gender = null;
    private String pushDeviceToken = null;
    private String deviceType = null;
    private Integer fidelityPoints = null;
    @JsonIgnore
    private String avatar = null;
    @JsonIgnore
    private Integer dailyPoints = null;

    /**
     * 
     */
    public UserDTO(){
    	
    }
    
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}


	/**
	 * @return the createdAt
	 */
	public Date getCreatedAt() {
		return createdAt;
	}


	/**
	 * @param createdAt the createdAt to set
	 */
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the bornDate
	 */
	public Date getBornDate() {
		return bornDate;
	}


	/**
	 * @param bornDate the bornDate to set
	 */
	public void setBornDate(Date bornDate) {
		this.bornDate = bornDate;
	}


	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}


	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the fidelityPoints
	 */
	public Integer getFidelityPoints() {
		return fidelityPoints;
	}

	/**
	 * @param fidelityPoints the fidelityPoints to set
	 */
	public void setFidelityPoints(Integer fidelityPoints) {
		this.fidelityPoints = fidelityPoints;
	}

	/**
	 * @return the dailyPoints
	 */
	public Integer getDailyPoints() {
		return dailyPoints;
	}

	/**
	 * @param dailyPoints the dailyPoints to set
	 */
	public void setDailyPoints(Integer dailyPoints) {
		this.dailyPoints = dailyPoints;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the cellphone
	 */
	public String getCellphone() {
		return cellphone;
	}

	/**
	 * @param cellphone the cellphone to set
	 */
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	/**
	 * @return the facebookId
	 */
	public String getFacebookId() {
		return facebookId;
	}

	/**
	 * @param facebookId the facebookId to set
	 */
	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	/**
	 * @return the gplusId
	 */
	public String getGplusId() {
		return gplusId;
	}

	/**
	 * @param gplusId the gplusId to set
	 */
	public void setGplusId(String gplusId) {
		this.gplusId = gplusId;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the pushDeviceToken
	 */
	public String getPushDeviceToken() {
		return pushDeviceToken;
	}

	/**
	 * @param pushDeviceToken the pushDeviceToken to set
	 */
	public void setPushDeviceToken(String pushDeviceToken) {
		this.pushDeviceToken = pushDeviceToken;
	}

	/**
	 * @return the avatar
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * @param avatar the avatar to set
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * @return the deviceType
	 */
	public String getDeviceType() {
		return deviceType;
	}

	/**
	 * @param deviceType the deviceType to set
	 */
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public UserSimpleDTO getSuper(){
		return new UserSimpleDTO(id, cpf, name);
	}

}
