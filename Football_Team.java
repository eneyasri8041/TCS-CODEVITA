import java.util.*;

public class Football_Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine(); // Number of players
        int com = n*(n-1)/2;
        Player[] match = new Player[com];
        for (int i = 0; i < com; i++) {
            char t1 = sc.next().charAt(0); // Opener
            char t2 = sc.next().charAt(0); // 2nd player
            String score = sc.nextLine(); // Score chart
            match[i] = new Player(t1, t2, score);
        }
        int point[] = new int[n];
        for (int i = 0; i < n; i++) {
            point[i] = 0;
        }
        for (int i = 0; i < com; i++) {
            String[] num = match[i].score.trim().split("-");
            int c = Integer.parseInt(num[0]) - Integer.parseInt(num[1]);
            if (c > 0) {
                char ch = match[i].a;
                point[(int) ch - 65] += 3;
            } 
            else if (c < 0) 
            {
                char ch = match[i].b;
                point[(int) ch - 65] += 3;
            } 
            else 
            {
                char ch1 = match[i].a;
                point[(int) ch1 - 65] += 1;
                char ch2 = match[i].b;
                point[(int) ch2 - 65] += 1;
            }
        }
        int max = point[0];
        char Ch = 'A';
        for (int i = 1; i < n; i++) {
            if (point[i] > max) {
                max = point[i];
                Ch = (char) (i + 65);
            }
        }
        System.out.println(Ch);
        System.out.println(max);
    }
}

class Player {
    char a;
    char b;
    String score;

    public Player(char a, char b, String score) 
    {
        this.a = a;
        this.b = b;
        this.score = score;
    }
}
