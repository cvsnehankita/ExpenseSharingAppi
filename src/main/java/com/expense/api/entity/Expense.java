package com.expense.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expenseId;
    private Integer amount;
    private LocalDateTime createdAt;
    private LocalDateTime createdBy;

    public Expense(){}
    public Expense(Long expenseId, Integer amount, LocalDateTime createdAt, LocalDateTime createdBy) {
        this.expenseId = expenseId;
        this.amount = amount;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
    }

    public Long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Long expenseId) {
        this.expenseId = expenseId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(LocalDateTime createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "expenseId=" + expenseId +
                ", amount=" + amount +
                ", createdAt=" + createdAt +
                ", createdBy=" + createdBy +
                '}';
    }
}
