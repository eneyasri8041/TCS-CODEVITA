import java.util.*;
public class Pipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1=0, sum2=0;
        int M = sc.nextInt();
        int N = sc.nextInt();
        int R = sc.nextInt();
        int[] m = new int[M];
        for (int i = 0; i < M; i++) {
            m[i] = sc.nextInt();
            sum1 += m[i]-R;
        }
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = sc.nextInt();
            sum2 += n[i]-R;
        }
        int val = sum1 - sum2;
        if(val>0)
        {
            System.out.println(-(val+R));
        }
        else if(val == 0)
        {
            System.out.println("Balanced");
        }
        else
        {
            System.out.println(val+R);
        }
    }
}
