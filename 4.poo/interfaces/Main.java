package poo.interfaces;

public class Main {

	public static void main(String[] args) {
		
		// No se puede crear un objeto de una interface
		// IAccesoDatos datos = new IAccesoDatos();
		IAccesoDatos datos  = new ImplementacionMysql();
		actualizar(datos);
		/*
		 * Podemos asignar un objeto que implementa una interface
		 * al tipo de la interface que esta implementando (IAccesoDatos)
		 * */
		datos = new ImplementacionOracle();
		actualizar(datos);
		

	}
	
	public static void actualizar(IAccesoDatos datos) {
		datos.actualizar();
	}

}
