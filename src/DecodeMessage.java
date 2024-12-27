class DecodeMessage {
    public static String decodeMessage(String message) {
       String reversedMessage = new StringBuilder(message).reverse().toString();
      String decodedMessage = reversedMessage.replace("a","*").replace("m","#");
      return decodedMessage;

    }
}
