package Qspider;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Course {
	@Id
	private int id;
	private String Cname;
	private double fee;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}

}
