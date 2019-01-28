package challenges;

/**
 * Answer to https://www.hackerrank.com/challenges/repeated-string/problem
 */
public class RepeatedString {
    public static int repeatedString(String s, int n){
        int numberOfAs =  0;
        int j;
        // Prevent re-initialising a new object since toCharArray will call the String.toValue for each item at least once.
        char[] charArr = s.toCharArray();
        for (int i = 0; i <= n ; i++){
            // We need to be careful to not iterate over the number of chars in the infinite string.
            for (j = 0; j+i < n && j <  s.length() ; j++){
                if (charArr[j] == 'a'){
                    numberOfAs++;
                }
            }
            i = i+j;
        }
        return numberOfAs;
    }
}
