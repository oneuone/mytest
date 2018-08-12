import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        policy1(s);
        policy2(s);
        policy3(s);

    }

    public static void policy1 (String s) {
        char[] input = s.toCharArray();
        int count = 0;

        if (input[0] != input[1]) {
            count++;
        }

        if (input[1] == 'D') {
            count++;
        }

        if (input.length > 2) {

            for (int i = 2; i < input.length; i++) {
                if (input[i] == 'D') {
                    count = count + 2;
                }
            }
        }
        System.out.println(count);
    }

    public static void policy2 (String s) {
        char[] input = s.toCharArray();
        int count = 0;

        if (input[0] != input[1]) {
            count++;
        }

        if (input[1] == 'U') {
            count++;
        }

        if (input.length > 2) {
            for (int i = 2; i < input.length; i++) {
                if (input[i] == 'U') {
                    count = count + 2;
                }
            }
        }

        System.out.println(count);
    }

    public static void policy3 (String s) {
        char[] input = s.toCharArray();
        int count = 0;

        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] != input[i+1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}