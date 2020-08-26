package com.partition;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       int[][] floor1 = new int[][] {{1, 0, 0, 0},{0, 1, 0, 0},{0, 1, 1, 0},{0, 0, 0, 1}};
       int[][] floor2 = new int[][] {{1, 0, 0, 0},{1, 0, 1, 0},{0, 1, 1, 0},{0, 0, 0, 1}};

       checkIsSamePartition(floor1, "Example 1");
       checkIsSamePartition(floor2, "Example 2");
    }

    private static void checkIsSamePartition(int[][] data, String title) {
        System.out.println("===== " + title + " =====");
        int partition = 0, rowIndex = 0, columnIndex = 0;
        ArrayList<Integer> foundedRow = new ArrayList<>(), foundedCol = new ArrayList<>();

        for(rowIndex = 0; rowIndex < data.length; rowIndex++) {

            for(columnIndex = 0; columnIndex < data[rowIndex].length; columnIndex++) {

                if(data[rowIndex][columnIndex] > 0) {

                    if(!foundedRow.contains(rowIndex) && !foundedCol.contains(columnIndex)) {
                        partition += data[rowIndex][columnIndex];
//                        System.out.println(rowIndex + "," + columnIndex);
                    }
                    foundedRow.add(rowIndex);
                    foundedCol.add(columnIndex);
                }
            }
        }
        System.out.println("Partition : " + partition + "\n");
    }
}
