public class m_lc1 {
  static class mmlc1{
    
  }
  public static void main(String[] args) {
    new mmlc1();
    
    // static class mmlc2{}
    //error: illegal start of expression

    //public class mmlc2y1{}
    //new mmlc2y1();
    //error: illegal start of expression

    class mmlc3{}
    new mmlc3();
    //suc



    class mmlc4{
      static void m4(){
      }
      static class mmlc5{
      }
    }
    new mmlc4();
    //suc

  }
}
