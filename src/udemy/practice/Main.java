package udemy.practice;

import java.net.StandardSocketOptions;

public class Main {

    public static void main(String[] args) {
        String s = "this is a programming language string";
        String[] token = s.split(" ");
        for (int i = 0; i < token.length; i++) {
            StringBuilder input = new StringBuilder();
            input.append(token[i]);
            input.reverse();
            System.out.print(input + " ");
            System.out.print("this is done");

        }
    }
}
