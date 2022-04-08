package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.documentos.Producto;
import com.example.demo.interfaces.IProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	
	@Autowired
	IProductoService prodservice;
	
	@PostMapping("/add")
	public int add(@RequestBody Producto producto) {
		prodservice.alta_producto(producto);
		return 0;
	}
	
	@GetMapping("/listado")
	public List<Producto> listado() {
		return prodservice.listado();
	}
	
	@GetMapping("/buscarproducto/{idproducto}")
	public Producto verDisco(@PathVariable("idproducto") Integer idproducto){
		Producto nuevo=prodservice.busqueda_id(idproducto);
		if(nuevo==null) {
			return null;
		} else {
			return nuevo;
		}
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminarDisco(@PathVariable("id") Integer id){
		Producto nuevo=prodservice.busqueda_id(id);
		if(nuevo==null) {
			return "No existe.";
		} else {
			prodservice.eliminar(id);
			return "Eliminado.";
		}
	}
	
	@PutMapping("/modificar")
	public String modificarDisco(@RequestBody Producto producto){
		Producto nuevo=prodservice.busqueda_id(producto.getIdproducto());
		if(nuevo==null) {
			return "No existe.";
		} else {
			prodservice.modificar(producto);
			return "Modificado.";
		}
	}
	
	
	
}