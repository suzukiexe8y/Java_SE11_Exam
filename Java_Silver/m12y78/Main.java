



/////method's override
/////field's redefinition, shadowing


//public class C {
class C {

   // Defined as private
   // private void testC() {
   //    System.out.println("Class C");
   // }

   void testC() {
      System.out.println("Class C");
   }

   // protected void testC() {
   //    System.out.println("Class C");
   // }
   //suc


   //
   //

   //private String a12y78 = "a12y78";
   /// err 
// Main.java:46: error: a12y78 has private access in C
//        System.out.println(c.a12y78);
//                            ^
// Main.java:47: error: a12y78 has private access in C
//        System.out.println(d.a12y78);

   String a12y78 = "a12y78_defOvr"; 
   protected String b12y78 = "b12y78_protOvr"; 
   

   protected String fi12y78 = "fi_definition";

   

}

//
//
//

// publict class D extends C{
class D extends C{

  // Defined as public (No override occurs for C class's private method)
  public void testC() {
    System.out.println("Class D");
   }

   ///
   /// 
   //public String fi12y78 = "fi_redifinition";
   
   //public String fi12y78 = "fi_redifinition";
   // >>suc
   String fi12y78 = "fi_redifinition";
   
   


}

public class Main {

    public static void main(String[] args) {
       D d = new D();
        d.testC();  // Calls D class's testC method

       C c = new C();
       c.testC();  // Compilation error (Cannot be called from another class Main because it's private)
       
       System.out.println(c.a12y78);
       System.out.println(d.a12y78);    
       System.out.println(d.b12y78);
    
       System.out.println(c.fi12y78);
       System.out.println(d.fi12y78);
    }

}
