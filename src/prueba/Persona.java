package prueba;

public class Persona {
	private String nombre;
	private String apellido;
	
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	/*public String toString2() {
		// TODO Auto-generated method stub
		return null;
	}*/
	

}
