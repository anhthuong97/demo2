package model;

import java.util.Objects;

import javax.persistence.Entity;
@Entity
public class Member {
	private String user;
	private String password;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Member(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Member [user=" + user + ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(password, user);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(password, other.password) && Objects.equals(user, other.user);
	}
	
	
}
