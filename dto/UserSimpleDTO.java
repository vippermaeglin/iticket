package me.iticket.android.dto;

import java.util.Date;
import java.util.List;


/**
 * 
 * @author Vinicius
 *
 */
public class UserSimpleDTO {

    protected String id = null;
    protected String name = null;
    protected String cpf = null;

    public UserSimpleDTO() {

    }
    	
    public UserSimpleDTO(String id, String cpf, String name) {
    	this.id = id;
    	this.cpf = cpf;
    	this.name = name;
	}
    
    public UserSimpleDTO(UserSimpleDTO user) {
    	id = user.getId();
    	if(user.getName()!=null)
    		name = user.getName();
    	if(user.getCpf()!=null)
    		cpf = user.getCpf(); 	
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
}