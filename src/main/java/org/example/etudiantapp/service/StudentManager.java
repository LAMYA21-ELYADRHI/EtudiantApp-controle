package org.example.etudiantapp.service;


import lombok.NoArgsConstructor;
import org.example.etudiantapp.dao.entities.Etudiant;
import org.example.etudiantapp.dao.repositories.EtudiantRepository;
import org.example.etudiantapp.dto.EtudiantDto;
import org.example.etudiantapp.mapper.StudentMapper;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class StudentManager {
    private EtudiantRepository etudiantRepository;
    private StudentMapper studentMapper;


    @Override
    public EtudiantDto saveEtudiant(EtudiantDto etudiantDto) {
        Etudiant etudiant = studentMapper.fromEtudiantDtoToEtudiant(etudiantDto);
        etudiant = etudiantRepository.save(etudiant);
        etudiantDto = studentMapper.fromEtudiantToEtudiantDto(etudiant);
        return etudiantDto;
    }


}
