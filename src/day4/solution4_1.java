package day4;

//정수 num과 n이 매개 변수로 주어질 때, 
//num이 n의 배수이면 1을 return n의 배수가 아니라면 0을 return하도록 solution 함수를 완성해주세요.
//제한사항
//2 <= num <= 100
//2 <= n <= 9

public class solution4_1 {
    public static int solution(int num, int n){
        int answer = 0;
        if (num % n == 0)
        {
            answer = 1;
        }
        else
        {
            answer = 0;
        }
        return answer;
    }

    public static int solution_o(int num, int n){
        int answer = 0;
        answer = num % n == 0 ? 1 : 0;
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(89, 3));
        System.out.println(solution(24, 3));
        System.out.println(solution_o(89, 3));
        System.out.println(solution_o(24, 3));

    }

    
}
