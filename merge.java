


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul
 */
public class merge {
    public static void main(String[] args) {
        int arr[]={54,12,78,64,23,96,14,87,36,78};
        for (int i = 1; i < 10; i++) {
            mergesort(arr,0,9);
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(j+":"+arr[j]);
        }
    }
    static void merges(int arr[],int l,int m,int r){
        int n1 = m-l+1;
        int n2 = r-m;
        int i=0,j=0,k=l;
        int L[]= new int[n1];
        int R[]= new int[n2];
        for (int n = 0; n < n1; ++n) {
            L[n]=arr[n+l];
        }
        for (int n = 0; n < n2; ++n) {
            R[n]=arr[n+m+1];
        }
        while (i<n1 && j<n2){
            if (L[i]<R[j]) {
                arr[k]=L[i];
                i++;
            }
            else{
                arr[k]=R[j];
                j++;
            }
            k++;
        } 
        while  (i<n1){
            arr[k]=L[i];
                i++;k++;
        }while  (j<n2){
            arr[k]=R[j];
                j++;k++;
        }
    }
    static void mergesort(int arr[],int l, int r){
        if (l<r) {
            int m=(l+r)/2;
        mergesort(arr,l,m);
        mergesort(arr,m+1,r);
        merges(arr,l,m,r);
        }
    }
    
}
