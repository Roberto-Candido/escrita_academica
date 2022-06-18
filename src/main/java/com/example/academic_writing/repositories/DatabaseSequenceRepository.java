package com.example.academic_writing.repositories;

import com.example.academic_writing.models.DatabaseSequences;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface DatabaseSequenceRepository extends MongoRepository<DatabaseSequences, String> {
    Optional<DatabaseSequences> findDatabaseSequenceById(String id);
}
