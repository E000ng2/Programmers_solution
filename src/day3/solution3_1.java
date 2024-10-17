package day3;

//문제 설명
//길이가 같은 두 문자열 str1과 str2가 주어집니다.
//두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 
//return 하는 solution 함수를 완성해 주세요.

//제한 사항
//1 ≤ str1의 길이 = str2의 길이 ≤ 10
//str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.

public class solution3_1 {
    static String solution(String str1, String str2)
    {
        String answer = "";
        for(int i = 0; i < str1.length(); i++)
        {
            answer += str1.toCharArray()[i];
            answer += str2.toCharArray()[i];
        }

        return answer;
    }

    static String solution_o(String str1, String str2)
    {
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < chars1.length; i++)
        {
            sb.append(chars1[i]).append(chars2[i]);
        }

        return sb.toString();
    }

    static public void main(String[]agrs)
    {
        // String a = solution("aaa", "bbb");
        System.out.println(solution("aaa", "bbb"));
        // String b = solution_o("aaa", "bbb");
        System.out.println(solution_o("aaa", "bbb"));
    
    }

}

