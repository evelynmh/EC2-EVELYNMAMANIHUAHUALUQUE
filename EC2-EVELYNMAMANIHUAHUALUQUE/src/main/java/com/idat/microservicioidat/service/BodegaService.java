package com.idat.microservicioidat.service;

import java.util.List;

import com.idat.microservicioidat.dto.BodegaDTORequest;
import com.idat.microservicioidat.dto.BodegaDTOResponse;
import com.idat.microservicioidat.model.Bodega;

public interface BodegaService {

	void guardarBodega(BodegaDTORequest bodega);
	void actualizarBodega(BodegaDTORequest bodega);
	void eliminarBodega(Integer id);
	List<BodegaDTOResponse> listarBodega();
	BodegaDTOResponse obtenerBodegaId(Integer id);
}
