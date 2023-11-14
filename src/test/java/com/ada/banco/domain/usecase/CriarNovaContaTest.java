package com.ada.banco.domain.usecase;

import com.ada.banco.domain.gateway.ContaGateway;
import com.ada.banco.domain.model.Conta;
import com.ada.banco.dummy.ContaGatewayDummyImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CriarNovaContaTest {

    @Test
    public void deveLancarUmaExceptionCasoUsuarioJaTemUmaConta(){

        // Given
        ContaGateway contaGateway = new ContaGatewayDummyImpl();
        CriarNovaConta criarNovaConta = new CriarNovaConta(contaGateway);

        Conta conta = new Conta(13579L,2020L,1L, BigDecimal.ZERO,"Matheus", "12345678901");

        // When
        Assertions.assertThrows(Exception.class, ()-> criarNovaConta.execute(conta));

    }

    @Test
    public void deveCriarUmaContaComSucesso(){

        // Given
        ContaGateway contaGateway = new ContaGatewayDummyImpl();
        CriarNovaConta criarNovaConta = new CriarNovaConta(contaGateway);

        Conta conta = new Conta (24680L,3030L,2L, BigDecimal.ZERO,"Enzo", "10987654321");

        // When
        Assertions.assertAll(
                ()-> Assertions.assertEquals(conta, criarNovaConta.execute(conta)),
                ()-> Assertions.assertEquals("Enzo",conta.getTitular())
        );

    }

}