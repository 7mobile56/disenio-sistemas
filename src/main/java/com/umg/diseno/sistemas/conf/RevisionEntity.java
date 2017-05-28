package com.umg.diseno.sistemas.conf;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionListener;

@Entity
@org.hibernate.envers.RevisionEntity(RevisionListener.class)
@Table(name = "rev_aud")
public class RevisionEntity extends DefaultRevisionEntity{

	private static final long serialVersionUID = 1L;
	
	private String username;
	private String remoteAddress;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getRemoteAddress() {
		return remoteAddress;
	}
	public void setRemoteAddress(String remoteAddress) {
		this.remoteAddress = remoteAddress;
	}

}
