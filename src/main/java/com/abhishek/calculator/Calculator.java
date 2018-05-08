package com.abhishek.calculator;
import org.springframework.stereotype.Service;
/**
 * Main Business logic.
 */
@Service
public class Calculator {
     int sum(int a, int b) {
          return a + b;
     }
}
