package com.mindhub.homebanking.dtos;

import com.mindhub.homebanking.models.Loan;
import com.mindhub.homebanking.models.Turn;

import java.util.ArrayList;
import java.util.List;

public class LoanDTO {
    private long id;
    private String name;
    private Double maxAmount;
    private Double percentage;
    private List<Integer> payments = new ArrayList<>();


    public LoanDTO() {
    }

    public LoanDTO(Loan loans) {
        this.id = loans.getId();
        this.name = loans.getName();
        this.maxAmount = loans.getMaxAmount();
        this.percentage = loans.getPercentage();
        this.payments = loans.getPayments();

    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(Double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public List<Integer> getPayments() {
        return payments;
    }

    public void setPayments(List<Integer> payments) {
        this.payments = payments;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }
}