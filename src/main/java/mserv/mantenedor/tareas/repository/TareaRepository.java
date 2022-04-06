package mserv.mantenedor.tareas.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mserv.mantenedor.tareas.entity.Tarea;
@Repository
public interface TareaRepository extends JpaRepository<Tarea, Integer> {
	
	

}
