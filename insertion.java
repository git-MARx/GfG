
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul
 */
public class insertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int [n];
        for(int t=0; t<n; t++){
            arr[t]= sc.nextInt();
        }
        for (int i = 1; i < n; i++) {
            sort(arr, i);
        }
        
    }
    static void sort(int arr[],int i){
        int key= arr[i];
        int n =arr.length;
        while  (i-1>=0 && arr[i-1]>key){
            arr[i]=arr[i-1];
            i--;
        }
        arr[i]=key;
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j]+" ");
        }
        System.out.println("");
    }
}
