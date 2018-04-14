package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results;
    private int count;
    private int firstSpecialNumber;
    private int secondSpecialNumber;
    private int thirdSpecialNumber;

    public FizzBuzzGame() {
        results = new ArrayList<>();
        count = 0;
        firstSpecialNumber = 3;
        secondSpecialNumber = 5;
        thirdSpecialNumber = 7;
    }

    public void setSpecialNumber(int firstSpecialNumber, int secondSpecialNumber, int thirdSpecialNumber) {
        this.firstSpecialNumber = firstSpecialNumber;
        this.secondSpecialNumber = secondSpecialNumber;
        this.thirdSpecialNumber = thirdSpecialNumber;
    }

    private void handle() {
        for (int i = 1; i <= count; i++) {
            String value = String.valueOf(i);
            if (value.contains(String.valueOf(firstSpecialNumber))) {
                results.add("Fizz");
            } else if(i % firstSpecialNumber == 0 && i % secondSpecialNumber == 0 && i % thirdSpecialNumber == 0) {
                results.add("FizzBuzzWhizz");
            } else if (i % firstSpecialNumber == 0 && i % secondSpecialNumber == 0) {
                results.add("FizzBuzz");
            } else if (i % firstSpecialNumber == 0 && i % thirdSpecialNumber == 0) {
                results.add("FizzWhizz");
            } else if (i % secondSpecialNumber == 0 && i % thirdSpecialNumber == 0) {
                results.add("BuzzWhizz");
            } else if (i % firstSpecialNumber == 0) {
                results.add("Fizz");
            } else if (i % secondSpecialNumber == 0) {
                results.add("Buzz");
            } else if (i % thirdSpecialNumber == 0) {
                results.add("Whizz");
            } else {
                results.add(String.valueOf(i));
            }
        }
    }
    public void start(int count) {
        this.count = count;
        handle();
    }

    public List<String> getResults() {
        return results;
    }

    public String getResultByIndex(int index) {
        return results.get(index - 1);
    }
}


