package com.darwinruiz.edujspapp.repositories;
import com.darwinruiz.edujspapp.models.Profesor;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ProfesorRepositorio {
    private static final List<Profesor> profesores = new ArrayList<>();
    private static int secuenciaId = 1;

    // Método explícito para inicializar datos
    public ProfesorRepositorio() {
        if (profesores.isEmpty()) {
            inicializarDatos();
        }
    }

    private void inicializarDatos() {
        profesores.add(new Profesor(secuenciaId++, "Carlos", "profesor1@email.com", "Masculino", true, "Matemática", Arrays.asList("Álgebra", "Estadística"), "Estas son las observaciones", "2025-01-01"));
        profesores.add(new Profesor(secuenciaId++, "Maria", "profesor2@email.com", "Femenino", false, "Informatica", Arrays.asList("Programación", "Bases de Datos" ), "Estas son las observaciones", "2025-01-01"));
    }

    public List<Profesor> listar() {
        return profesores;
    }

    public void agregar(Profesor profesor) {
        profesor.setId(secuenciaId++);
        profesores.add(profesor);
    }

    public Profesor buscarPorId(int id) {
        for (Profesor a : profesores) {
            if (a.getId() == id) return a;
        }
        return null;
    }

    public void actualizar(Profesor profesor) {
        Profesor existente = buscarPorId(profesor.getId());
        if (existente != null) {
            existente.setNombre(profesor.getNombre());
            existente.setEmail(profesor.getEmail());
            existente.setGenero(profesor.getGenero());
            existente.setEspecialidad(profesor.getEspecialidad());
            existente.setCursosAsignados(profesor.getCursosAsignados());
            existente.setTiempoCompleto(profesor.isTiempoCompleto());
            existente.setObservaciones(profesor.getObservaciones());
            existente.setFechaIngreso(profesor.getFechaIngreso());
        }
    }

    public void eliminar(int id) {
        profesores.removeIf(a -> a.getId() == id);
    }
}
