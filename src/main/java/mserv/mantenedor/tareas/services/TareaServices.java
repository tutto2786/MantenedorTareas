package mserv.mantenedor.tareas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mserv.mantenedor.tareas.entity.Tarea;
import mserv.mantenedor.tareas.repository.TareaRepository;

@Service
public class TareaServices   {

	@Autowired
	private TareaRepository tareaRepository;
	
	public List<Tarea> getTareas()
	{
		return tareaRepository.findAll();

	}
	public void nuevaTarea(Tarea tarea) {
		tareaRepository.save(tarea);
	}
	
	public void deleteTarea(Integer id)
	{
		
		boolean exists= tareaRepository.existsById(id);
		if(!exists) {
			throw new IllegalStateException(
					"tarea con el id" + id	+"no existe");
		}
		tareaRepository.deleteById(id);	
	}
}
