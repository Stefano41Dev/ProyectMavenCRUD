package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.ICliente;
import Modelo.TblCliente;

public class ClienteImp implements ICliente {

	public void RegistrarCliente(TblCliente cliente) {
		//nos conectamos con la U.P.
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
		//administrar la transaccion
		EntityManager em=emf.createEntityManager();
		try{
			//iniciamos la transaccion..
			em.getTransaction().begin();
			//invocamos el metodo registrar...
			em.persist(cliente);
			//confirmamos
			em.getTransaction().commit();
		}catch(RuntimeException ex){
			ex.getMessage();
		}finally  {
			//cerramos
			em.close();
		} //fin del finally
		
	}  //fin del metodo registrar...

	public void ActualizarCliente(TblCliente cliente) {
		// nos conectamos con la unidad de persistencia...
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
	//administrar las transacciones
	EntityManager em=emf.createEntityManager();
	try{
		//iniciamos la transaccion
		em.getTransaction().begin();
		//invocamos el metodo actualizar
		em.merge(cliente);
		//confirmamos 
		em.getTransaction().commit();
	}catch(RuntimeException e){
		//enviamos un mensaje en caso de error
		System.out.println(e.getMessage());
	}finally{
		//cerramos
		em.close();
	} //fin del finally
		
	} //fin del metodo actualizar...

	public void EliminarCliente(TblCliente cliente) {
		//nos conectamos con la u.p
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
		//para administrar las transacciones
		EntityManager em=emf.createEntityManager();
		try{
			//iniciamos la transaccion
			em.getTransaction().begin();
			//recuperamos el codigo a eliminar...
			TblCliente  codelim=em.find(TblCliente.class,cliente.getIdcliente());
			//aplicamos una condicion
			if(codelim!=null){
				//procedemos a eliminar
				em.remove(codelim);
				//confirmamos
				em.getTransaction().commit();
			}//fin de la condicion...
		}catch(RuntimeException e){
		System.out.println(e.getMessage());
		}finally{
			//cerramos
			em.close();
		} //fin del finally
		
	} //fin del metodo eliminar...

	public List<TblCliente> ListarCliente() {
		//nos conectamos con la u.p.
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAWebMiercoles");
		//para administrar las transacciones
		EntityManager em=emf.createEntityManager();
		//para el listado
		List<TblCliente> listadocliente=null;
		try{
			//iniciamos la transaccion..
			em.getTransaction().begin();
			//hacemos la consulta JPQL
			listadocliente=em.createQuery("select c from TblCliente c",TblCliente.class).getResultList();
		     //confirmamos
			em.getTransaction().commit();
		
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
		}finally{
			//cerramos
			em.close();
		}  //fin del finally
		//retornamos el listado
		return listadocliente;
	}  //fin del metodo listar....

	public TblCliente BuscarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}  //fin del metodo buscar....

} //fin de la clase...
