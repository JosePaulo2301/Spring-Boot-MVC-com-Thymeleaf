package io.github.josepaulo.services;

import java.util.List;

import io.github.josepaulo.domain.Cargo;

public interface CargoService {
    void salvar(Cargo cargo);
    void editar(Cargo cargo);
    void excluir(Long id);

    Cargo buscarPorId(Long id);

    List<Cargo> buscarTodos();
}
