package aplicacion.entidades;

public class Repostaje {

	//Atributos
	private double litros=0;
	private double importe=0;
	private String fecha = "aaaaaaaaaa"; //para no trabajar con atributos nulos y asi ver si nos hemos equivocado
	private String dni = "aaaaaaaaaa";
	private String matricula = "aaaaaaaaaa";
	private int id;
	
	//Getters y Setters 
	public double getLitros() {
		return litros;
	}
	public void setLitros(double litros) {
		this.litros = litros;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//ToString 
	@Override
	public String toString() {
		return "repostaje [litros=" + litros + ", importe=" + importe + ", fecha=" + fecha + ", dni=" + dni
				+ ", matricula=" + matricula + ", id=" + id + "]";
	}
	
	
	
	
	
	
}
