/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul
 */
public class quick {
    public static void main(String[] args) {
        int arr[]={54,12,78,64,23,96,14,87,36,78};
        for (int i = 1; i < 10; i++) {
            quicksort(arr,0,9);
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(j+":"+arr[j]);
        }
    }
    static void quicksort(int arr[], int low, int high){
        if (low<high) {
            int pi = partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);            
        }

    }
    static int partition(int arr[],int low,int high){
        int i=low-1;
        for (int j = low; j < high; j++) {
            if (arr[j]<=arr[high]) {
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            
        }
        int temp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return (i+1);
        
    }
}
