package com.example.academic_writing.services;

import com.example.academic_writing.TrabalhoAcademicoPresenter;
import com.example.academic_writing.constansts.TrabalhoAcademicoNull;
import com.example.academic_writing.models.TrabalhoAcademico;
import com.example.academic_writing.repositories.TrabalhoAcademicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TrabalhoAcademicoService {

    private final TrabalhoAcademicoRepository repository;
    private final SequenceGeneratorService generatorService;

    public TrabalhoAcademicoService(TrabalhoAcademicoRepository repository, SequenceGeneratorService generatorService) {
        this.repository = repository;
        this.generatorService = generatorService;
    }

    public TrabalhoAcademicoPresenter create(TrabalhoAcademico trabalhoAcademico){
        trabalhoAcademico.setId(generatorService.generateSequence(TrabalhoAcademico.SEQUENCE_NAME));
        return  new TrabalhoAcademicoPresenter(repository.save(trabalhoAcademico));
    }
    public TrabalhoAcademicoPresenter findById(long id){
        Optional<TrabalhoAcademico> optional = repository.findTrabalhoAcademicoById(id);
        return optional.map(TrabalhoAcademicoPresenter::new)
                .orElseGet(() -> new TrabalhoAcademicoPresenter(new TrabalhoAcademicoNull()));

    }

    public List<TrabalhoAcademicoPresenter> list(){
        return repository.findAll().stream()
                .map(TrabalhoAcademicoPresenter::new)
                .collect(Collectors.toList());
    }



}
