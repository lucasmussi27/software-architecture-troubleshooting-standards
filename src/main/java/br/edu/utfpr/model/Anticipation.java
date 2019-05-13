package br.edu.utfpr.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Anticipation implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String reason;

    @Enumerated (EnumType.STRING)
    private Modalities modalitie;

    @OneToOne
    private Lecturer lecturer;

    @Column(name="number_classes")
    private int numberClasses;

    @Column(name="previous_date")
    @Temporal(TemporalType.DATE)
    private Date previousDate;

    @Temporal (TemporalType.DATE)
    private Date date;

}