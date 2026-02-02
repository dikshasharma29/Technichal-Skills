public class MinTime{
    public static void main(String[] args){
        int arr[]={2,4,1,3};
        int max=arr[0];
        int time=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
           
        }
    System.out.println(time);
   
    }
}