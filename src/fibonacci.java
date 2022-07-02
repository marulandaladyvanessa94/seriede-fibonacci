public class fibonacci {
    public static void main(String args[]){
        int a =0;
        int b =1;
        int c;
        for (int i=0 ; i<=30; i++){
            c=a+b;
            System.out.println(a);
            a=b;
            b=c;

        }
    }
}
