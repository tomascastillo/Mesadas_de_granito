package MesadasDeGranito;

public class Mesada {
	private int alto;
	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	private int ancho;
	private boolean colocado;
	
	public boolean isColocado() {
		return colocado;
	}

	public void setColocado(boolean colocado) {
		this.colocado = colocado;
	}

	public Mesada (int alto, int ancho){
		this.alto = alto;
		this.ancho = ancho;
		this.colocado=false;
	}
	
	public boolean domina (int alto,int ancho){
		if((this.alto<=alto&&this.ancho<=ancho)||(this.ancho<=alto&&this.alto<=ancho))
			return true;
		return false;
		
	}
	

}
