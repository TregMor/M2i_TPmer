package tpBonjour;
import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean //pr�cise au serveur: bean g�r� par JSF comme mod�le associ� � 1 ou + vues. Le nom du bean = nom de la classe (majuscule en moins) 
@RequestScoped //pr�cise au serveur bean a pr port�e la requ�te. 
public class Bonjour implements Serializable {  //capacit� de survivre au red�marrage du serveur. 

	private static final long serialVersionUID = 1L;
	private String nom;
    private String prenom;

    public String getNom() {
        return nom;
    }
    public void setNom( String nom ) {
        this.nom = nom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom( String prenom ) {
        this.prenom = prenom;
    }
    
//    public void validateFields(FacesContext context, UIComponent toValidate, Object value){
//    	String nom = (String) value;
//    	
//    	
//    	
//    }
}
