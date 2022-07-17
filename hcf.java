package NUmbers;


public class hcf {
    public static void main(String[] args) {
        int n1=42;
        int n2=14;
//        int n3=28;
//        int ans=0;
//        for(int i=1;i<= n1 || i<=n2 || i<= n3;i++) //check the highest i value which gives remainder 0 when divided
//        {
//            if(n1 % i ==0 && n2 % i ==0  && n3 % i == 0 ){
//                ans=i;
//            }
//        }
//        System.out.println(ans);

        //method 2
        while (n1 != n2)
        {
            if (n1 > n2)
                n1 -= n2;
            else
                n2 -= n1;
        }
        System.out.println(n1);

        // LCM formula
        //    int lcm = (n1 * n2) / hcf;
        //    System.out.println ("The LCM: " + lcm);

    }
}
