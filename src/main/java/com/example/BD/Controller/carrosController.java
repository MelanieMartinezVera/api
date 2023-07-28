package com.example.BD.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.BD.Model.carrosModel;
import com.example.BD.Services.carrosServices;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping
public class carrosController {
    @Autowired
    carrosServices carrosServices;

    @PostMapping("/crear")
    public carrosModel guardarCarro(@RequestBody carrosModel carro) {
        return this.carrosServices.guardarCarro(carro);
    }

    @GetMapping("/mostrar")
    public ArrayList<carrosModel> obtenerDatos() {
        return carrosServices.obtenerDatos();
    }

    @DeleteMapping(path = "/{Id}")
    public String eliminarCarro(@PathVariable("Id") Integer Id) {
        boolean ok = this.carrosServices.eliminar(Id);
        if (ok) {
            return "El carro fue eliminado con exito " + Id;
        } else {
            return "El carro no se encuentra en el registro";
        }
    }

    @GetMapping(path = "/{Id}")
    public Optional<carrosModel> obtenerId(@PathVariable("Id") Integer Id) {
        return this.carrosServices.obtenerId(Id);
    }
}
