package com.vitor.teste;

public class DataParser {
    String data;

    public DataParser(String data) {
        char[] parts = data.toCharArray();
        boolean allDigits = true, dateBR = false;
        StringBuilder cleanData = new StringBuilder();
        
        for(int i = 0; i < parts.length; i++) {
            if (Character.isDigit(parts[i])) {
                cleanData.append(parts[i]);
            }
            else if (i == 4) { //referente à data yyyy-mm-dd
                cleanData.append('-');
                allDigits = false;
            }
            else if (i == 5) { //referente à data dd-mm-yyyy
                cleanData.append('-');
                dateBR = true;
                allDigits = false;
            }
        }
        
        // Caso a data inserida esteja em ddMMyyyy
        if(allDigits) {
            this.data = isAllDigits(cleanData);
        }
        
        // Caso a data inserida esteja em dd-MM-yyyy
        if(dateBR) {
            this.data = isBR(cleanData);
        }
        
        // Caso a data inserida esteja em yyyy-mm-dd
        if(cleanData.length() > 7){
            cleanData.delete(7,9);
            this.data = cleanData.toString();
        }
        
    }
    
    //Organiza uma data composta por digitos no formato ddMMyyyy
    private String isAllDigits(StringBuilder cleanData) {
        cleanData.delete(0, 2);
        String newData = cleanData.substring(0, 2);
        cleanData.append(newData);
        cleanData.delete(0,2);
        cleanData.insert(4, '-');
        return cleanData.toString();
    }
    //Organiza uma data formato dd/mm/yyyy
    private String isBR(StringBuilder cleanData) {
        cleanData.delete(0, 2);
        String newData = cleanData.substring(0, 2);
        cleanData.append(newData);
        cleanData.delete(0,3);
        cleanData.insert(4, '-');
        return cleanData.toString();
    }
}
