

// public class se10y3 extends Exception{}    

// public  class sse10y3 extends se10y3  {} 



public class m10y3 {

  
public static  class se10y3 extends Exception{}    

public static  class sse10y3 extends se10y3  {} 

  public static void main(String[] aregs){

    // static void callse10y3() throws se10y3 {
    //   throw new se10y3();
    //  }
    
     try{
        callse10y3();
        callsse10y3();
      } catch (se10y3 e){
        System.out.println("se10y3");
      } 
      // catch(sse10y3 e){
      //   System.out.println("sse10y3");
      // }

  //}

  ///
  /// 

  // private static void callse10y3() throws se10y3 {
  //     throw new se10y3();
  //    }
  // private static void  callsse10y3() throws sse10y3{
  //     throw new sse10y3();
  //   }

  ///
  /// 

    static void callse10y3() throws se10y3 {
      throw new se10y3();
    }

     static  void  callsse10y3() throws sse10y3{
      throw new sse10y3();
    }
  }

}
