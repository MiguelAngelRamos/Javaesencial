package poo.interfaces;

public interface IAccesoDatos {
	// public static final int MAX_REGISTRO = 10;
	int MAX_REGISTRO = 10;
	// todos sus métodos son abstractos
	// public abstract void insertar();
	void insertar();
	void listar();
	void actualizar();
	void eliminar();
}
