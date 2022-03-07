package poo.encapsulamiento;

public class MainAutoMovil {

	public static void main(String[] args) {
		
		AutoMovil auto1 = new AutoMovil();
		auto1.setMarca("Hyundai");
		auto1.setModelo("Elantra");
		auto1.setPatente("A4f15");
		auto1.setPrecio(20000);
		
		System.out.println(auto1);
		
		AutoMovil auto2 = new AutoMovil();
		auto2.setMarca("Ford");
		auto2.setModelo("Fusion");
		auto2.setPatente("3000");
		auto2.setPrecio(30000);
		
		System.out.println(auto2);
	}

}
