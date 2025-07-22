
//また以下のjavaコードの問題点教えて

public class m10y6 {

  public static void main(String[] args) {



    //--localVariJava1234567
    //static class m10y6
    class mm10y6
    {
      int res = sam();
      //System.out.println(res);
      mm10y6(){
        System.out.println(res);
      }
      private static int sam()
      //suc
      //suc  private int sam()
      //suc protected int sam()
      //sucJava public int sam() 
      //sucJava int sam()
      //
      {
        try {
          throw new RuntimeException();
        } catch (RuntimeException e){
          return 10;
        } finally {
          return 20;
        }
      }
    } 

    new mm10y6();
    //20



////
////

  }
}
