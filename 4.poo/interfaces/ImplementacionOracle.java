package poo.interfaces;

public class ImplementacionOracle implements IAccesoDatos {

	@Override
	public void insertar() {
		System.out.println("Insertar Datos desde Oracle");
		
	}

	@Override
	public void listar() {
		System.out.println("Listar Datos desde Oracle");
		
	}

	@Override
	public void actualizar() {
		System.out.println("Actualizar Datos desde Oracle");
		
	}

	@Override
	public void eliminar() {
		System.out.println("Eliminar Datos desde Oracle");
		
	}

}
