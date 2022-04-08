package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.documentos.Producto;

public interface IProductoService {
	
	public void alta_producto(Producto producto);
	public Producto busqueda_id(int id);
	public void modificar(Producto producto);
	public void eliminar(int id);
	public List<Producto> listado();
}
