package org.shark.sandbox.repository;

import org.shark.sandbox.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNombreContainingIgnoreCase(String nombre);
    List<Cliente> findByEmailContainingIgnoreCase(String email);
    List<Cliente> findByTelefonoContainingIgnoreCase(String telefono);
}
