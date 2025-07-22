import java.util.Arrays;

public class Main{

  
  public static void main(String[] args){
    //int array4y9[][] = new int[][] {{1,2},  {2, 3, 4}};
    

    ///
    int array4y9[][] = new int[][] {
    {1, 2}, 
    {2, 3, 4} 
    };

    //err 
    //int array4y9y2[][][] = new int[][][] {{1,2},  {2, 3, 4}, {7, 8}};
    int array4y9y2[][][] = new int[][][] {
      { {1,2}}, 
      { {2, 3, 4} }, 
      { {7, 8} }
    };
    
    int array4y9y2y2[][][] = new int[][][] {{{1,2}},  {{2, 3, 4}}, {{7, 8}}};

    int array4y9y3[][][] = new int[][][] {
      { {1,2}, {3,1}}, 
      { {2, 3, 4} }, 
      { {7, 8}, {1, 1}, {2, 5} }
    };

    System.out.println(array4y9.length);    System.out.println(array4y9y2.length);
    System.out.println(array4y9y3.length);
    System.out.println("4y9y3[2] >> "+ array4y9y3[2].length);


    
    int n4yy = 777;
    for(;n4yy <=777 ; n4yy++)
    {
      System.out.println("n4yy>>" + n4yy);
    }


    String[][] array4y11 = {{"A", "B", "C"}};
    for(Object obj:array4y11){
      System.out.println("array4y11>>" + obj); 
    }

//////array4y11>>[Ljava.lang.String;@63961c42

    String[] array4y11y2 = {"A", "B", "C"};
    for(Object obj:array4y11y2){
      System.out.println("array4y11y2>>" + obj); 
    }


   


    String[] array4y14 = { "A", "B"};
    for(String a : array4y14){
      for(String b : array4y14){
        if("B".equals(b))
          break;
        System.out.print("array4y14>>" + b + "\n");
      }
    }
    

    int num4yforbre = 0;
    while (true){
      num4yforbre++;
      if(num4yforbre == 4){
         break;
      }
      System.out.println("num4yforbre" + num4yforbre);
    }

    for(int i = 0; i < 5; i++){
      if(i == 1){
        continue;
      }
      System.out.println( "num4yforcon"+ i);
    }


    //not "compile err", not "exception"
    // >> print out "hash code"
    int[] array5y1 = new int[0];
    System.out.println("array5y1>" + array5y1);

    int[] array5y2 = new int[3];
    Class clazz5y2 = array5y2.getClass();
    System.out.println("5y2>>" + clazz5y2.getCanonicalName() );

    ////--iptRevJava 5y3
    
    /////
    //ok
    int array5y3y1;
    //err>> int array5y3y2[2];
    //Main.java:99: error: ']' expected
    //error: compilation failed
    //Since the number of elements cannot be specified, we expected]


    ////--revIptJava1234
    int array5y4[][] = new int[3][];
    array5y4[0] = new int[7];
    array5y4[1] = new int[2];
    array5y4[2] = new int[4];

    for (int i = 0; i < array5y4.length; i++) {
      System.out.print("array5y4行 " + i + ": ");
      //System.out.println("array5y4行 " + i + ": ");
      for (int j = 0; j < array5y4[i].length; j++) {
          System.out.print(array5y4[i][j] + " ");
      }
    System.out.println();
    }


    ////
    int[][] jaggedArray5yy = {
        {1, 2, 3},
        {4, 5},
        {6, 7, 8, 9}
    };

    System.out.println("jArr5yy>" + jaggedArray5yy[2][3]);

    for (int i = 0; i < jaggedArray5yy.length; i++) {
      System.out.print("jagArr5yy行 " + i + ": ");
      //System.out.println("jagArr5yy行 " + i + ": ");
      for (int j = 0; j < jaggedArray5yy[i].length; j++) {
          System.out.print(jaggedArray5yy[i][j] + " ");
      }
    System.out.println();
    }

    
    ////5y5
    /// When a class file is created in a different file from Main, Add ‘public’. 
    //public class Item5y5 {
    class Item5y5 {
      String name;
      int price = 100;
    }
    
    Item5y5[] items5y5 = new Item5y5[3];
    int total5y5 = 0;
    for (int i = 0; i < items5y5.length; i++){
      //total5y5 += items5y5[i].price;
    }
    
    //System.out.println("total5y5>>" + total5y5); 
    //fail exception System.out.println(total);
    //Exception in thread "main" java.lang.NullPointerException: Cannot read field "price" because "<local16>[<local18>]" is null        at Main.main(Main.java:153)


    ////
    class Item5y5y2 {
      String name;
      int price = 100;
    }

    Item5y5y2[] items5y5y2 = new Item5y5y2[3];

    // initialize each elements
    for (int i = 0; i < items5y5y2.length; i++) {
        items5y5y2[i] = new Item5y5y2(); // --iptRevJava1234    
    }

    int total5y5y2 = 0;
    for (int i = 0; i < items5y5y2.length; i++) {
        total5y5y2 += items5y5y2[i].price;
    }

    System.out.println("total5y5y2>>" + total5y5y2); 
    

    ////
    ///5y7
    
    
    int[] a5y7y1 = new int []{};
    int[][]a5y7y2 = new int[][]{};
    
    //err //type mismatch.  require to convert to int[][].
    //int[][]ay5y7y3 = new int[]{};
   


    int[][]ay5y7y4 = {{},{}};
    int[][]ay5y7y5 = {};

    int[][] e5y4y1 = new int[2][5];
    int[][] e5y4y2 = new int[2][];

    // int[][] f5y4y3 = new int[][3];
    //err //Main.java:195: error: ']' expected
    //The number of elements in the first dimension cannot be omitted.    

    int[]ey5y7y5 = new int[]{2,3};

    //int[]ey5y7y5y2 = new int[][]{2,3};  
    //err requireconvert to int[]    
    
    int[][]ey5y7y5y3 = new int[][]{{2,3},{1,3,5}}; 
    
    //int[][]ey5y7y5y4 = new int[2]{{2,3},{1,3,5}}; 
    //err // Cannot define dimension expressions when an array initializer is provided

    //int[]ey5y7y5 = new int[2]{2,3};
    //err
    //Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
    //Cannot define dimension expressions when an array initializer is provided      at Main.main(Main.java:187)

    
    ////err // 
    //int b[2];
    //int[3] array;
    ///Main.java:184: error: ']' expected
    //When declaring a variable of array type, the number of elements cannot be specified.
        
    
    int []a5y7y5;   
    a5y7y5 = new int[]{2,3};

    int[][] a5y7y6;
    a5y7y6 = new int[][]{};
    
    int [][] a5y7y7;
    a5y7y7 = new int[][]{{1,2}, {1,3,7}};

    //err //specify number of demensions by "[]". 
    //a5y7y6 = new int{};
    
    //err //Initialisers can only be used at the same time as the variable declaration.
    //int e[];
    //e={2,3};
    //Exception in thread "main" java.lang.Error: Unresolved compilation problem: mp_1013f674\x5cbin' Array constants can only be used in initializers

    
    int[][][] a5yy1 = new int[2][1][4];
    //int[][][] a5yy2 = new int[2][1][4]{};
    //err // new int [num]{} >>fail
    

    ////5y8
    //String[][] array5y8 = {{"A", "B"}, null, {"C", "D", "E"}};
    //NullPointerException
    String[][] array5y8 = {{"A", "B"}, {}, {"C", "D", "E"}};
    int total5y8 = 0;
    for (String[] tmp : array5y8){
      total5y8 += tmp.length;
    } 
    System.out.println("total5y8>>" + total5y8);


    ////5y9
    /// 

    /// 
    Object[] obj5y9yy = {"A", "B", "C"};
    /// When there is an inheritance relationship, a set of instances of a subclass can be assigned to an array-type variable of a superclass type.

    System.out.print("obj5y9yy>>");
    for (int i = 0; i < obj5y9yy.length; i++){
      System.out.print(obj5y9yy[i]);
    }
    System.out.println();
    
    ////
    /// 
    interface A5y9yy2 {}
    class B5y9yy2 implements A5y9yy2 {}
    A5y9yy2[] array5y9yy2 = new B5y9yy2[]{ new B5y9yy2(), new B5y9yy2()};


    ////
    //public interface A5y9{}
    interface A5y9 {}
    abstract class B5y9 implements A5y9 {}
    class C5y9 extends B5y9 {}
    class D5y9 extends C5y9 {}

    A5y9[] array5y9 = {
      new C5y9(),
      null, 
      new D5y9() 
    };

    /*     
    A5y9[] array5y9y1y2 = {
      new C5y9(), 
      null, 
      new D5y9() , 
      new B5y9() 
    }; 
    */
    //err //Cannot instantiate the type B5y9 //class B5y9 is abstract class.
    //java.lang.Error: Unresolved compilation problem: d409b3cde3e7db9aCannot instantiate the type B5y9  

    Object[] objArray5y9 = array5y9;


    ///
    /// 
    /* A5y9[] array5y9y2 = new B5y9[]{
     new B5y9(), 
     new B5y9() };

     Object[] objArray5y9y2 = array5y9y2;
     */
    //err // Cannot instantiate the type B5y9 
    //Instance creation by new B5y9() is not possible because B5y9 is an abstract class

    /////
    /* 
    A5y9[] array5y9y3 = new D5y9[]{
      (D5y9) new C5y9(),
      null,
      new D5y9()
    }; 
    */
    ///failExcep //java.lang.ClassCastException: class Main$1C5y9 cannot be  ,cast to class Main$1D5y9 
    /// even with explicit type conversion, C5y9 class cannot be cast to D5y9 class


    ////
    ////5y10
    int[][] arrayA5y10 = {{1,2}, {1,2}, {1,2,3}};
    int[][] arrayB5y10 = arrayA5y10.clone();
    System.out.println("5y10");
    System.out.println("== >> " + (arrayA5y10 == arrayB5y10)); 
    //false
    //err //System.out.println(arrayA5y10[] == arrayB5y10[]);

    System.out.println("Array.deepEquals>>  " + Arrays.deepEquals(arrayA5y10, arrayB5y10));
    //true

    int total5y10 = 0;
    for(int[] tmp : arrayB5y10){
      for(int val : tmp){
        total5y10 += val;
      }
      System.out.print(total5y10 + ",");
    }
    System.out.println();


    ///more perfect deep copy
    /* 
    int[][] arrayB5y10 = new int[arrayA5y10.length][];
    for (int i = 0; i < arrayA5y10.length; i++) {
        arrayB5y10[i] = arrayA5y10[i].clone();
    }
    */
    

    //5y10
    class Sample5y10{
      private String value;
      public void setValue(String value){
        this.value = value;
      }
      public String getValue(){
        return this.value;
      }
    }
    Sample5y10 s5y10 = new Sample5y10();
    
    //String val5y10 = s5y10.setValue("hello");
    //err  //Type mismatch cannot convert from void to Sample5y10


    //Sample5y10 val5y10 = s5y10.setValue("hello");
    //err //Type mismatch cannot convert from void to Sample5y10

    Sample5y10 val5y10 = s5y10;

    //Sample5y10 val5y10 = s5y10.setValue("hello");
    s5y10.getValue();
    System.out.println("val5y10 >> " + val5y10);
    //val5y10 >> Main$1Sample5y10@3e3abc88
/* 
val5y10 >> Main$1Sample5y10@3e3abc88 の val5y10 は Main$1Sample5y10 クラスのインスタンス

$1 という記号は Main クラスの内部クラスや匿名クラスを示している可能性が高い

@3e3abc88 は hashCode() の16進数表現

toString() をオーバーライドすれば、出力の形式を変更できる

もし val5y10 の具体的なクラス定義が分かれば、さらに詳しい解説ができます！
 */

  ///iptRevJava1234 5y16
  ///  over load
  /// when there is difference of only "return value" about two methods, those are same method  .
  /// If only the “return value” for two methods differs, they are the same method.

    // Main m5y17 = new Main();

    //System.out.println(m5y17.calc5y17y1(2.0,3));

    // private double calc5y17y1(double a, int b){
    //   return( "d_i >>" + (a + b)/2);
    // }
    
    ///
    /////
    class ms5y17{
        
      private String calc5y17(int a, double b){
        return ( "i_d >>" + (a+b)/2);
      }

      private String calc5y17(double a, int b){
        return( "d_i >>" + (a + b)/2);
      }
      
    }

    ms5y17 met5y17 = new ms5y17();
    System.out.println(met5y17.calc5y17(2.0, 1)); 

    ///
    /// --iptRevJava123456
    ///When an instance of the following is created, the number of instances is always one
    //aftJava123
    // Cannot instantiate local class "" in a static content
    //>> solIptRevJava123456
    //F5でデバッグせずに、javac Main.java, java Main
//    /* 
    class Sample5y19 {
      private static Sample5y19 instance = null;
      private Sample5y19(){}

      public static Sample5y19 getInstance(){
        if(instance == null){
          instance = new Sample5y19();
        }
        return instance;
      } 
      
      //delete this instance
      public static void destroyInstance() {
        instance = null;
      }
    }

    Sample5y19 obj1y5y19 = Sample5y19.getInstance();
    System.out.println("obj1y5y19>>" + obj1y5y19); // インスタンスのメモリアドレスを表示

    Sample5y19.destroyInstance(); // インスタンスを破棄

    Sample5y19 obj2y5y19 = Sample5y19.getInstance();
    System.out.println("obj2y5y19>>" + obj2y5y19);
//     */
    
    ///
    ///A private, non-public constructor call
    
    //public class Sample {
    class Sample5y19y2 {
      public Sample5y19y2(){
        this("sample5y19y2");

      }

      private Sample5y19y2(String val){
        System.out.println(val);
      }
    }

    new Sample5y19y2();
    
    new Sample5y19y2("s5y19y2_new");

    ///5y21
    /// ///initializer, constractor
    class Sample5y21{
    
      Sample5y21(){
        System.out.println("A");
      }
      {
        System.out.println("B");
      }
    }
    System.out.println("5y21");
    Sample5y21 s5y21 = new Sample5y21();
    
    
    ///
    ///5y22  --iptRevJava12345
    class Sample5y22{ 
      static int num;
      //default int >> 0
      static{
        //static initializer 
        // initialize class vari(static vari)
        // num=77;
      }
      {
        num = 10; 
      }
      public Sample5y22(){ 
        num = 100;
      }
    }

    System.out.println("5y22 >> " + Sample5y22.num);
    

    ///
    /// 5y23
    class Sample5y23{
      void Sample5y23(){//method
        System.out.println("A");
      }

      Sample5y23(String str){
        System.out.println(str);
      }
      ///>>require disclibing default constractor, because there is described non-default_constractor.
      public Sample5y23(){ 
        System.out.println("5y23,default constructor");
      };
      //err // public Sample5y23();
    
    }

    Sample5y23 s5y23 = new Sample5y23();


    //
    ////5y24
    class Sample5y24{ 
      public Sample5y24(){
        this(null, 0);
        //Reduce code duplication and make it easier to maintain
        //from an overloaded constructor.Why use this to call another constructor?
      }
      public Sample5y24(String str, int num){
        System.out.println("5y24");
      }
    }

    Sample5y24 s5y24 = new Sample5y24(); 

   //
   ///5y25
    System.out.println("5y25");

   class Sample5y25{
      public Sample5y25(){
        //System.out.println("A");
        this("B");

        //condtructor call must be the first statement in a constructor. 
      }

      public Sample5y25(String str){
        //this();
        System.out.println(str);
      }
    }

    Sample5y25 s5y25 = new Sample5y25();
    
    ///
    ///5y26 >>6y26
    /// 
    /* 
    package ex26

public class parent{
  int num = 10;
}

--
package other;
import ex26.parent;

public class Child extends Parent{
  public static void main(String[] args){
    System.out.println(num);
  }
} 

--
--

--iptRevJava123456
    
     */

/*  --iptRev --6y30--w1vari
,,,

 */


    //
    ////
    // public interface A7y5 {
    //   default void sample(){
    //     System.out.println("A7y5");
    //   }
    // }

    // //public interface B7y5 extends  A7y5{
    // public class B7y5 implements A7y5{ 
    //   @Override
    //   default void sample(){
    //     System.out.println("B7y5");
    //   }
    // }

    
    // A7y5 a7y5 = new B7y5();
    // System.out.println(a7y5); 
    
    ////
    /// 
    abstract class Person7y12{

    }


/*     
A variable with the same name as a local variable declared in a method cannot be used as the argument name of a lambda expression.
 */
    
    Stru

  }
}