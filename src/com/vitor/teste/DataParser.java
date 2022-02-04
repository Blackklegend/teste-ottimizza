package com.vitor.teste;

public class DataParser {
    String data, parsedData;

    public DataParser(String data) {
        this.data = data;
    }

    private void parser(String date) {
        char[] parts = date.toCharArray();
        StringBuilder parsedData = new StringBuilder();
        int counter = 0;

        for (char item : parts) {
            if (Character.isDigit(item)) {
                parsedData.append(item);
            }
            if(item == '-' || item == '/') {
                counter++;
            }
        }
        this.parsedData = parsedData.toString();
    }

}
