package interviews.Numbers;

public class SortArray {
    public static void main(String[] args) {
        int arr[]={4,3,1,6,7,0};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++)
        System.out.println(arr[k]);
        System.out.println("The second larget number is "+arr[arr.length-2]);
    }


}
