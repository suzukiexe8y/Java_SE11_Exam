//import m10y3.se10y3;

public class Main {
  public static void main(String[] args){
    try{
      sup();
      sub();
    } catch (subse10y3 e){
      System.out.println("sub");
      //よりsubでは受けない
      //よりsupなら読める
    } catch  (supse10y3 e){
      System.out.println("sup");
    } 
    // catch (sse10y3 e){
    //   System.out.println("B");
    // }
    /* 
    error: exception sse10y3 has already been caught
     */

    ///output A
    /// 
    /// 
    
    try{
      sub();
      sup();
      // sub();
      //} catch (subse10y3 e){
      // System.out.println("C");
      // //よりsubでは受けない
      // //よりsupなら読める
    } catch  (supse10y3 e){
      System.out.println("sup");
    } 
    // catch (subse10y3 e){
    //   System.out.println("sub");
    // }
    //error: exception subse10y3 has already been caught
  }

  private static void sup() throws supse10y3{
    throw new supse10y3();
  }

  private static void sub() throws subse10y3{
    throw new subse10y3();
  }
}