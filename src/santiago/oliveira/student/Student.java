package santiago.oliveira.student;

import java.util.ArrayList;

public class Student {

	private String nombre;
	private String apellido;
	private String dni;
	private String numeroLegajo;
	private ArrayList<String> especialidad = new ArrayList<String>();
	
	public Student() {
		especialidad = new ArrayList<>();
		especialidad.add("Sistemas");
		especialidad.add("Matematicas");
		especialidad.add("Literatura");
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNumeroLegajo() {
		return numeroLegajo;
	}
	public void setNumeroLegajo(String numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}
	
	public ArrayList<String> getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(ArrayList<String> especialidad) {
		this.especialidad = especialidad;
	}

	public Student(String nombre, String apellido, String dni, String numeroLegajo, String especialidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.numeroLegajo = numeroLegajo;
	}
	
}
