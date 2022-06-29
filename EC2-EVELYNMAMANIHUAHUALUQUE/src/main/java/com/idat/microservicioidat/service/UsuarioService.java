package com.idat.microservicioidat.service;

import java.util.List;

import com.idat.microservicioidat.model.Usuario;



public interface UsuarioService {

	void guardarUsuario(Usuario usuario);
	void actualizarUsuario(Usuario usuario);
	void eliminarUsuario(Integer id);
	List<Usuario> listarUsuario();
	Usuario obtenerUsuarioId(Integer id);
}
