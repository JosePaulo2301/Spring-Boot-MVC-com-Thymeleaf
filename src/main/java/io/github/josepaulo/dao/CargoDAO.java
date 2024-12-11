package io.github.josepaulo.dao;

import java.util.List;

import io.github.josepaulo.domain.Cargo;

public interface CargoDAO {
 
    void save(Cargo cargo);
	void update(Cargo cargo);
	void delete(Long id);
    Cargo findById(Long id);
    List<Cargo> findAll();
    
} 