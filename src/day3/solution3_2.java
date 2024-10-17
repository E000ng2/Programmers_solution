package day3;

//문자들이 담겨있는 배열 arr가 주어집니다.
//arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.
//제한사항
//1<= arr의 길이 <= 200
//arr의 원소는 전부 알파벳 소문자로 이루어진 길이가 1인 문자열입니다.

public class solution3_2 {
    

    public static String solution(String[] arr){
        String answer = "";
        for ( String a : arr){
            answer += a;
        }
        return answer;

    }

    public static String solution_o(String[] arr) {
        return String.join("",arr);
    }
    
    public static void main(String[] args)
    {
        String[] a = {"a", "b", "c"};
        System.out.println(solution(a));
        System.out.println(solution_o(a));

    }
        
}
