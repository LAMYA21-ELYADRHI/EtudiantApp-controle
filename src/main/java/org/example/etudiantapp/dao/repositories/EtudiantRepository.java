package org.example.etudiantapp.dao.repositories;

import org.example.etudiantapp.dao.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
}
