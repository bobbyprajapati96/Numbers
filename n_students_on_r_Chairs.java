package Numbers;

public class n_students_on_r_Chairs {
    static int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
//        System.out.println(fact);
        return fact;
    }

    public static void main(String[] args) {
        int n=4;
        int r=9;
        int ans=factorial(n)/factorial(n-r);
        System.out.println(ans);
    }
}
