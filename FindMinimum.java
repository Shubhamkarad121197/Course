public class FindMinimum {
    public static void main(String[] args) {
        int arr[]={23,56,12,67,89,32};
        int minVal=arr[0];
        for(int i:arr){
            if(minVal>i){
                minVal=i;
            }
        }
        System.out.println("Minimum Value is:"+minVal);
    }
}
