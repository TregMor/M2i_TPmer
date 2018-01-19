package tpConnexion;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class Connexion implements Serializable {  //capacit� de survivre au red�marrage du serveur. 

	private static final long serialVersionUID = 1L;
	private String mail;
    private String password;
    
    
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
