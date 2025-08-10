package Day_2.Arrays;

public class MatrixOperations {
    public static void main(String[] args) {
        int[][] arr= new int[3][3];
        int largest = Integer.MIN_VALUE; 
        int largestR = 0, largestC = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=(int)((Math.random())*20)+1;
                System.out.print(arr[i][j]+" ");
                if (arr[i][j] > largest) {
                    largest = arr[i][j];
                    largestR = i;
                    largestC = j;
                }
            }
            System.out.println();
        }
        // Row sums
        for (int i = 0; i < arr.length; i++) {
            int sumr = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sumr += arr[i][j];
            }
            System.out.println("Sum of row " + i + " is: " + sumr);
        }

        // Column sums
        for (int j = 0; j < arr[0].length; j++) {
            int sumc = 0;
            for (int i = 0; i < arr.length; i++) {
                sumc += arr[i][j];
            }
            System.out.println("Sum of column " + j + " is: " + sumc);
        }
        System.out.println("Largest is: "+largest+" at position ("+largestR+", "+largestC+")");
    }

}
