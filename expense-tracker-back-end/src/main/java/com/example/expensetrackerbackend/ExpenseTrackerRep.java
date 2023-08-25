package com.example.expensetrackerbackend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
public interface ExpenseTrackerRep extends JpaRepository<Expense, Integer> {


    @Query(value= "SELECT * FROM expenses.expense", nativeQuery = true)
    List<Expense> getAllExpenses();






}
