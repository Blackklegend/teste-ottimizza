package com.vitor.teste;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntParser {
    int parsedInt;
    
    IntParser(int[] array){
        IntStream intStream = Arrays.stream(array);
        this.parsedInt = intStream.max().orElse(0);
    }
    
    
}
