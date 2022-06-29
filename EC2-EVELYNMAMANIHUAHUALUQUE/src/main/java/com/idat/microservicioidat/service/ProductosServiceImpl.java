package com.idat.microservicioidat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.microservicioidat.dto.ProductosDTORequest;
import com.idat.microservicioidat.dto.ProductosDTOResponse;
import com.idat.microservicioidat.model.Productos;
import com.idat.microservicioidat.repository.ProductosRepository;

@Service
public class ProductosServiceImpl implements ProductosService {

	@Autowired
	private ProductosRepository repository;

	@Override
	public void guardarProducto(ProductosDTORequest producto) {
		Productos p = new Productos();
		p.setProducto(producto.getProductoP());
		p.setDescripcion(producto.getDescripcionProducto());
		p.setPrecio(producto.getPrecioProducto());
		p.setStock(producto.getStockProducto());
		repository.save(p);
	}

	@Override
	public void actualizarProducto(ProductosDTORequest producto) {
		Productos p = new Productos();
		p.setIdProducto(producto.getId());
		p.setProducto(producto.getProductoP());
		p.setDescripcion(producto.getDescripcionProducto());
		p.setPrecio(producto.getPrecioProducto());
		p.setStock(producto.getStockProducto());
		repository.saveAndFlush(p);
	}

	@Override
	public void eliminarProducto(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public List<ProductosDTOResponse> listarProducto() {
		List<ProductosDTOResponse> listar = new ArrayList<>();
		ProductosDTOResponse dto = null;
		List<Productos> p = repository.findAll();
		
		for (Productos productos : p) {
			dto = new ProductosDTOResponse();
			dto.setProductoP(productos.getProducto());
			dto.setDescripcionProducto(productos.getDescripcion());
			dto.setPrecioProducto(productos.getPrecio());
			dto.setStockProducto(productos.getStock());
			dto.setId(productos.getIdProducto());
			
			listar.add(dto);
		}
		
		return listar;
	}

	@Override
	public ProductosDTOResponse obtenerProductoId(Integer id) {
		Productos productos = repository.findById(id).orElse(null);
		ProductosDTOResponse dto = new ProductosDTOResponse();
		
		dto.setProductoP(productos.getProducto());
		dto.setDescripcionProducto(productos.getDescripcion());
		dto.setPrecioProducto(productos.getPrecio());
		dto.setStockProducto(productos.getStock());
		dto.setId(productos.getIdProducto());
		
		return dto;
	}
}
