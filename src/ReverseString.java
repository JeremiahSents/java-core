class ReverseString {
    public static String reverseString(String original) {
   String reversedString = "";
   for (int i = original.length()-1; i>=0; i --){
       reversedString += original.charAt(i);
   }
        return reversedString;
    }
}
