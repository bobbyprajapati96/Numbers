package Numbers;

public class numberOF_handshakes {
    public static void main(String[] args) {
        int n=30;
        int ans=0;
        for(int i=1;i<=30;i++)
        {
            ans= n*(n-1)/2;
        }
        System.out.println(ans);
    }
}
