package com.machinery.transaction_svc.dto;

import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"codigoAgencia", "codigoConta"})
public class Conta implements Serializable {

    private static final long serialVersionUID = 2806412403585360625L;

    @NotNull( message = "Campo para informar o código da Agência." )
    private Long codigoAgencia;

    @NotNull( message = "Campo para informar o código da Conta." )
    private Long codigoConta;

    public Conta(Long codigoAgencia, Long codigoConta) {
        this.codigoAgencia = codigoAgencia;
        this.codigoConta = codigoConta;
    }
}
