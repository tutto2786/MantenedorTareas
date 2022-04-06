package mserv.mantenedor.tareas.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "Tareas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Tarea {
	   @Id
	   @SequenceGenerator(
			   name="tareas_sequence",
			   sequenceName="tareas_sequence",
			   allocationSize = 1
			   )
	    @GeneratedValue(
	    		strategy = GenerationType.SEQUENCE,
	   			generator= "tareas_sequence"
	   			)
	    @Column(name="Id")
	    Integer id;
	   	@Column
	   	String descripcion;
	    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss", shape = JsonFormat.Shape.STRING)
	    @Column(name="fecha_creacion")
	    LocalDateTime fecha_creacion;
	    @Column(name="vigente")
	    boolean vigente;
		@Override
		public String toString() {
			return "Tarea [id=" + id + ", descripcion=" + descripcion + ", fecha_creacion=" + fecha_creacion
					+ ", vigente=" + vigente + "]";
		}
	
	}
	
	
	


