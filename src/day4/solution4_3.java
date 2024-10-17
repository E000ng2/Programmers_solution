package day4;

//양의 정수 n이 매개변수로 주어질 때, 
//n이 홀수라면 n 이하의 홀수인 모든 양의 정수의 합을 return 하고 n이 짝수라면 
//n 이하의 짝수인 모든 양의 정수의 제곱의 합을 return 하는 solution 함수를 작성해 주세요.
//제한사항
//1<= n <= 100

public class solution4_3 {
    public static int solution(int n){
        int answer = 0;
        if (n % 2 == 1)
        {
            while(true)
            {
                answer += n;
                n -= 2;
                if (n <0)
                {
                    break;
                }
            }
        }
        else
        {
            while(true)
            {
                answer += n*n;
                n -= 2;
                if (n < 0)
                {
                    break;
                }
            }
        }
        return answer;
    }

    public static int solution_o(int n){
        int answer = 0;
        for (int i = n; i >= 0; i -= 2)
        {
            answer += (n % 2 == 0) ? i * i : i;
        }
        return answer;

    }

    public static void main(String[] args)
    {
        System.out.println(solution(3));
        System.out.println(solution(20));
        System.out.println(solution_o(3));
        System.out.println(solution_o(20));
    }

    
}
