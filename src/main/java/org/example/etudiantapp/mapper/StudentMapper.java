package org.example.etudiantapp.mapper;

import org.example.etudiantapp.dao.entities.Etudiant;
import org.example.etudiantapp.dto.EtudiantDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Etudiant fromEtudiantDtoToEtudiant(EtudiantDto etudiantDto){
        return mapper.map(etudiantDto, Etudiant.class);
    }
    public EtudiantDto fromEtudiantToEtudiantDto(Etudiant etudiant){
        return mapper.map(etudiant, EtudiantDto.class);
    }
}
