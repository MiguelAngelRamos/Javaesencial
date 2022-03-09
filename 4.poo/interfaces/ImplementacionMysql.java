package poo.interfaces;

public class ImplementacionMysql implements IAccesoDatos{

	@Override
	public void insertar() {
		System.out.println("Insertar Datos desde Mysql");
	}

	@Override
	public void listar() {
		System.out.println("Listar Datos desde Mysql");
	}

	@Override
	public void actualizar() {
		System.out.println("Actualizar Datos desde Mysql");
	}

	@Override
	public void eliminar() {
		System.out.println("Eliminar Datos desde Mysql");
		
	}

}
