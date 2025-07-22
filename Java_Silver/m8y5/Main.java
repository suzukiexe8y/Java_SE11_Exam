//package m8y5;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Predicate;
import java.util.function.*;


public class Main {
  public static void main(String[] args){



    List<Sample8y5> list8y5 = Arrays.asList(
                     new Sample8y5(10),
                     new Sample8y5(20),
                     new Sample8y5(30));
    Predicate<Sample8y5> x = s -> list8y5.contains(s);
    if(x.test(new Sample8y5(20))){
      System.out.println("OK8Y5");
    }
    
  } 
}

class Sample8y5{
  private int num;
  public Sample8y5(int num){
    this.num = num;
  }  
  public boolean equals(Object obj){
    if (obj instanceof Sample8y5 == false){
      return false;
    }
    if(this.num == ((Sample8y5) obj).num){
      return true;
    }
    return false;
  }
}
