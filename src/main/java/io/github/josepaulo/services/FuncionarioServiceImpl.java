package io.github.josepaulo.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.github.josepaulo.dao.FuncionarioDAO;
import io.github.josepaulo.domain.Funcionario;

@Service
public class FuncionarioServiceImpl implements FuncionarioService{
    private FuncionarioDAO funcionarioDAO;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Funcionario cargo) {
        funcionarioDAO.save(cargo);

    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Funcionario cargo) {
        funcionarioDAO.update(cargo);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Long id) {
        funcionarioDAO.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Funcionario buscarPorId(Long id) {
        return funcionarioDAO.findById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Funcionario> buscarTodos() {
        return funcionarioDAO.findAll();
    }
    

}
