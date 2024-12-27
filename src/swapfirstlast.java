public class swapfirstlast {
    public static String swapFirstLast(String str) {
        if (str.length() < 3 || str.charAt(0) == str.charAt(str.length() - 1)) {
            return str;
        }
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length() - 1);
        String newStr = str.substring(1, str.length() - 1);
            return lastChar + newStr + firstChar;
        }
    }
