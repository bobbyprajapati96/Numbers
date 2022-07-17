package NUmbers;

//LCM of two numbers will at least be equal or greater than max(num1, num2)
//Largest possibility of LCM will be num1 * num2
public class lcm {
    public static void main(String[] args) {
        int n1=12;
        int n2=14;
        int max=(n1 > n2) ? n1 :n2;
        int lcm=0;
        for(int i=max;i<=n1*n2;i++)
        {
            if(i%n1==0 && i%n2==0)
            {
                lcm=i;
                break;
            }
        }
        System.out.println(lcm);
    }
}
