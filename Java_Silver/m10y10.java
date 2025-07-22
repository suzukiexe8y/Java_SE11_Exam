
//また以下のjavaコードの問題点教えて。エラーを解決して


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main_q 
{
  public static void main(String[] args) {

////
/// 

   
    //Class M10y10 
    class m10y10 
    { 
      static public void mm10y10()
      {
        try(FileInputStream is  = new FileInputStream("sample.txt"))
        {   
        //throw new FileNotFoundException();
        //あっても出力はA B
        }
        catch(Exception e)
        {
          System.out.println("A");
        }
        finally
        {
          // if(is != null)
          // {
          //   is.close();
          // }
           System.out.println("B");
        }
      }
    }
    
    new m10y10().mm10y10();

///
/// 

  }
}
