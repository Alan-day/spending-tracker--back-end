package com.example.expensetrackerbackend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseTrackerRep extends JpaRepository<Expense, Integer> {


    @Query(value= "SELECT * FROM expense.expenses", nativeQuery = true)
    List<Expense> getAllData();






}
