package Numbers;

public class decimal_to_binary {
    public static void main(String[] args) {
        int deci=5;
        int binary[]=new int[20];
        int i=0;
       while(deci>0)
       {
           int r=deci%2;
           binary[i++]=r;
           deci=deci/2;
       }
       for(int j=i-1;j>=0;j--)
       {
           System.out.print(binary[j]);
       }
    }
}
