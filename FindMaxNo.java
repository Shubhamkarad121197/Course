public class FindMaxNo {
    public static void main(String[] args) {
        int arr[]={12,34,11,67,22};
        int maxNo=arr[0];
        for(int i:arr){
            if(i>maxNo){
                maxNo=i;
            }
        }

        System.out.println(maxNo);
    }
}
