package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICocheDAO;
import com.example.demo.entity.Coche;

@Service("cocheService")
public class CocheServiceImpl implements ICocheService {

	@Autowired
	private ICocheDAO cocheDAO;

	@Override
	public List<Coche> buscarPorMarca(String marca) {
		return cocheDAO.findByMarca(marca);
	}

	@Override
	public List<Coche> buscarPorModelo(String modelo) {
		return cocheDAO.findByModelo(modelo);
	}

	@Override
	public List<Coche> buscarPorPrecio(Double precio) {
		return cocheDAO.findByPrecio(precio);
	}

}
