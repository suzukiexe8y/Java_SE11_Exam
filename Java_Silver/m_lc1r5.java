

//また以下のjavaコードの問題点教えて。エラーを解決して


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class m_lc1r5
{
  public static void main(String[] args) {

////
/// 
    
    class lc1r5{
      void lm1t2(){}
      protected void lm1t3(){}
      public void lm1t4(){}
      private void lmlt5(){}
      static void lm1t6(){}
      
      // abstract void lm1ab(){}
      //error: abstract methods cannot have a body 
      
      //abstract void lm1aby1()
      //error: ';' expected
      //abstract void lm1aby1();
      //error: lc1r5 is not abstract and does not override abstract method lm1aby1() in lc1r5
      //そのabstractメソッドの親クラスもabstractクラスでなくてはならない
      //abstarct class lc1abc1
      abstract public class lc1abc1
      {
          abstract void lc1abc1m1();
          private void lc1abc1m2(){};
          void lc1abc1m3(){};
          protected void lc1abc1m4(){};
          public void lc1abc1m5(){};

          static private void lc1abc1m6(){
            System.out.println("lc1abc1m6");
          };

          final private void lc1abc1m7(){};
            
      }



      private int lv1t1 = 5;
      int lv1t2 = 54; 
      protected int lv1t3 = 5; 
      public int lv1t4 = 5;

      static private int lv1t1s = 5;
      static int lv1t2s = 54; 
      protected int lv1t3s = 5; 
      public int lv1t4s = 5; 

      private void lm1t1(){
        System.out.println("asda");
      }

      /////
      /// ////
      private class lc1c2{

        private class lc1c3{
          private void lc1c3m1(){
            //private class lc1c3m3c1{} 
            //error: illegal start of expression
            // static class lc1c3m3c1{}
            class lc1c3m3c1{
              static private
              int lv1 = 5;
              static int lv2 = 54;

            } 
          
          }
        }

          //static lm1y5y1(){}
        void lm1t2(){}
        protected void lm1t3(){}
        public void lm1t4(){}
        static void lm1t5(){}

        private int lv1t1 = 5;
        int lv1t2 = 54; 
        protected int lv1t3 = 5; 
        public int lv1t4 = 5;

        static private int lv1t1s = 5;
        static int lv1t2s = 54; 
        protected int lv1t3s = 5; 
        public int lv1t4s = 5; 

        

      }
 
    } 


    //lc1r5 instLc1r5 = new  lc1r5();

    //lc1abc1m6();
    //error: cannot find symbol

    //new lc1r5().lc1abc1().lc1abc1m6();  
    //error: cannot find symbol   
   // new lc1r5().new lc1abc1().lc1abc1m6();
    // error: lc1r5.lc1abc1 is abstract; cannot be instantiated

    // new lc1r5().new lc1abc1().lc1abc1m6();
   

     lc1r5 instLc1r5 = new lc1r5();
        // 匿名クラスを使用して lc1abc1 を実装
        lc1r5.lc1abc1 lc1abc1Instance = instLc1r5.new lc1abc1() {
            @Override
            void lc1abc1m1() {
                // 抽象メソッドの実装
                System.out.println("lc1abc1m1 implemented");
            }
        };
        lc1abc1Instance.lc1abc1m1(); // 抽象メソッドの呼び出し
        lc1r5.lc1abc1.lc1abc1m6(); // 静的メソッドの呼び出し



///
/// 

  }
}
