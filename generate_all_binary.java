public class generate_all_binary {
  public static void main(String[] args) {
    int postion = 0;
    int N = 4;
    String current = "";
    generate(postion, N, current);
  }

  public static void generate(int pos,int n,String curr)
  {
    if(pos==n)
    {
      System.out.println(curr);
      return;
    }
    generate(pos+1, n, curr+"0");
    generate(pos+1, n, curr+"1");
  }
  
}
