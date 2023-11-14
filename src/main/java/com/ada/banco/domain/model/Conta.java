package com.ada.banco.domain.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Conta {
    private Long id;
    private Long agencia;
    private Long digito;
    private BigDecimal saldo;

    // Usuario / Titular
    private String titular;
    private String cpf;

    public Conta(Long id, Long agencia, Long digito, BigDecimal saldo, String titular, String cpf) {
        this.id = id;
        this.agencia = agencia;
        this.digito = digito;
        this.saldo = saldo;
        this.titular = titular;
        this.cpf = cpf;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAgencia() {
        return agencia;
    }

    public void setAgencia(Long agencia) {
        this.agencia = agencia;
    }

    public Long getDigito() {
        return digito;
    }

    public void setDigito(Long digito) {
        this.digito = digito;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Conta conta = (Conta) object;
        return Objects.equals(id, conta.id) && Objects.equals(agencia, conta.agencia) && Objects.equals(digito, conta.digito) && Objects.equals(saldo, conta.saldo) && Objects.equals(titular, conta.titular) && Objects.equals(cpf, conta.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, agencia, digito, saldo, titular, cpf);
    }
}
