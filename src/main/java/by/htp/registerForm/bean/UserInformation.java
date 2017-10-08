package by.htp.registerForm.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "userinfo")
public class UserInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "u_id")
	private int u_id;

	@Column(name = "date_of_birth")
	private Date date_of_birth;

	@Column(name = "city")
	private String city;

	@Column(name = "phone")
	private Long phone;

	public UserInformation() {
		super();
	}

	public UserInformation(int u_id, Date date_of_birth, String city, long phone) {
		super();
		this.u_id = u_id;
		this.date_of_birth = date_of_birth;
		this.city = city;
		this.phone = phone;
	}

	public int getId() {
		return u_id;
	}

	public void setId(int u_id) {
		this.u_id = u_id;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UserInformation [id=" + u_id + ", date_of_birth=" + date_of_birth + ", city=" + city + ", phone="
				+ phone + "]";
	}

}
