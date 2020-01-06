package com.company;

public class Kata2nd {

    public static boolean isDigit(String s) {
        char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] c_arr = s.toCharArray();
        if (s.isEmpty() || s.length() > 1) {
            return false;
        } else {
            for (char i : chars) {
                if (c_arr[0] == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String createPhoneNumber(int[] numbers) {
        String phoneNubmer = "(***) ***-****";
        for (int i = 0; i < numbers.length; i++) {
            phoneNubmer = phoneNubmer.replaceFirst("\\*", String.valueOf(numbers[i]));
        }
        return phoneNubmer;
    }

    public static String accum(String s) {
        char[] charArray = s.toCharArray();
        String sb = "";
        String res = "";
        String def = "-";
        for (int i = 0; i < s.length(); i++) {
            sb = Character.toString(charArray[i]);
            sb = sb.toUpperCase();
            res = res.concat(sb);
            sb = sb.toLowerCase();
            int j = 0;
            while (j != i) {
                res = res.concat(sb);
                j++;
            }
            if (i == s.length() - 1) {
                return res;
            }
            res = res.concat(def);
        }
        return res;
    }

    public static int shiftLeft(String a, String b) {
        int times = 0;

        while (a.length() > b.length()) {
            a = a.substring(1, a.length());
            times++;
        }

        while (a.length() != b.length()) {
            b = b.substring(1, b.length());
            times++;
        }

        while (!a.equals(b)) {
            if (a.equals(b)) {
                return times;
            }
            if (!a.equals("")) {
                a = a.substring(1, a.length());
                times++;
            }
            if (!b.equals("")) {
                b = b.substring(1, b.length());
                times++;
            }
        }
        return times;
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] == 'a' || charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u')
                vowelsCount++;
        }
        return vowelsCount;
    }

    public static boolean  isIsogram(String str) {
        char[] charArray = str.toCharArray();
        for(int i=0;i<charArray.length;i++){
            for (int j=0;j<charArray.length;j++){
                if(j==i) {
                    continue;
                }
                if(Character.toLowerCase(charArray[i])==Character.toLowerCase(charArray[j])){
                    return false;
                }
            }
        }
        return true;
    }

    public static int findShort(String s) {
        String[] word=s.split("\\s");
        int temp=word[0].length();
        for (int i=0; i<word.length;i++)
        {
            if(temp>word[i].length())
            {
                temp=word[i].length();
            }
        }
        return temp;
    }

    public static String getMiddle(String word) {
        int temp=word.length();
        String answer="";
        if(temp%2==0){
            answer+=word.charAt(temp/2-1);
            answer+=word.charAt(temp/2);
        }
        else{
            answer+=word.charAt(temp/2);
        }
        return answer;
    }
}
