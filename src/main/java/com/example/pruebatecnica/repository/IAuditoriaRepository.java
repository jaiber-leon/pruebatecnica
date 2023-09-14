package com.example.pruebatecnica.repository;

import com.example.pruebatecnica.entity.AuditoriasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuditoriaRepository extends JpaRepository<AuditoriasEntity, Long> {

}
