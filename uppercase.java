import java.util.Scanner;

class uppercase {
    public static void main(String[] args) {
        char ch;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter: ");
        ch = sc.next().charAt(0);  

        
        String op = (ch >= 'A' && ch <= 'Z') ? "uppercase character" : "not uppercase character";

        System.out.println(op);
    }
}
