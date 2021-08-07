package vo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="logintable")
public class login {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	    @Column(name="id")
	    private int id;
	    
	    @Column(name="UserName")
	    private String un;
	    
	    @Column(name="Password")
	    private String pwd;
	    
	    @OnDelete(action=OnDeleteAction.CASCADE)
	    @OneToOne(mappedBy = "login", cascade = CascadeType.ALL,orphanRemoval = true,fetch=FetchType.EAGER)
	    private registration registration;

		public registration getRegistration() {
			return registration;
		}

		public void setRegistration(registration registration) {
			this.registration = registration;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUn() {
			return un;
		}

		public void setUn(String un) {
			this.un = un;
		}

		public String getPwd() {
			return pwd;
		}

		public void setPwd(String pwd) {
			this.pwd = pwd;
		}
}