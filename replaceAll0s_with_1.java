package Numbers;

public class replaceAll0s_with_1 {
    public static void main(String[] args) {
        int n=120003;
        String s=Integer.toString(n);
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
                ans+='1';
            else
                ans+=s.charAt((i));
        }
        System.out.println(ans);
    }
}
