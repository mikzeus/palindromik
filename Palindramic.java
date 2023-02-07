
public class Palindramic {

        static boolean isPalindrome(String str) {
            int i = 0, j = str.length() - 1;
            while (i < j) {
                if (str.charAt(i) != str.charAt(j))
                    return false;
                i++;
                j--;
            }
            return true;
        }

        static boolean isPalindrome2(String str) {
            String pld = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                pld += str.charAt(i);
            }

            if (str.equals(pld))
                return true;
            else
                return false;
        }

        public static void main(String[] args) {
            System.out.println(isPalindrome("nazan"));
            System.out.println(isPalindrome("aydın"));
            System.out.println(isPalindrome2("didem"));
        }
    }


