package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Coche;

public interface ICocheService {

	List<Coche> buscarPorMarca(String marca);

	List<Coche> buscarPorModelo(String modelo);

	List<Coche> buscarPorPrecio(Double precio);

}
