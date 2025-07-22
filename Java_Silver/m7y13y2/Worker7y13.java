//package m7y13y2;
 
interface Worker7y13{
  void work();
}


class Engineer7y13 extends Employee7y13 implements Worker7y13 {
   Engineer7y13() {
   }
}

class Employee7y13{
  public void work(){
    System.out.println("work7y13");
  }
}


