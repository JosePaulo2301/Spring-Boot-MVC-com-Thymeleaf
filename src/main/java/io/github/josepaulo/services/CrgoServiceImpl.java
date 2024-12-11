package io.github.josepaulo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.josepaulo.dao.CargoDAO;
import io.github.josepaulo.domain.Cargo;
import org.springframework.transaction.annotation.*;

@Service
@Transactional(readOnly=true)
public class CrgoServiceImpl implements CargoService {
    @Autowired
    private CargoDAO cargoDAO;


    @Override
    public void salvar(Cargo cargo) {
        cargoDAO.save(cargo);

    }

    @Override
    public void editar(Cargo cargo) {
        cargoDAO.update(cargo);
    }

    @Override
    public void excluir(Long id) {
        cargoDAO.delete(id);
    }

    @Override @Transactional(readOnly=true)
    public Cargo buscarPorId(Long id) {
        return cargoDAO.findById(id);

    }

    @Override @Transactional(readOnly=true)
    public List<Cargo> buscarTodos() {
        return cargoDAO.findAll();
    }
    
}
