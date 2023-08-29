package com.example.expensetrackerbackend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ExpenseTrackerController {

    private final ExpenseTrackerService expenseTrackerService;
    @Autowired
    public ExpenseTrackerController(ExpenseTrackerService expenseTrackerService) {
        this.expenseTrackerService = expenseTrackerService;
    }


    @PostMapping("/addExpense")
    public ResponseEntity<Expense> createDrink(@RequestBody Expense expense) {
        Expense newExpense = expenseTrackerService.addExpense(expense);
        return ResponseEntity.status(HttpStatus.CREATED).body(newExpense);
    }


    @GetMapping("/expenses")
    public ResponseEntity< List<Expense>> getAllExpenses() {
        return ResponseEntity.status(HttpStatus.OK).body(expenseTrackerService.getAllExpenses());
    }




}
