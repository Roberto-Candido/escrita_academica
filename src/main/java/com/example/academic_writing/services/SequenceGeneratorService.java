package com.example.academic_writing.services;

import com.example.academic_writing.models.DatabaseSequences;
import com.example.academic_writing.repositories.DatabaseSequenceRepository;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SequenceGeneratorService {
    private MongoOperations mongoOperations;

    private final DatabaseSequenceRepository repository;

    public SequenceGeneratorService(MongoOperations mongoOperations, DatabaseSequenceRepository repository) {
        this.mongoOperations = mongoOperations;
        this.repository = repository;
    }

    public long generateSequence(String sequenceName) {
        Optional<DatabaseSequences> databaseData = repository.findDatabaseSequenceById(sequenceName);
        DatabaseSequences databaseSequence = new DatabaseSequences();

        if(databaseData.isPresent()){
            databaseSequence = databaseData.get();
            databaseSequence.setSeq(databaseSequence.getSeq() + 1);

            return  repository.save(databaseSequence).getSeq();
        }

        databaseSequence.setId(sequenceName);
        databaseSequence.setSeq(1);
        return repository.save(databaseSequence).getSeq();

    }
}
