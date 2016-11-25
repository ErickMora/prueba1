package prueba;

public class Alumno extends Persona{
	private int idAlumno;
	
	private Materia m1;
	private Materia m2;
	private Materia m3;
	private Materia m4;
	private Materia m5;

	
	public Alumno(Materia m1, Materia m2, Materia m3, Materia m4, Materia m5) {
		super();
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.m5 = m5;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	

	public Materia getM1() {
		return m1;
	}

	public void setM1(Materia m1) {
		this.m1 = m1;
	}

	public Materia getM2() {
		return m2;
	}

	public void setM2(Materia m2) {
		this.m2 = m2;
	}

	public Materia getM3() {
		return m3;
	}

	public void setM3(Materia m3) {
		this.m3 = m3;
	}

	public Materia getM4() {
		return m4;
	}

	public void setM4(Materia m4) {
		this.m4 = m4;
	}

	public Materia getM5() {
		return m5;
	}

	public void setM5(Materia m5) {
		this.m5 = m5;
	}

	@Override
	public String toString() {
		return "Materias: [" + m1 + ", " + m2 + ", " + m3 + ", " + m4
				+ ", " + m5 + "]";
	}
	
	

}
