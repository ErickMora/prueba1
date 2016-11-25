package prueba;

public class Materia {
	private int idMateria;
	private String nombreMat;

	public Materia(String string) {
		// TODO Auto-generated constructor stub
	}

	public int getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	public String getNombreMat() {
		return nombreMat;
	}

	public void setNombreMat(String nombreMat) {
		this.nombreMat = nombreMat;
	}

	@Override
	public String toString() {
		return "[" + idMateria + "=" + nombreMat+"]";
	}
	
	

}
