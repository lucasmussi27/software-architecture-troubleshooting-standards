package br.edu.utfpr.model;

import br.edu.utfpr.dto.AnticipationDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Daily implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private AnticipationDTO anticipation;

    private String content;

    private String note;
}