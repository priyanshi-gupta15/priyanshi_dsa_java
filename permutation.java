public class permutation {
  public static void main(String[] args) {
    String p = "123";
    allpermutation("", p);
  }
  
  public static void allpermutation(String processed, String unprocessed) {
    if (unprocessed.isEmpty()) {
        System.out.println(processed);
        return;
    }

    char ch = unprocessed.charAt(0);

    for (int i = 0; i <= processed.length(); i++) {
        String first = processed.substring(0, i);
        String second = processed.substring(i);

        allpermutation(first + ch + second, unprocessed.substring(1));
    }
}
  
}
