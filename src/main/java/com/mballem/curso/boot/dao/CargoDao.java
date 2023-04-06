package com.mballem.curso.boot.dao;

import com.mballem.curso.boot.domain.Cargo;

import java.util.List;

public interface CargoDao {

    void save(Cargo cargo);

    void update(Cargo cargo);

    void delete(Long id);

    List<Cargo> findAll();

}
