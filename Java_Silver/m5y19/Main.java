//package m6y19;
//package m6y19;

public class Main{
  public static void main(String[] args){
   
    class Sample6y19 {
      private static Sample6y19 instance = null;
      private Sample6y19(){}

      public static Sample6y19 getInstance(){
        if(instance == null){
          instance = new Sample6y19();
//err
// \Java_Silver_Examp\m6y19> javac m6y19.java
//\Java_Silver_Examp\m6y19> java m6y19  
// Error: Could not find or load main class Main
// Caused by: java.lang.NoClassDefFoundError: Main 
//(wrong name: m6y19/Main)
////Cannot instance local 'Sample6y19' in a static context.
        }
        return instance;
      } 
      
      //delete this instance
      public static void destroyInstance() {
        instance = null;
      }
    }

    Sample6y19 obj1y6y19 = Sample6y19.getInstance();
    System.out.println("obj1y6y19>>" + obj1y6y19); // インスタンスのメモリアドレスを表示

    Sample6y19.destroyInstance(); // インスタンスを破棄

    Sample6y19 obj2y6y19 = Sample6y19.getInstance();
    System.out.println("obj2y6y19>>" + obj2y6y19);
  }

}
