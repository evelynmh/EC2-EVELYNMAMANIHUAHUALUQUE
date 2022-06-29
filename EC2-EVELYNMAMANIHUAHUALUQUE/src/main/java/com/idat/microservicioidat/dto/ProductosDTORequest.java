package com.idat.microservicioidat.dto;

public class ProductosDTORequest {

	private Integer id;
	private String productoP;
	private String descripcionProducto;
	private Double precioProducto;
	private Integer stockProducto;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductoP() {
		return productoP;
	}
	public void setProductoP(String productoP) {
		this.productoP = productoP;
	}
	public String getDescripcionProducto() {
		return descripcionProducto;
	}
	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}
	public Double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(Double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public Integer getStockProducto() {
		return stockProducto;
	}
	public void setStockProducto(Integer stockProducto) {
		this.stockProducto = stockProducto;
	}
}
