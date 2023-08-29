package com.example.expensetrackerbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseTrackerService {
    private final ExpenseTrackerRep expenseTrackerRep;
    @Autowired
    public ExpenseTrackerService(ExpenseTrackerRep expenseTrackerRep) {
        this.expenseTrackerRep = expenseTrackerRep;
    }


    public Expense addExpense(Expense expense) {

        Expense newExpense = expenseTrackerRep.save(expense);
        return newExpense;
    }


        public  List<Expense> getAllExpenses() {

        return expenseTrackerRep.getAllExpenses();

        }





}
