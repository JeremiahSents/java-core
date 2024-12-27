class TransformStrings {
    public static String transformStrings(String original, String modifier) {
String reversedOriginal = new StringBuilder(original).reverse().toString();
String conactenatedString = reversedOriginal + modifier;
String fullReversed = new StringBuilder(conactenatedString).reverse().toString();

        return fullReversed;
    }
}
