package org.Solvd.FirstLecture;
public class SortingAlgorithms {
    public static void main(String[] args){
        int[] list ={4,2,1,5,3};
        BubbleSort(list);
    }

    public static void BubbleSort(int[] list) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0;i<list.length - 1; i++) {
                //for (int j = 0; j < i; j++) {
                    if (list[i] > list[i + 1]) {
                        temp = list[i];
                        list[i] = list[i + 1];
                        list[i + 1] = temp;
                        sorted = false;
                        for (int k : list) {
                            System.out.print(k);
                        }
                        System.out.println("");
                   // }
                }
            }
        }
        System.out.println("List successfully sorted b!");
    }
}