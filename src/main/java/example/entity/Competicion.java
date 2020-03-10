package example.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="competicion")
public class Competicion {
	
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="fecha")
	private String fecha;
	
	@Column(name="lugar")
	private String lugar;

	@ManyToMany
	Set<Equipo> EquiposCompiten;
	
	

}
