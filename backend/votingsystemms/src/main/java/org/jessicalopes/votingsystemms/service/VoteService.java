package org.jessicalopes.votingsystemms.service;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.jessicalopes.votingsystemms.model.ContestantModel;
import org.jessicalopes.votingsystemms.model.VoteModel;
import org.jessicalopes.votingsystemms.repository.VoteRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
@AllArgsConstructor
public class VoteService {

    private final VoteRepository voteRepository;

//    @KafkaListener(topics = "votes", groupId = "MicroServiceVote")
//    public void listen(String message) {
//        log.info("Received message: {}", message);
//    }

//    @KafkaListener(topics = "votes", groupId = "MicroServiceVote")
//    private void computeVote(ConsumerRecord<String, String> register) {
//        log.info("Received message with key: {}, partition: {}, offset: {}",
//                register.key(), register.partition(), register.offset());
//
//        String contestantString = register.value();
//        log.info("Vote registered = {}", contestantString);
//
//        ObjectMapper mapper = new ObjectMapper();
//        ContestantModel contestant = null;
//
//        try {
//            contestant = mapper.readValue(contestantString, ContestantModel.class);
//        } catch (JsonProcessingException e) {
//            log.error("Failed to parse contestant [ {} ]", contestantString, e);
//            return;
//        }
//
//        VoteModel vote = new VoteModel(null, contestant, new Date());
//        log.info("Attempting to save vote: {}", vote);
//        try {
//            VoteModel entity = voteRepository.save(vote);
//            log.info("Vote computed = {}, dateTime ={}", entity.getId(), entity.getDateTime());
//        } catch (Exception e) {
//            log.error("Failed to save vote: {}", vote, e);
//        }
//    }


    @KafkaListener(topics = "votes", groupId = "MicroServiceVote")
    private void execute(ConsumerRecord<String, String> register) {

        String contestantString= register.value();
        log.info("Voto recebido = {}", contestantString);

        ObjectMapper mapper = new ObjectMapper();
        ContestantModel participante = null;

        try {
            participante = mapper.readValue(contestantString,ContestantModel.class);
        } catch (JsonProcessingException ex) {
            log.error("Falha ao converter voto [{}]", contestantString, ex);
            return;
        }

        VoteModel vote = new VoteModel(null, participante, new Date());
        VoteModel entity = voteRepository.save(vote);

        log.info("Voto registrado com sucesso [id={}, dataHora={}]", entity.getId(), entity.getDateTime());
    }

}
