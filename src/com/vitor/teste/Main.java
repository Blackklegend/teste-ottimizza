package com.vitor.teste;

public class Main {

    public static void main(String[] args) {
        
        //Teste 1, datas
        DataParser date = new DataParser("01052018");
        DataParser date2 = new DataParser("2018-05-01");
        DataParser date3 = new DataParser("01/05/2018");
        DataParser date4 = new DataParser("01-05-2018");
        DataParser date5 = new DataParser("08/10/2022");
        System.out.println(date.data);
        System.out.println(date2.data);
        System.out.println(date3.data);
        System.out.println(date4.data);
        System.out.println(date5.data);
    
        System.out.println("\n");
        
        //Teste 2, array de strings
        String[] array = new String[]{"CARLOS", "EDUARDO", "DA", "COSTA", "XAVIER"};
        StringParser string = new StringParser(array);
        System.out.println(string.parsedArray);

        System.out.println("\n");

        //Teste 3, array de ints
        int[] arrayInt = new int[]{334,568,123,796,225};
        int[] arrayInt2 = new int[]{335214,56548,125613,75496,225, 1, 1685, 9, 0, 15};
        IntParser integer = new IntParser(arrayInt);
        System.out.println(integer.parsedInt);
        IntParser integer2 = new IntParser(arrayInt2);
        System.out.println(integer2.parsedInt);
    }
}
