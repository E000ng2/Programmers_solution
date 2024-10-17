package day4;

//정수 number와 n, m이 주어집니다. 
//number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
//제한사항
//10 <= number <= 100
//2 <= n, m < 10

public class solution4_2 {
    public static int solution(int number, int n, int m){
        int nn = number % n == 0 ? 1 : 0;
        int nm = number % m == 0 ? 1 : 0;
        return nn + nm == 2 ? 1 : 0;
    }

    public static int solution_o(int number, int n, int m){
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }

    public static void main(String[] args){
        System.out.println(solution(56, 7, 8));
        System.out.println(solution(56, 7, 3));
        System.out.println(solution_o(56, 7, 8));
        System.out.println(solution_o(56, 7, 3));

    }
}
