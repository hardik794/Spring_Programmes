package vo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "registrationtable")

public class registration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "registrationID")
	private int rid;

	@Column(name = "FirstName")
	private String fn;

	@Column(name = "LastName")
	private String ln;

	@OneToOne
	@JoinColumn(name="login_id")
	private login login;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public login getLogin() {
		return login;
	}

	public void setLogin(login login) {
		this.login = login;
	}

	
}
