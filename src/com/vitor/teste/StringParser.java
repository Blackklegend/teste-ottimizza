package com.vitor.teste;

public class StringParser {
    String parsedArray;
    
    StringParser(String[] array) {
        StringBuilder result = new StringBuilder();
        
        for (String s : array) {
            result.append(s);
            result.append(" ");
        }
        this.parsedArray = result.toString();
    }
}
