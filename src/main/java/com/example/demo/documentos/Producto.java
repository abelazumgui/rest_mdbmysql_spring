package com.example.demo.documentos;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Producto {
		@Id
		private int idproducto;
		private int idcategoria;
		private String producto;
		private Double precio;
		public Producto() {
			super();
		}
		public Producto(int idproducto, int idcategoria, String producto, Double precio) {
			super();
			this.idproducto = idproducto;
			this.idcategoria = idcategoria;
			this.producto = producto;
			this.precio = precio;
		}
		public int getIdproducto() {
			return idproducto;
		}
		public void setIdproducto(int idproducto) {
			this.idproducto = idproducto;
		}
		public int getIdcategoria() {
			return idcategoria;
		}
		public void setIdcategoria(int idcategoria) {
			this.idcategoria = idcategoria;
		}
		public String getProducto() {
			return producto;
		}
		public void setProducto(String producto) {
			this.producto = producto;
		}
		public Double getPrecio() {
			return precio;
		}
		public void setPrecio(Double precio) {
			this.precio = precio;
		}
		@Override
		public String toString() {
			return "Producto [idproducto=" + idproducto + ", idcategoria=" + idcategoria + ", producto=" + producto
					+ ", precio=" + precio + "]";
		}
		
		
}
