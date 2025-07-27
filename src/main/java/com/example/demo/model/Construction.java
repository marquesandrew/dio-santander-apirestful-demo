package com.example.demo.model;

import jakarta.persistence.*;


import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Construction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 100)
    private String nome;

    private LocalDateTime inicio;

    @Column(precision = 13, scale = 2)
    private BigDecimal valor;

    @OneToOne
    private Address address;

    @OneToOne
    private Client client;

    @Version
    private Long version;

    public Construction(){}

    public Construction(Integer id, String nome, LocalDateTime inicio, BigDecimal valor, Address address, Client client) {
        this.id = id;
        this.nome = nome;
        this.inicio = inicio;
        this.valor = valor;
        this.address = address;
        this.client = client;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public Address getEndereco() {
        return address;
    }

    public void setEndereco(Address address) {
        this.address = address;
    }

    public Client getCliente() {
        return client;
    }

    public void setCliente(Client client) {
        this.client = client;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
