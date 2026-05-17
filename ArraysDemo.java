public class ArraysDemo{
    public static void main(String args[]){
        int arr[]={10,20,30}; //Array
        arr[2]=40; //Assign values 
        for(int num:arr){
            System.out.println(num);
        }

        int multiArr[][]= {
            {1,2,3},
            {4,5,6}
        };
        for(int i=0;i<multiArr.length;i++){
            for (int j=0;j<multiArr[i].length;j++){
                System.out.print(multiArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}