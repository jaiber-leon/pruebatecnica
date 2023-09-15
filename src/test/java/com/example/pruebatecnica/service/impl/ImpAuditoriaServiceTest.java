package com.example.pruebatecnica.service.impl;

import com.example.pruebatecnica.entity.AuditoriasEntity;
import com.example.pruebatecnica.repository.IAuditoriaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class ImpAuditoriaServiceTest {
    @Mock private IAuditoriaRepository iAuditoriaRepository;
    @InjectMocks private ImpAuditoriaService impAuditoriaService;

    @Test
    void updateAuditoria() {
    }

    @Test
    void deleteAuditoriaById() {
    }

    @Test
    void findBynombre() {
    }

    @Test
    void deleteAuditoriaByNombre() {
    }

    @Test
    void findById() {
    }

    @Test
    void obtenerAuditorias() {
    }

    @Test
    void createAuditoria() {
    }
}