package com.vitor.teste;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataParser {
    String data;

    public DataParser(String data){
        this.data = conversor(data);
    }

    private String parser(LocalDate dataToConvert){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");
        return dataToConvert.format(formatter);
    }

    private String conversor(String data) {
        boolean allDigits = true;
        LocalDate dataToConvert = null;
        char[] dateToParse = data.toCharArray();

        DateTimeFormatter   formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"),
                            formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy"),
                            formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd"),
                            formatter4 = DateTimeFormatter.ofPattern("ddMMyyyy");


        for(char c : dateToParse) {
            if (!Character.isDigit(c)) {
                allDigits = false;
            }
        }

        if (allDigits)
            dataToConvert = LocalDate.parse(data, formatter4);
        else if (data.indexOf("-") > 3)
            dataToConvert = LocalDate.parse(data, formatter3);
        else if(data.contains("-"))
            dataToConvert = LocalDate.parse(data, formatter2);
        else if(data.contains("/"))
            dataToConvert = LocalDate.parse(data, formatter1);

        assert dataToConvert != null;
        return parser(dataToConvert);
    }
}
