package com.example.pruebatecnica.repository;

import com.example.pruebatecnica.entity.AuditoriasEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuditoriaRepository extends JpaRepository<AuditoriasEntity, Long> {

    @Query(value = "SELECT * FROM auditorias a WHERE a.nombre = :nombre", nativeQuery = true)
    AuditoriasEntity findByNombre (@Param("nombre") String nombre);
@Transactional
    @Modifying
    @Query(value = "DELETE FROM auditorias a WHERE a.nombre = :nombre", nativeQuery = true)
    void deleteByNombre (@Param("nombre") String nombre);
}
