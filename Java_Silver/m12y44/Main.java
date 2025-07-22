//package 12y44;



    class Sample12y44{
      String name;
      int num;

      public Sample12y44(String name, int num){
        this.name = name;
        this.num = num;
      }

      ////myadd
      public Sample12y44(){
      }
    }


    class SubSample12y44 extends Sample12y44{
      int price;
      //public SubSample12y44(int price){
      public SubSample12y44(int price){ 
        //supper() //iptRevJava123
        //add non-argument super constructor
        this.price = price;
      }
      public SubSample12y44(String name, int num, int price){
        //this(price);
        super(name, num);
        //this(price);
        
        // specify this or super
        //err //Main.java:30: error: call to super must be first statement in constructor


        //err//Main.java:30: error: call to this must be first statement in constructor
      }
    }



public class Main {
  public static void main(String[] args) {
    SubSample12y44 s12y44y1 = new SubSample12y44(100);
    SubSample12y44 s12y44y2 = new SubSample12y44("sample", 200, 100);
    System.out.println(s12y44y1.name + "," + s12y44y1.num + "," + s12y44y1.price);
    System.out.println(s12y44y2.name + "," + s12y44y2.num + "," + s12y44y2.price);
    
    //null,0,100
    //sample,200,0


  }
  

     
}
