package org.jessicalopes.votingsystemapi.repository;

import org.jessicalopes.votingsystemapi.model.ContestantModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContestantRepo extends MongoRepository<ContestantModel, String> {
}
