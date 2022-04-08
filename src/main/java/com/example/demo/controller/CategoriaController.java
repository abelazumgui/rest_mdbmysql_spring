package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Categoria;
import com.example.demo.interfaces.ICategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	
	@Autowired
	ICategoriaService catservice;
	
	@PostMapping("/add")
	public int add(@RequestBody Categoria categoria) {
		catservice.alta_categoria(categoria);
		return 0;
	}
	
	@GetMapping("/listado")
	public ArrayList<Categoria> listado() {
		return catservice.listado();
	}
	
	@GetMapping("/buscarcategoria/{id}")
	public Categoria verDisco(@PathVariable("id") Integer id){
		Categoria nuevo=catservice.busqueda_id(id);
		if(nuevo==null) {
			return null;
		} else {
			return nuevo;
		}
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminarDisco(@PathVariable("id") Integer id){
		Categoria nuevo=catservice.busqueda_id(id);
		if(nuevo==null) {
			return "No existe.";
		} else {
			catservice.eliminar(id);
			return "Eliminado.";
		}
	}
	
	@PutMapping("/modificar")
	public String modificarDisco(@RequestBody Categoria categoria){
		Categoria nuevo=catservice.busqueda_id(categoria.getId());
		if(nuevo==null) {
			return "No existe.";
		} else {
			catservice.modificar(categoria);
			return "Modificado.";
		}
	}
	
	
	
}