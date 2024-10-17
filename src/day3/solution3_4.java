package day3;
//연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 
//예를 들면 다음과 같습니다.
//12 ⊕ 3 = 123
//3 ⊕ 12 = 312
//양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 solution 함수를 완성해 주세요.
//단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.

public class solution3_4 {
    public static int solution(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt(Integer.toString(a) +Integer.toString(b));
        int ba = Integer.parseInt(Integer.toString(b) +Integer.toString(a));
        answer = (ab >= ba ? ab : ba);
        return answer;
    }

    public static int solution_o(int a, int b) {
        int answer = 0;
        int ab = Integer.parseInt("" + a + b); //자바는 문자열 + 숫자를 문자열로 인식!!
        int ba = Integer.parseInt("" + b + a);
        answer = ab >= ba ? ab : ba;
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(23,4));
        System.out.println(solution_o(23,4));
    }
    
}
