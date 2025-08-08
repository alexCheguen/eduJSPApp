package com.darwinruiz.edujspapp.services;

import com.darwinruiz.edujspapp.models.Profesor;
import com.darwinruiz.edujspapp.repositories.ProfesorRepositorio;

import java.util.List;

public class ProfesorService {
    private  final ProfesorRepositorio profesores = new ProfesorRepositorio();

    public List<Profesor> obtenerTodos() {
        return profesores.listar();
    }

    private static int secuenciaId = 1;

    public void registrar(Profesor profesor) {
        profesor.setId(secuenciaId++);
        profesores.agregar(profesor);
    }

    public Profesor buscarPorId(int id) {
        return profesores.buscarPorId(id);
    }

    public void actualizar(Profesor profe) {
        Profesor existente = buscarPorId(profe.getId());
        if (existente != null) {
            existente.setNombre(profe.getNombre());
            existente.setEmail(profe.getEmail());
            existente.setGenero(profe.getGenero());
            existente.setTiempoCompleto(profe.isTiempoCompleto());
            existente.setEspecialidad(profe.getEspecialidad());
            existente.setCursosAsignados(profe.getCursosAsignados());
            existente.setObservaciones(profe.getObservaciones());
            existente.setFechaIngreso(profe.getFechaIngreso());
            profesores.actualizar(existente);
        }
    }

    public void eliminar(int id) {
        profesores.eliminar(id);
    }
}
