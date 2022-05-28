package com.api.toDoList.dao;

import com.api.toDoList.models.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TareaDao extends JpaRepository<Tarea, String> {


}
