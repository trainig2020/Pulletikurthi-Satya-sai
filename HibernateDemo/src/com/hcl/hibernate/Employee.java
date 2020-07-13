package com.hcl.hibernate;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.hcl.hiber.Address;

@Entity
public class Employee {
 @Id @GeneratedValue(strategy = GenerationType.AUTO )
 private int empId;

private String empName;

@Temporal(TemporalType.DATE)
 private Date date;
@ElementCollection(fetch = FetchType.EAGER)
private Set<Address> listAddress= new HashSet<Address>();

//	 @Embedded  @AttributeOverrides({ 
//	  @AttributeOverride(name ="street",  column=@Column(name="Street_Name")),
//	  @AttributeOverride(name = "city",  column=@Column(name="City_Name")),
//	  @AttributeOverride(name = "state", column=@Column(name="State_Name"))
//	  }) 
	 
//private  Address  Home;
//private Address Office;

//public Address getHome() {
//	return Home;
//}
//public void setHome(Address home) {
//	Home = home;
//}
//public Address getOffice() {
//	return Office;
//}
//public void setOffice(Address office) {
//	Office = office;
//}


public Set<Address> getListAddress() {
	return listAddress;
}
public void setListAddress(Set<Address> listAddress) {
	this.listAddress = listAddress;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}

}
