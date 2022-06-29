package com.idat.microservicioidat.service;

import java.util.List;

import com.idat.microservicioidat.dto.ProductosDTORequest;
import com.idat.microservicioidat.dto.ProductosDTOResponse;
import com.idat.microservicioidat.model.Productos;

public interface ProductosService {

	void guardarProducto(ProductosDTORequest producto);
	void actualizarProducto(ProductosDTORequest producto);
	void eliminarProducto(Integer id);
	List<ProductosDTOResponse> listarProducto();
	ProductosDTOResponse obtenerProductoId(Integer id);
}
