package org.example.etudiantapp.service;

import org.example.etudiantapp.dto.EtudiantDto;

import java.util.List;

public interface StudentService {

    public EtudiantDto saveEtudiant(EtudiantDto etudiantDto);

    public List<EtudiantDto> getEtudiantByDateNaissance(String DateNaissance);
}
