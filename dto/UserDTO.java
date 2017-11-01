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
public class UserDTO{
    protected String id = null;
    protected String name = null;
    protected String cpf = null;
    protected Date createdAt = null;
    protected Date bornDate = null;
    protected String email = null;
    protected String cellphone = null;
    protected String facebookId = null;
    protected String gplusId = null;
    protected String gender = null;
    protected String pushDeviceToken = null;
    protected String deviceType = null;
    protected Integer fidelityPoints = null;
    @JsonIgnore
    protected String avatar = null;
    @JsonIgnore
    protected Integer dailyPoints = null;
    @JsonIgnore
    protected String _id = null;
    @JsonIgnore
    protected String _rev = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(String facebookId) {
        this.facebookId = facebookId;
    }

    public String getGplusId() {
        return gplusId;
    }

    public void setGplusId(String gplusId) {
        this.gplusId = gplusId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPushDeviceToken() {
        return pushDeviceToken;
    }

    public void setPushDeviceToken(String pushDeviceToken) {
        this.pushDeviceToken = pushDeviceToken;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public Integer getFidelityPoints() {
        return fidelityPoints;
    }

    public void setFidelityPoints(Integer fidelityPoints) {
        this.fidelityPoints = fidelityPoints;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getDailyPoints() {
        return dailyPoints;
    }

    public void setDailyPoints(Integer dailyPoints) {
        this.dailyPoints = dailyPoints;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
    }
}
