package com.file.hibernate;

import javax.persistence.*;
@Entity
@Table(name="employee")

public class Employee implements java.io.Serializable
{
	@Id
	@Column(name="eid")
int no;
	@Column(name="firstname")

String fname;
@Column(name="lastname")
String lname;
@Column(name="email")

String email;

public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
