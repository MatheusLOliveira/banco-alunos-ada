package com.ada.banco.dummy;

import com.ada.banco.domain.gateway.ContaGateway;
import com.ada.banco.domain.model.Conta;

import java.math.BigDecimal;

public class ContaGatewayDummyImpl implements ContaGateway {

    @Override
    public Conta buscarPorCpf(String cpf) {

        if (cpf.equals("12345678901")){
            return new Conta(13579L,2020L,1L, BigDecimal.ZERO,"Matheus", "12345678901");
        }

        return null;

    }

    @Override
    public Conta salvar(Conta conta) {

        return new Conta (24680L,3030L,2L, BigDecimal.ZERO,"Enzo", "10987654321");

    }

}