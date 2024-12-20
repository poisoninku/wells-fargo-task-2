package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    protected Portfolio() {
    }

    public Portfolio(String name, Client client) {
        this.name = name;
        this.client = client;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
