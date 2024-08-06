package org.jessicalopes.votingsystemms.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "votes")
public class VoteModel {

    @Id
    private String id;
    private ContestantModel contestant;
    private Date dateTime;

}
