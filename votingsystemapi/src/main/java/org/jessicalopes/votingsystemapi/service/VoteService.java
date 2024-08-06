package org.jessicalopes.votingsystemapi.service;

import lombok.AllArgsConstructor;
import org.jessicalopes.votingsystemapi.model.ContestantModel;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class VoteService {

    public static final String  TOPIC_VOTES = "votes";

    private final KafkaTemplate<Object, Object> template;


    public void addEvent (ContestantModel contestant){

        template.send(TOPIC_VOTES,contestant);

    }
}
