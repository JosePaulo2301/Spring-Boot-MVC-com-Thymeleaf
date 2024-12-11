package io.github.josepaulo.dao;

import org.springframework.stereotype.Repository;

import io.github.josepaulo.domain.Funcionario;

@Repository
public class FuncionarioDAOImpl extends AbstractDAO <Funcionario, Long> implements FuncionarioDAO {
    
}
