package Clases;

public class ejem1 {
    public static void main(String[] args) {
        int [] values = {};
        for (int i = 0; i < 10000000; i++) {
            int index = -1;
            for (int j = 0; j < values.length; j++) {
                if (values[j] == 80) {
                    index = j;
                    System.out.println("Elemto encontrado en la posicicion :" + index);
                    break;
                }
            }
        }
    }
}