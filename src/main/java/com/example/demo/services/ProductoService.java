package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.documentos.Producto;
import com.example.demo.interfaces.IProductoService;
import com.example.demo.repository.ProductoRepository;

@Service
public class ProductoService implements IProductoService {
	
	@Autowired
	ProductoRepository prodrepository;

	@Override
	public void alta_producto(Producto producto) {
		prodrepository.save(producto);
	}

	@Override
	public Producto busqueda_id(int id) {
		return prodrepository.findById(id).orElse(null);
	}

	@Override
	public void modificar(Producto producto) {
		prodrepository.save(producto);
	}

	@Override
	public void eliminar(int id) {
		prodrepository.deleteById(id);
	}

	@Override
	public List<Producto> listado() {
		return prodrepository.findAll();
	}

}
