package br.com.etechoracio.ingresso.entity;

import br.com.etechoracio.ingresso.enums.ClassificacaoIndicativaEnum;
import br.com.etechoracio.ingresso.enums.CategoriaFilmeEnum;
import br.com.etechoracio.ingresso.enums.SimNaoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "TBL_SESSAO")
public class Sessao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SESSAO")
    private Integer id;

    @Column(name = "DT_SESSAO")
    private LocalDate data;

    @Column(name = "HORARIO")
    private LocalTime horario;

    @Column(name = "PRECO")
    private Double preco;

    @Column(name = "SALA")
    private String sala;

    @ManyToOne
    @JoinColumn(name = "FILME_FK")
    private Filme filme;


}