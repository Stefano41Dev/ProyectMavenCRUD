package Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity  //indica que es una entidad JPA
@Table(name="tbl_cliente") //el nombre de la tabla en la BD...
@NamedQuery(name="TblCliente.findAll",query="SELECT t FROM TblCliente t")
public class TblCliente {
//declaramos los atributos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idcliente;
    @Column(name="nombre") //corresponde al campo de la tabla...
	private String nomcliente;
    @Column(name="apellido")
    private String apecliente;
    @Column(name="dni")
	private String dnicliente;
    @Column(name="sexo")
	private String sexcliente;
    @Column(name="telf")
	private String telfcliente;
    @Column(name="nacionalidad")
	private String nacioncliente;
    @Column(name="email")
	private String emailcliente;
	
	
	
	public TblCliente(int idcliente, String nomcliente, String apecliente, String dnicliente, String sexcliente,
			String telfcliente, String nacioncliente, String emailcliente) {
		//super();
		this.idcliente = idcliente;
		this.nomcliente = nomcliente;
		this.apecliente = apecliente;
		this.dnicliente = dnicliente;
		this.sexcliente = sexcliente;
		this.telfcliente = telfcliente;
		this.nacioncliente = nacioncliente;
		this.emailcliente = emailcliente;
	}  //fin del constructor con parametros...
	
	
	public TblCliente(){
		
	}  //constructor vacio...
	
	//setters y getters...
	
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNomcliente() {
		return nomcliente;
	}
	public void setNomcliente(String nomcliente) {
		this.nomcliente = nomcliente;
	}
	public String getApecliente() {
		return apecliente;
	}
	public void setApecliente(String apecliente) {
		this.apecliente = apecliente;
	}
	public String getDnicliente() {
		return dnicliente;
	}
	public void setDnicliente(String dnicliente) {
		this.dnicliente = dnicliente;
	}
	public String getSexcliente() {
		return sexcliente;
	}
	public void setSexcliente(String sexcliente) {
		this.sexcliente = sexcliente;
	}
	public String getTelfcliente() {
		return telfcliente;
	}
	public void setTelfcliente(String telfcliente) {
		this.telfcliente = telfcliente;
	}
	public String getNacioncliente() {
		return nacioncliente;
	}
	public void setNacioncliente(String nacioncliente) {
		this.nacioncliente = nacioncliente;
	}
	public String getEmailcliente() {
		return emailcliente;
	}
	public void setEmailcliente(String emailcliente) {
		this.emailcliente = emailcliente;
	}
	
	
	
	
	
	
}  //fin de la clase....
