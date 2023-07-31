package com.example.crud.domain.empresa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmpresaRepository extends JpaRepository<Empresa, String> {
    List<Empresa> findAllByActiveTrue();
}
