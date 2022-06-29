package com.idat.microservicioidat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.microservicioidat.dto.ProductosDTORequest;
import com.idat.microservicioidat.dto.ProductosDTOResponse;
import com.idat.microservicioidat.model.Productos;
import com.idat.microservicioidat.service.ProductosService;

@Controller
@RequestMapping("/productos/v1")
public class ProductosController {

	@Autowired
	private ProductosService service;
	
	@RequestMapping("/listar")
	public @ResponseBody ResponseEntity<List<ProductosDTOResponse>> listar() {
		return new ResponseEntity<List<ProductosDTOResponse>>(service.listarProducto(), HttpStatus.OK);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody ProductosDTORequest producto) {
		service.guardarProducto(producto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		
		ProductosDTOResponse producto = service.obtenerProductoId(id);
		if(producto != null) {
			service.eliminarProducto(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<Void> actualizar(@RequestBody ProductosDTORequest producto) {
		
		ProductosDTOResponse p = service.obtenerProductoId(producto.getId());
		if(p != null) {
			service.actualizarProducto(producto);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.PUT)
	public ResponseEntity<ProductosDTOResponse> obtenerId(@PathVariable Integer id) {
		
		ProductosDTOResponse p = service.obtenerProductoId(id);
		if(p != null) {
			return new ResponseEntity<ProductosDTOResponse>(service.obtenerProductoId(id), HttpStatus.OK);
		}
		return new ResponseEntity<ProductosDTOResponse>(HttpStatus.NOT_FOUND);
	}
}
