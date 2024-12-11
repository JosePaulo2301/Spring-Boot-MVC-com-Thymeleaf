package io.github.josepaulo.services;

import java.util.List;

import io.github.josepaulo.domain.Funcionario;

public interface FuncionarioService {

    void salvar(Funcionario cargo);
    void editar(Funcionario cargo);
    void excluir(Long id);

    Funcionario buscarPorId(Long id);

    List<Funcionario> buscarTodos();
    
}
