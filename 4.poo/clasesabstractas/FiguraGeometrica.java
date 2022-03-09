package poo.clasesabstractas;

public abstract class FiguraGeometrica {
	
	protected String tipoFigura;
	
	protected FiguraGeometrica(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}
	
	public abstract void dibujar();
	
	public String getTipoFigura() {
		return tipoFigura;
	}
	
	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}

	@Override
	public String toString() {
		return "FiguraGeometrica [tipoFigura=" + tipoFigura + "]";
	}
	
	/* Si un método se define como abstracto 
	 * la clase se debe definir como abstracta
	 * */
	

}
