package org.jessicalopes.votingsystemms.repository;

import org.jessicalopes.votingsystemms.model.VoteModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VoteRepository extends MongoRepository<VoteModel, String> {
}
