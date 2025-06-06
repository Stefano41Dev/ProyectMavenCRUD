package Modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity  //indica que es una entidad JPA
@Table(name="tbl_cliente") //el nombre de la tabla en la BD...
@NamedQuery(name="TblUsuario.findAll",query="SELECT u FROM TblUsuario u")
public class TblUsuario {
  @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int idpsuario; 
   private String usuario;
   private String password;
   
   
public TblUsuario() {
	//super();
}
public int getIdpsuario() {
	return idpsuario;
}
public void setIdpsuario(int idpsuario) {
	this.idpsuario = idpsuario;
}
public String getUsuario() {
	return usuario;
}
public void setUsuario(String usuario) {
	this.usuario = usuario;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public TblUsuario(int idpsuario, String usuario, String password) {
	//super();
	this.idpsuario = idpsuario;
	this.usuario = usuario;
	this.password = password;
}
   
   
}
