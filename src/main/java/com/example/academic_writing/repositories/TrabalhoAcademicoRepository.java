package com.example.academic_writing.repositories;


import com.example.academic_writing.models.TrabalhoAcademico;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TrabalhoAcademicoRepository extends MongoRepository<TrabalhoAcademico, String> {
    Optional<TrabalhoAcademico> findTrabalhoAcademicoById(long id);
    Optional<TrabalhoAcademico> deleteTrabalhoAcademicoById(long id);
}
