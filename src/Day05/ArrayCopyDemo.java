package Day05;
//灵活性好对比ArrayCopyOf
public class ArrayCopyDemo {
    public static void main(String[] args) {

        int[] a = {11,45,14};
        int[] b = new int[10];
        System.arraycopy(a,0,b,3,3);
        for(int i=0;i<=b.length-1;i++){
            if(b[i]==11||b[i]==45||b[i]==14){
                System.out.print(b[i]);
            }else
            System.out.print(" "+b[i]+" ");
        }
    }
}
