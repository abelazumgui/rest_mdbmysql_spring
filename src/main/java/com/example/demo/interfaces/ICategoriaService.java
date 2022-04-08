package com.example.demo.interfaces;

import java.util.ArrayList;

import com.example.demo.model.Categoria;

public interface ICategoriaService {
	
	public void alta_categoria(Categoria categoria);
	public Categoria busqueda_id(int id);
	public void modificar(Categoria categoria);
	public void eliminar(int id);
	public ArrayList<Categoria> listado();
}
