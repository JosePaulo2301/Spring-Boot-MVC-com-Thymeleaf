package io.github.josepaulo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import io.github.josepaulo.dao.DepartamentoDAO;
import io.github.josepaulo.domain.Departamento;


public class DepartamentoServiceImpl implements DepartamentoService {
    
    @Autowired
    private DepartamentoDAO departamentoDAO;

    @Transactional(readOnly = false) // Operação de escrita  @Transactional(readOnly = true) == operação de leitura
    @Override
    public void salvar(Departamento cargo) {
        departamentoDAO.save(cargo);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Departamento cargo) {
        departamentoDAO.update(cargo);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Long id) {  
        departamentoDAO.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Departamento buscarPorId(Long id) {
        return departamentoDAO.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Departamento> buscarTodos() {
        return departamentoDAO.findAll();
    }

    
} 