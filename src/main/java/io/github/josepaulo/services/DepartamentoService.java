package io.github.josepaulo.services;

import java.util.List;

import io.github.josepaulo.domain.Departamento;


public interface DepartamentoService  {
    void salvar(Departamento cargo);
    void editar(Departamento cargo);
    void excluir(Long id);

    Departamento buscarPorId(Long id);

    List<Departamento> buscarTodos();
}
