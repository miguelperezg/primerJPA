package es.open4job.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumno_matricula")
public class AlumnoMatriculaEntity {

	@Id
	private int id;
	//private int idAlumno;
	
	@Column(name="curso_escolar")
	private int cursoEscolar;
	//private int idCentro;
	//private int idEnsenanza;
	private String modulo;
	private int curso;

	public AlumnoMatriculaEntity() {
	}

	public AlumnoMatriculaEntity(int id, int idAlumno, int cursoEscolar,
			int idCentro, int idEnsenanza, String modulo, int curso) {

		this.id = id;
		//this.idAlumno = idAlumno;
		this.cursoEscolar = cursoEscolar;
		//this.idCentro = idCentro;
		//this.idEnsenanza = idEnsenanza;
		this.modulo = modulo;
		this.curso = curso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCursoEscolar() {
		return cursoEscolar;
	}

	public void setCursoEscolar(int cursoEscolar) {
		this.cursoEscolar = cursoEscolar;
	}
/*
	public int getIdCentro() {
		return idCentro;
	}

	public void setIdCentro(int idCentro) {
		this.idCentro = idCentro;
	}

	public int getIdEnsenanza() {
		return idEnsenanza;
	}

	public void setIdEnsenanza(int idEnsenanza) {
		this.idEnsenanza = idEnsenanza;
	}
*/
	public String getModulo() {
		return modulo;
	}

	public void setModulo(String modulo) {
		this.modulo = modulo;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}
/*
	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
*/
}
