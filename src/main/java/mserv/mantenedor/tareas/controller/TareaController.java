package mserv.mantenedor.tareas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mserv.mantenedor.tareas.entity.Tarea;
import mserv.mantenedor.tareas.services.TareaServices;



@RestController
@RequestMapping("/v1/mantenedor/Tarea/")
public class TareaController {

	@Autowired
	private TareaServices tareaServices;
	
	@GetMapping
	public List<Tarea> getTareas(){
		return tareaServices.getTareas();
	}
	@PostMapping
	public void registerNewTarea(@RequestBody Tarea tarea) {
		tareaServices.nuevaTarea(tarea);
	}
	@DeleteMapping(path= "{id}")
	
	public void deleteTarea(@PathVariable("id")Integer id) {
		tareaServices.deleteTarea(id);
	}

	
	
		
}

