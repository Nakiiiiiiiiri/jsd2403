package practicedraft;
//int arr[]={10,9,1,20,19,30,5};
public class test {
    public static void main(String[] args) {
        int arr[]={10,9,1,20,19,30,5};
        int max = arr[0];
        int arrow = 0;
        for (int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
                arrow = i;

            }
        }System.out.println(arrow);
        System.out.println(max);
    }
}
