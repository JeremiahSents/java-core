class AquariumCodeTranslator {
    public static String aquariumCodeTranslator(int fishCount) {
      String binaryString = Integer.toBinaryString(fishCount);
      return binaryString.replace("0","water").replace("1","fish");
    }
}
