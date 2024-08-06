package org.jessicalopes.votingsystemapi.repository;

import org.jessicalopes.votingsystemapi.model.ParameterModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParameterRepo extends MongoRepository<ParameterModel, String> {
}
