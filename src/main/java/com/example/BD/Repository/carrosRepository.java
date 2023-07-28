package com.example.BD.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.BD.Model.carrosModel;

@Repository
public interface carrosRepository extends CrudRepository<carrosModel, Integer> {

}
