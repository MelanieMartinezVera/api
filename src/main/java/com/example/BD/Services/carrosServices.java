package com.example.BD.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BD.Model.carrosModel;
import com.example.BD.Repository.carrosRepository;

@Service
public class carrosServices {
    @Autowired
    carrosRepository carrosRepository;

    public carrosModel guardarCarro(carrosModel carro) {
        return carrosRepository.save(carro);
    }

    public boolean eliminar(Integer Id) {
        try {
            carrosRepository.deleteById(Id);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            return false;
        }
    }

    public ArrayList<carrosModel> obtenerDatos() {
        return (ArrayList<carrosModel>) carrosRepository.findAll();
    }

    public Optional<carrosModel> obtenerId(Integer Id) {
        return carrosRepository.findById(Id);
    }

}
