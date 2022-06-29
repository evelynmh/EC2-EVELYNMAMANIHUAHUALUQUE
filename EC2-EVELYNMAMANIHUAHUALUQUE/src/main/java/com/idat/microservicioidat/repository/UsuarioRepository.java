package com.idat.microservicioidat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.microservicioidat.model.Bodega;

@Repository
public interface UsuarioRepository extends JpaRepository<Bodega, Integer>{

}
