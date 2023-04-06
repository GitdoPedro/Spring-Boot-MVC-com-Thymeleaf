package com.mballem.curso.boot.dao;

import com.mballem.curso.boot.domain.Departamento;

import java.util.List;

public interface DepartamentoDao {

    void save(Departamento departamento);

    void update(Departamento departamento);

    void delete(Long id);

    List<Departamento> findAll();

}
