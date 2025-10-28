import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec, min, hr, i, j, k;
        System.out.println("Enter the hr");
        hr = sc.nextInt();
        System.out.println("enter the min");
        min = sc.nextInt();
        System.out.println("Enter the sec");
        sec = sc.nextInt();
        do {


            while (hr < 12)
            {
                while (min < 60) {
                    while (sec < 59) {
                         System.out.print("\u000C");
                        try {

                            Thread.sleep(1000);
                            sec++;
                            System.out.println(hr + ":" + min + ":" + sec);


                        } catch (Exception e) {
                        }
                    }
                    sec = -1;
                    min++;
                }
                min = 0;
                hr++;
            }
            hr = 0;
        } while(hr==0);
    }
}
