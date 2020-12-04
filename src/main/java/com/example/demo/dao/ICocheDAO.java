package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Coche;

@Repository
public interface ICocheDAO extends JpaRepository<Coche, Long> {

	// buscar coches por marca
	List<Coche> findByMarca(String marca);

	// buscar coches por marca
	List<Coche> findByModelo(String modelo);
	
	// buscar por rango de fechas
	@Query("FROM Coche c WHERE c.precio > :precio")
	List<Coche> findByPrecio(@Param("precio") Double precio);

}
