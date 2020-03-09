package edu.infnet.patrimonio.negocio.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "patrimonio")
public class Patrimonio {

    @Id
    private String id;

    private String descricao;

    private String localizacao;

}
