package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.ICategoriaService;
import com.example.demo.model.Categoria;
import com.example.demo.repository.CategoriaRepository;

@Service
public class CategoriaService implements ICategoriaService {

	@Autowired
	CategoriaRepository catrepository;
	
	@Override
	public void alta_categoria(Categoria categoria) {
		catrepository.save(categoria);
	}

	@Override
	public Categoria busqueda_id(int id) {
		return catrepository.findById(id).orElse(null);
	}

	@Override
	public void modificar(Categoria categoria) {
		catrepository.save(categoria);
	}

	@Override
	public void eliminar(int id) {
		catrepository.deleteById(id);
	}

	@Override
	public ArrayList<Categoria> listado() {
		return (ArrayList<Categoria>) catrepository.findAll();
	}

}
