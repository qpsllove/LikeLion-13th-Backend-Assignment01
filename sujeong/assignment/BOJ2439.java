package assignment;

import java.util.Scanner;   //Scanner 클래스 가져오기

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    //Scanner 객체 생성

        int N = scanner.nextInt();   // 정수 N 입력 받기

        int line = 1;
        while (line <= N) {

            int space = 0;
            while (space < N - line) {
                System.out.print(" ");   //공백 출력 ex) N이 5이고 line이 1이면 공백 4개 출력
                space++;
            }

            int star = 0;
            while (star < line) {
                System.out.print("*");   //별 출력 ex) line이 5이면 * 5개 출력
                star++;

            }

            System.out.println();    //줄 바꿈
            line++;

        }

    }

}