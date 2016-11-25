package prueba;

import java.io.IOException;

public class Aplicacion {

	public static void main(String args[]) throws IOException
	{
		Alumno a1=new Alumno(null, null, null, null, null);
		Alumno a2=new Alumno(null, null, null, null, null);
		Alumno a3=new Alumno(null, null, null, null, null);
		Alumno a4=new Alumno(null, null, null, null, null);
		Alumno a5=new Alumno(null, null, null, null, null);
		Alumno a6=new Alumno(null, null, null, null, null);
		Alumno a7=new Alumno(null, null, null, null, null);
		Alumno a8=new Alumno(null, null, null, null, null);
		Alumno a9=new Alumno(null, null, null, null, null);
		Alumno a10=new Alumno(null, null, null, null, null);
		
		Profesor p1 =new Profesor(null, null, null);
		Profesor p2 =new Profesor(null, null, null);
		Profesor p3 =new Profesor(null, null, null);
		Profesor p4 =new Profesor(null, null, null);
		Profesor p5 =new Profesor(null, null, null);
		Profesor p6 =new Profesor(null, null, null);
		Profesor p7 =new Profesor(null, null, null);
		Profesor p8 =new Profesor(null, null, null);
		Profesor p9 =new Profesor(null, null, null);
		Profesor p10 =new Profesor(null, null, null);
		
		Materia m1=new Materia(null);
		Materia m2=new Materia(null);
		Materia m3=new Materia(null);
		Materia m4=new Materia(null);
		Materia m5=new Materia(null);
		Materia m6=new Materia(null);
		Materia m7=new Materia(null);
		Materia m8=new Materia(null);
		Materia m9=new Materia(null);
		Materia m10=new Materia(null);
		
		a1.setNombre("Juan");
		a1.setApellido("Perez");
		a2.setNombre("Mario");
		a2.setApellido("Lala");
		a3.setNombre("Santiago");
		a3.setApellido("Sarmiento");
		a4.setNombre("Maria");
		a4.setApellido("Vera");
		a5.setNombre("Belén");
		a5.setApellido("Guamán");
		a6.setNombre("Fernanda");
		a6.setApellido("García");
		a7.setNombre("Raúl");
		a7.setApellido("Segovia");
		a8.setNombre("Karen");
		a8.setApellido("Altamirano");
		a9.setNombre("Patricia");
		a9.setApellido("Uvidia");
		a10.setNombre("William");
		a10.setApellido("Smith");
		
		p1.setNombre("Luis");
		p1.setApellido("Sandoval");
		p2.setNombre("Mónica");
		p2.setApellido("Padilla");
		p3.setNombre("Daniel");
		p3.setApellido("Zurita");
		p4.setNombre("Paúl");
		p4.setApellido("Sánchez");
		p5.setNombre("Carlos");
		p5.setApellido("Naranjo");
		p6.setNombre("Galo");
		p6.setApellido("Fuertes");
		p7.setNombre("Javier");
		p7.setApellido("Saénz");
		p8.setNombre("Eugenio");
		p8.setApellido("Lee");
		p9.setNombre("Tania");
		p9.setApellido("Sánchez");
		p10.setNombre("Carlos");
		p10.setApellido("Pérez");
		
		m1.setIdMateria(1);
		m2.setIdMateria(2);
		m3.setIdMateria(3);
		m4.setIdMateria(4);
		m5.setIdMateria(5);
		m6.setIdMateria(6);
		m7.setIdMateria(7);
		m8.setIdMateria(8);
		m9.setIdMateria(9);
		m10.setIdMateria(10);
		m1.setNombreMat("Matemáticas");
		m2.setNombreMat("Física");
		m3.setNombreMat("Química");
		m4.setNombreMat("Inglés");
		m5.setNombreMat("Literatura");
		m6.setNombreMat("Cálculo");
		m7.setNombreMat("Programación");
		m8.setNombreMat("Francés");
		m9.setNombreMat("Biología");
		m10.setNombreMat("Sociales");
		
		p1.setM1(m1);
		p1.setM2(m2);
		p1.setM3(m3);
		
		p2.setM1(m10);
		p2.setM2(m3);
		p2.setM3(m5);
		
		p3.setM1(m3);
		p3.setM2(m8);
		p3.setM3(m10);
	
		p4.setM1(m10);
		p4.setM2(m2);
		p4.setM3(m5);
		
		p5.setM1(m10);
		p5.setM2(m9);
		p5.setM3(m8);
		
		p6.setM1(m6);
		p6.setM2(m5);
		p6.setM3(m1);
		
		p7.setM1(m1);
		p7.setM2(m9);
		p7.setM3(m8);
	
		p8.setM1(m6);
		p8.setM2(m10);
		p8.setM3(m9);
		
		p9.setM1(m5);
		p9.setM2(m4);
		p9.setM3(m3);
		
		p10.setM1(m9);
		p10.setM2(m7);
		p10.setM3(m2);
		
		a1.setM1(m1);
		a1.setM2(m2);
		a1.setM3(m3);
		a1.setM4(m4);
		a1.setM5(m5);
		
		a2.setM1(m10);
		a2.setM2(m9);
		a2.setM3(m8);
		a2.setM4(m7);
		a2.setM5(m6);
		
		a3.setM1(m5);
		a3.setM2(m4);
		a3.setM3(m3);
		a3.setM4(m2);
		a3.setM5(m1);
		
		a4.setM1(m2);
		a4.setM2(m4);
		a4.setM3(m6);
		a4.setM4(m8);
		a4.setM5(m10);
		
		a5.setM1(m5);
		a5.setM2(m6);
		a5.setM3(m7);
		a5.setM4(m8);
		a5.setM5(m9);
		
		a6.setM1(m6);
		a6.setM2(m7);
		a6.setM3(m8);
		a6.setM4(m9);
		a6.setM5(m10);
		
		a7.setM1(m2);
		a7.setM2(m9);
		a7.setM3(m7);
		a7.setM4(m8);
		a7.setM5(m6);
	
		a8.setM1(m10);
		a8.setM2(m1);
		a8.setM3(m5);
		a8.setM4(m6);
		a8.setM5(m8);
		
		a9.setM1(m9);
		a9.setM2(m1);
		a9.setM3(m10);
		a9.setM4(m2);
		a9.setM5(m5);
		
		a10.setM1(m4);
		a10.setM2(m3);
		a10.setM3(m5);
		a10.setM4(m2);
		a10.setM5(m9);
		
		System.out.println("Materias de los Profesores: ");
		System.out.println("Profesor: "+p1.getNombre()+" "+ p1.getApellido()+"\n"+  p1.toString()+"\n");
		System.out.println("Profesor: "+p2.getNombre()+" "+ p2.getApellido()+"\n"+  p2.toString()+"\n");
		System.out.println("Profesor: "+p3.getNombre()+" "+ p3.getApellido()+"\n"+  p3.toString()+"\n");
		System.out.println("Profesor: "+p4.getNombre()+" "+ p4.getApellido()+"\n"+  p4.toString()+"\n");
		System.out.println("Profesor: "+p5.getNombre()+" "+ p5.getApellido()+"\n"+  p5.toString()+"\n");
		System.out.println("Profesor: "+p6.getNombre()+" "+ p6.getApellido()+"\n"+  p6.toString()+"\n");
		System.out.println("Profesor: "+p7.getNombre()+" "+ p7.getApellido()+"\n"+  p7.toString()+"\n");
		System.out.println("Profesor: "+p8.getNombre()+" "+ p8.getApellido()+"\n"+  p8.toString()+"\n");
		System.out.println("Profesor: "+p9.getNombre()+" "+ p9.getApellido()+"\n"+  p9.toString()+"\n");
		System.out.println("Profesor: "+p10.getNombre()+" "+ p10.getApellido()+"\n"+  p10.toString()+"\n");
		
		System.out.println("\n\nMaterias de los Alumnos: ");
		System.out.println("Alumno: "+a1.getNombre()+" "+ a1.getApellido()+"\n"+  a1.toString()+"\n");
		System.out.println("Alumno: "+a2.getNombre()+" "+ a2.getApellido()+"\n"+  a2.toString()+"\n");
		System.out.println("Alumno: "+a3.getNombre()+" "+ a3.getApellido()+"\n"+  a3.toString()+"\n");
		System.out.println("Alumno: "+a4.getNombre()+" "+ a4.getApellido()+"\n"+  a4.toString()+"\n");
		System.out.println("Alumno: "+a5.getNombre()+" "+ a5.getApellido()+"\n"+  a5.toString()+"\n");
		System.out.println("Alumno: "+a6.getNombre()+" "+ a6.getApellido()+"\n"+  a6.toString()+"\n");
		System.out.println("Alumno: "+a7.getNombre()+" "+ a7.getApellido()+"\n"+  a7.toString()+"\n");
		System.out.println("Alumno: "+a8.getNombre()+" "+ a8.getApellido()+"\n"+  a8.toString()+"\n");
		System.out.println("Alumno: "+a9.getNombre()+" "+ a9.getApellido()+"\n"+  a9.toString()+"\n");
		System.out.println("Alumno: "+a10.getNombre()+" "+ a10.getApellido()+"\n"+  a10.toString()+"\n");
		
	
	}
}
