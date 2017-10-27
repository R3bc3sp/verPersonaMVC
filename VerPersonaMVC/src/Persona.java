
public class Persona {
	private String nombre;
	private String apellido;
	private int anyoNcto;
	public Persona() {
		super();
	}
	public Persona(String nombre, String apellido, int anyoNcto) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.anyoNcto = anyoNcto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getAnyoNcto() {
		return anyoNcto;
	}
	public void setAnyoNcto(int anyoNcto) {
		this.anyoNcto = anyoNcto;
	}
	
	public int calcularEdad(){
		return 2017-anyoNcto;
	}
	@Override
	public String toString() {
		return  nombre + " " + apellido + " tiene " 
	+ calcularEdad() + " años.";
	}
	
}
