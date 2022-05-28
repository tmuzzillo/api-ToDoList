package com.api.toDoList.controllers;

import com.api.toDoList.dao.TareaDao;
import com.api.toDoList.models.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TareaController {

    @Autowired
    private TareaDao tareaDao;


    @GetMapping("/tareas")
    public List<Tarea> getTareas() {
        return tareaDao.findAll();
    }

    @GetMapping("/tareas/{id}")
    public Tarea getTarea(@PathVariable(name = "idUsuario") String id) {
        return tareaDao.findById(id).get();
    }

    @PostMapping("/registrar")
    public void registrar(@RequestBody Tarea tarea) {
        tareaDao.save(tarea);
    }

    @DeleteMapping("/tareas/{id}")
    public void eliminar(@PathVariable(name = "id") String id) {
        tareaDao.deleteById(id);
    }

    @PutMapping("/tareas/{id}")
    public void actualizar(@RequestBody Tarea tarea, @PathVariable(name = "id") String id) {
        tareaDao.save(tarea);
    }




}
