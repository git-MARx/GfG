public class selection{
    public static void main(String[] args) {
        int arr[]={12,54,78,64,23,96,14,87,36,78};
        for (int i = 0; i < 10; i++) {
            sort(arr, i);
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(j+":"+arr[j]);
        }
    }
    static void sort(int arr[], int i){
        int min_idx =i;
        for (int j = i; j < 10; j++) {
            if (arr[j]<arr[min_idx]) {
                min_idx=j;
            }
        }
        int temp=arr[i];
        arr[i]=arr[min_idx];
        arr[min_idx]=temp;
        
    }
}