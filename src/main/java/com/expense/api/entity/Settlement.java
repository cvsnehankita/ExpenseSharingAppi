package com.expense.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Settlement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payerId;
    private Long receiverId;
    private Integer amount;
    //private Expense expenseId;

    public Settlement() {}

    public Settlement(Long payerId, Long receiverId, Integer amount, Expense expenseId) {
        this.payerId = payerId;
        this.receiverId = receiverId;
        this.amount = amount;
       // this.expenseId = expenseId;
    }

    public Long getPayerId() {
        return payerId;
    }

    public void setPayerId(Long payerId) {
        this.payerId = payerId;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

//    public Expense getExpenseId() {
//        return expenseId;
//    }
//
//    public void setExpenseId(Expense expenseId) {
//        this.expenseId = expenseId;
//    }

    @Override
    public String toString() {
        return "Settlement{" +
                "payerId=" + payerId +
                ", receiverId=" + receiverId +
                ", amount=" + amount +
               // ", expenseId=" + expenseId +
                '}';
    }
}
