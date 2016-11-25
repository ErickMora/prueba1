package prueba;

public class Profesor extends Persona{
	private int idProf;
	
	private Materia m1;
	private Materia m2;
	private Materia m3;
	
	public Profesor(Materia m1, Materia m2, Materia m3){
		m1=new Materia("");
		m2=new Materia("");
		m3=new Materia("");
		
	}
	
	public int getIdProf() {
		return idProf;
	}

	public void setIdProf(int idProf) {
		this.idProf = idProf;
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

	
	@Override
	public String toString() {
		return "Materias: [" + m1 + ", " + m2 + ", " + m3 +"]";
	}
/*	
	@Override
	public String toString2() {
		return "Profesor [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4="
				+ m4 + ", m5=" + m5 + "]";
	}
	
*/
}
