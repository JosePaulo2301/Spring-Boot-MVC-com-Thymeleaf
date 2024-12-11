package io.github.josepaulo.dao;

import java.util.List;

import io.github.josepaulo.domain.Departamento;

public interface DepartamentoDAO {

    void save(Departamento Departamento);
	void update(Departamento Departamento);
	void delete(Long id);
    Departamento findById(Long id);
    List<Departamento> findAll();

    
}
