<%--
  Created by IntelliJ IDEA.
  User: DarwinRuiz
  Date: 8/1/2025
  Time: 9:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<nav class="d-flex flex-column flex-shrink-0 p-3 text-bg-dark">
    <a class="navbar-brand mb-4" href="index.jsp">EduJSPApp</a>
    <hr>
    <ul class="nav nav-pills flex-column mb-auto">

        <li class="nav-item">
            <a class="nav-link text-white" href="alumnos">Lista de Alumnos</a>
        </li>
        <li class="nav-item">
            <a class="nav-link text-white" href="alumnos?accion=nuevo">Nuevo Alumno</a>
        </li>
        <hr>
        <li class="nav-item">
            <a class="nav-link text-white" href="profesores?accion=listar">Ver Profesores</a>
        </li>
        <li class="nav-item">
            <a class="nav-link text-white" href="profesores">Registrar Profesor</a>
        </li>
        <hr>
        <li class="nav-item">
            <a class="nav-link text-white" href="carreras?accion=listar">Ver Carreras</a>
        </li>
        <li class="nav-item">
            <a class="nav-link text-white" href="carreras">Registrar Carrera</a>
        </li>
    </ul>
</nav>
