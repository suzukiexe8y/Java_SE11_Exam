import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


//import m7y5.A7y5;

public class Main{

  
  public static void main(String[] args){




    
///
/// 
///     //start2yy
/////2y --StringJava1234
/// nullJava11234

    System.out.println("\n,,,,2yy,StringNull");    
    String stnu1 = null; 
    String stnu2 = "null"; 
    String stnu3 = "";
    
    System.out.println(stnu1); //null
    System.out.println(stnu2); //null
    System.out.println(stnu3); // 


///
///start4yy controll structure  
/// 

/* 

About [something like [value as a reference]] 
It is OK if you know somewhat about the following two things.

・Specification of System.out.println() 
・Specification of toString() of Object type 
--------------------------------------------- 
When System.out.println(argument) is executed, the toString() method is automatically called.

The type of the argument determines which toString() method is executed.
````yml 
String type → toString() of the String class 
Object type → toString() of the Object class 
Array type → toString() of the Object class 
``` 
toString() of the String class will output as a string, while toString() of the String class toString() is output as a string, but Object class toString() is output in the following format.
````yml 
Class name including package name@hashcode (reference value/identifier of the instance expressed in hexadecimal) 
``` 
This time, [java.lang.String;@63961c42] is output because it was an array type.
--------------------------------------------- 
The behavior changes as follows depending on the argument type.

■ In the case of a home-made class, the type of the home-made class @ hashcode 
```yml 
Person p = new Person(); 
p.setName("Taro"); 
System.out.println(p); // Person@XXXXXXXX 
``` 
■ In the case of an array of String class type@hashcode 
``yml 
String[] nameArr = {"Taro"}; 
System.out.println(nameArr); // java.lang.String;@yyyyyyyyyy 
``` 
■ For an Integer array, Integer class type@ HashCode 
```yml 
Integer[] intArr = {1, 2, 3}; 
System.out.println(intArr); // java.lang.Integer;@zzzzzzzz 
`` 
■ For String, string 
``yml 
String name = "Taro "; 
System.out.println(name); // "Taro" 
``` 
--------------------------------------------- 

Translated with DeepL.com (free version)
 */



    
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

    for(int i = 0; i < 7; i++){
      if(i == 1 || i == 3){
        continue;
      }
      System.out.println( "num4yforcon"+ i);
    }



/////
/// /--5y --arrayJava1234

///13y20
/// array default value
/// Integer 0 
/// Floating point 0.0 
/// Character \u0000 
/// Boolean false 
/// Reference value null
/// /
    //not "compile err", not "exception"
    // >> print out "hash code"
    int[] array5y1 = new int[0];
    System.out.println("array5y1>" + array5y1);

    int[] array5y2 = new int[3];
    Class clazz5y2 = array5y2.getClass();
    System.out.println("clazz5y2>>" + clazz5y2.getCanonicalName() );

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

    
    ////5y5 nullJava1234
    /// When a class file is created in a different file from Main, Add ‘public’. 
    System.out.println("\n,,,5y5");

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

    ////iptrevjava123
    /// オブジェクト型配列のデフォルト値はnull
    System.out.println("\n,,,int_arr");
    int[] a_int1 = new int[3];
    for(int arr : a_int1){
      System.out.println(arr);
    }
    /// 
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
    
///
/// 
//err//    int [3] a5yy2  = new int [2][7][4]; 
// Main.java:258: error: ']' expected
//     int [3] a5yy2  = new int [2][7][4]; 
//          ^
// Main.java:258: error: not a statement   
//     int [3] a5yy2  = new int [2][7][4]; 


    // int a5yh = 2, b5yh = (double)2.04, c5yh = 2; 
   

       
    //
    //12y17
    int[] a13y17ya;
    a13y17ya = new int[]{};

     Double[] a13y17ya5 = {null, 1.0};
     //double[] a13y17ya5y1 = {null, 1.0};

// Main.java:276: error: incompatible types: 
// <null> cannot be converted to double      
//      double[] a13y17ya5y1 = {null, 1.0};
//                              

     System.out.println("5yy13y17");
/*
   Class Sample13y17{
    
   }
    void sample12y17(int... val) {
      // System.out.println(val[1] + val[2] + val[3]);
      if (val.length > 3) {
      System.out.println(val[1] + " " + val[2] + " " + val[3]);
    }
    //cllass instance//new sample12y17(int[]{1, 2, 3});
    sample12y17(1, 2, 3);
 */


// 
    class Sample13y17{

      public void sample13y17(int... val) {
        // System.out.println(val[1] + val[2] + val[3]);
        if (val.length > 1) {
        System.out.println(val[0] + " " + val[1] + " " + val[2]);
        }
      }
      //public void sample13y17y2(int[2][3] val) {
      public void sample13y17y2(int[][] val) {
        // System.out.println(val[1] + val[2] + val[3]);
        System.out.println(val[0][1] + "," + val[1][0]);
      }
    }
    //cllass instance//new sample12y17(int[]{1, 2, 3})
    
    new Sample13y17().sample13y17(1, 2, 3);
    new Sample13y17().sample13y17(new int[]{4,7,9});
 
//    new Sample13y17().sample13y17y2(new int[]{{4,7,9},{2,5,6}});
    System.out.println("13y17y2");
    new Sample13y17().sample13y17y2(new int[][]{{4,7,9},{2,5,6}});

    System.out.println("13y17y1");
    int[] a13y17y1;
    a13y17y1 = new int[]{};
    System.out.println(a13y17y1);

    System.out.println("13yt7y2");
    int[] a13y7y2 = new int[]{2, 3, 4};
    //for(int[] arr: a13y7y2){
    for(int arr: a13y7y2){
      System.out.println(arr);
    }

    System.out.println("13y17y3");
    int[][] a13y17y3 = new int[][]{{1,3},{3,4}};
    for(int[] arr: a13y17y3){
      ///System.out.print(arr + ",");
          System.out.print(arr);
    }

    System.out.println("13y17y4");
    int[][] a13y17y4 = {{1,3},{3,4}};
    for(int[] arr: a13y17y4){
      ///System.out.print(arr + ",");
          System.out.print(arr);
    }
    System.out.println(" ");

    for (int[] arr : a13y17y4) {
        // 各1次元配列を出力
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    System.out.println("[deepToString");
    System.out.println(Arrays.deepToString(a13y17y4));
    System.out.println("]");
    System.out.println("");
    

/* 

puiblivc class

 */

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

///
/// NullJava 5y5
////
/// forNullJava1234  13y17?
/// Error don't occurred 
   System.out.println("");
    System.out.println(",,,,ForNull");
    try{
      //String[] a1nf = {null, "A", "B", "C", ,null};
      // error: illegal start of expression
      String[] a1nf = {null, "A", "B", "C", "" ,null, "null"};
      System.out.println("Extended for");
      for(String str : a1nf){
        System.out.println(str);
      }
      System.out.println("normalFor");
      for(int i = 0; i < a1nf.length; i++){
        System.out.println(a1nf[i]);
      }      
    } catch (Exception e){
      System.out.println("Error_forNull");
    }


///
/// 
/// ///6yy instance  and method
/// 
///localVariJava123
    System.out.println("\n,,,,s6lv1");
    class S6lv1 {
      private int num;
      private int test(){
        for(int i = 0; i < 3; i++){
          num += i;
        }
        return num;
      }
    }
    S6lv1 s6lv1 = new S6lv1();
    int n6lv1 = s6lv1.test();
    s6lv1.test();
    System.out.println(n6lv1); //3
    //err// System.out.println(S6lv1.num);
//  non-static variable num cannot be referenced from a static context

    System.out.println("\n,,,,s6lv2");
    class S6lv2 {
      private static int num;
      private int test(){
        for(int i = 0; i < 3; i++){
          num += i;
        }
        return num;
      }
    }
    S6lv2 s6lv2 = new S6lv2();
    int n6lv2 = s6lv2.test();
    System.out.println(S6lv2.num); //3
    s6lv2.test();
    System.out.println(n6lv2); //3
    System.out.println(S6lv2.num); //6




/// 
////
  ///iptRevJava1234 6y16
  ///  over load
  /// when there is difference of only "return value" about two methods, those are same method  .
  /// If only the “return value” for two methods differs, they are the same method.

    // Main m6y17 = new Main();

    //System.out.println(m5y17.calc5y17y1(2.0,3));

    // private double calc5y17y1(double a, int b){
    //   return( "d_i >>" + (a + b)/2);
    // }
    
    ///
    /////
    class ms6y17{
        
      private String calc6y17(int a, double b){
        return ( "i_d >>" + (a+b)/2);
      }

      private String calc6y17(double a, int b){
        return( "d_i >>" + (a + b)/2);
      }
      
    }

    ms6y17 met6y17 = new ms6y17();
    System.out.println(met6y17.calc6y17(2.0, 1)); 

    ///
    /// --iptRevJava123456
    ///When an instance of the following is created, the number of instances is always one
    //aftJava123
    // Cannot instantiate local class "" in a static content
    //>> solIptRevJava123456
    //not debug by F5, execute javac Main.java, java Main
//    /* 

///
///

    System.out.println(",,,O6y3");

    Object O6y3 = false;
    ///no error at this point
    System.out.println(O6y3);

///
/// /// ///staticJava12345
/// 
    System.out.println("\n,,,6y19 staticJava");
    class Sample6y19 {
      private static Sample6y19 instance = null;
      private Sample6y19(){}

      public static Sample6y19 getInstance(){
        if(instance == null){
          instance = new Sample6y19();
        }
        return instance;
      } 
      
      //delete this instance
      public static void destroyInstance() {
        instance = null;
      }
    }

    Sample6y19 obj1y6y19 = Sample6y19.getInstance();
    System.out.println( obj1y6y19); // >Main$1Sample6y19@4e50df2e //output memory address of the instance 

    Sample6y19.destroyInstance(); // delete instance

    Sample6y19 obj2y6y19 = Sample6y19.getInstance();
    System.out.println( obj2y6y19);//Main$1Sample6y19@1d81eb93

     Sample6y19 obj3y6y19 = obj2y6y19.getInstance();
    System.out.println(obj3y6y19);//Main$1Sample6y19@1d81eb93


    ///staticJava1234
    ///
    System.out.println("\n,,,n6st1");
    class S6st1{
      //int n6st1;
// error: non-static 
// variable n6st1 cannot be referenced from a static context
      static int n6st1;

      private static void test(){
        n6st1++;
        System.out.println(n6st1);
      }
    }
    S6st1.test();//1
    S6st1.test();//2

    ///
    /// 
      System.out.println("\n,,,n6st2");
    class S6st2{
      int n6st2;
      private static void test(){
        //n6st2++;
        //System.out.println(n6st2);
//  error: non-static variable n6st2 cannot be referenced from a static context
//         System.out.println(n6st2)
        int n6st2y2 =+ 1;
        System.out.println(n6st2y2);
      }
    }
    S6st2.test();//1
    S6st2.test();//2
    

    ///
    /// /instanceJava1234
    /// ///premitive int type
  
    int a6st3;
    //System.out.println("a6st3>>"+ a6st3);
    // error: variable a6st3 might not have been initialized
    // System.out.println("a6st3>>"+ a6st3);
    

    //new int a6st4;
    //err

    //int a6st4 = new int;
    //err
  
    // int a6st4;
    // a6st4 = new int;
    //err

    //int a6st4 = new int;
    //err
    
    //System.out.println("a6st4>>" + a6st4);

     
    // int[] a13y17ya;
    // a13y17ya = new int[]{};
    //suc
     


//     */
    
    ///
    ///A private, non-public constructor call
    
    //public class Sample {
    class Sample6y19y2 {
      public Sample6y19y2(){
        this("sample6y19y2");

      }

      private Sample6y19y2(String val){
        System.out.println(val);
      }
    }

    new Sample6y19y2();
    
    new Sample6y19y2("s6y19y2_new");

    ///6y21
    /// ///initializer, constractor
    class Sample6y21{
    
      Sample6y21(){
        System.out.println("A");
      }
      {
        System.out.println("B");
      }
    }
    System.out.println("6y21");
    Sample6y21 s6y21 = new Sample6y21();
    
    
    ///
    ///5y22  --iptRevJava12345
    class Sample6y22{ 
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
      public Sample6y22(){ 
        num = 100;
      }
    }

    System.out.println("6y22_static{} >> " + Sample6y22.num);//0 
    System.out.println("6y22_new_instance>> " + new Sample6y22().num); //100

    class Sample6y22y2{ 
      static int num;
      //default int >> 0
      static{
        //static initializer 
        // initialize class vari(static vari)
        num=77;
      }
      {
        num = 10; 
      }
      public Sample6y22y2(){ 
        num = 100;
      }
    }

   System.out.println("6y22y2_static{}>>" + Sample6y22y2.num);//77
    

    ///
    /// 6y23
    class Sample6y23{
      void Sample6y23(){//method
        System.out.println("A");
      }

      Sample6y23(String str){
        System.out.println(str);
      }
      ///>>require disclibing default constractor, because there is described non-default_constractor.
      public Sample6y23(){ 
        System.out.println("6y23,default constructor");
      }; 
      //err // public Sample6y23();
    
    }

    Sample6y23 s6y23 = new Sample6y23();
    //6y23,default constructor

    //
    ////6y24
    class Sample6y24{ 
      public Sample6y24(){
        this(null, 0);
        //Reduce code duplication and make it easier to maintain
        //from an overloaded constructor.Why use this to call another constructor?
      }
      public Sample6y24(String str, int num){
        System.out.println("6y24");
      }
    }

    Sample6y24 s6y24 = new Sample6y24();//6y24 

   //
   ///6y25
    System.out.println("6y25");

   class Sample6y25{
      public Sample6y25(){
        //System.out.println("A");
        //err ////condtructor call must be the first statement in a constructor. 
        this("B");
        
      }

      public Sample6y25(String str){
        //this();
        /// error: recursive constructor invocation
        System.out.println(str);
      }
    }

    Sample6y25 s6y25 = new Sample6y25();
        
    ///
    ///
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


/////start7yy   classExtends, interface, abstarctClass 
/// 
/// 
//////finalJava
/// ////
/// 定数や継承不可なクラスにする。
////// インターフェイスで定義できるフィールド
/// interfaceを使って動的に値が変更されない
/// staticを使ってインスタンスが生成できなくても使える。
///
/// ///メソッド内のラムダ式がアクセスできる、そのメソッド内のローカル変数 
/// 実質的に"final"なローカル変数
/// ラムダ式内、式外でそのローカル変数を変更してはいけない。
/////
/// final int  num;　のように変数宣言だけした場合は　コンストラクタで初期化しなければならない。
    System.out.println("\n,,,7ce1");
    class Sup7ce1a{
      String num = "numA";
      void test(){
        System.out.println("A");
      }
    }

    class Sub7ce1b extends Sup7ce1a{
      String num = "numB";
      @Override
      void test(){
        System.out.println("B");
      }
    }

    class Sub7ce1c extends Sub7ce1b{
      String num = "numC";
      @Override
      void test(){
        System.out.println("C");
      }
    } 


   Sup7ce1a s7ce1a = new Sub7ce1c();//C
   s7ce1a.test();//numA
   System.out.println(s7ce1a.num);
   
   Sup7ce1a s7ce1b = new Sub7ce1b();
   s7ce1b.test();//B
   System.out.println(s7ce1b.num);//numA
/// 

    //
    // //
    // public interface A7y5 {
    // interface A7y5 {
    
    //   //@Override
    //   default void sample(){
    //     System.out.println("A7y5");
    //   }
    // }

    // //public interface B7y5 extends  A7y5{
    // //public class B7y5 implements A7y5{ 
    // class B7y5 implements A7y5{ 
    //   @Override
    //   public void sample(){
    //     System.out.println("B7y5");
    //   }

    //   @Override
    //     public String toString() {
    //       return "B7y5,toString_OverRide";
    //   }
    // }

    
    // A7y5 a7y5 = new B7y5();
    // System.out.println(a7y5); 
    // //a7y5.sample();

    ////
    /// 

    //
    ////A7y5
    interface A7y5 {
      default void sample() {
          System.out.println("A7y5");
      }
    }

        
    class B7y5 implements A7y5 {

        @Override
        public void sample() {
            System.out.println("B7y5");
        }
    }

    A7y5 a7y5 = new B7y5();
    System.out.print("a7y5.sample()>>");
    a7y5.sample(); // "B7y5"と出力される
    System.out.println("System.out.println >> " + a7y5);


    ///     
    //
    ////
    /// 7y6
    ///
    interface A7y6{
      default void sample(){
        System.out.println("Hello_A7y6");
      }
    }

    class C7y6 implements A7y6{
      @Override
      public void sample(){
        System.out.println("AC7y6");
        A7y6.super.sample();
        System.out.println("Hello_AC7y6");
      }
    }
    A7y6 a7y6 = new C7y6();
    a7y6.sample();

    ///
    interface B7y6 extends A7y6 {

    }
    
    class D7y6 implements B7y6{
      @Override
      public void sample(){
        System.out.println("ABD7y6");
        //A7y6.super.sample();
      }
    }

    A7y6 a7y6y2 = new D7y6();
    a7y6y2.sample();
    //
/*     ////
    interface A7y7{
      default void test(){
        System.out.println("A7y7");
      }
    }
    
    interface B7y7{
      default
    }
 */


///
/// 
//////7y7 
/// Multiple inheritance of multiple classes is not permitted.
//Multiple realisation of multiple interfaces is possible.

    interface A7y7{
      default void test(){
        System.out.println("A7y7");
      }
    }
    interface B7y7{
      default void test(){
        System.out.println("B7y7");
      }
    }
    
    class Mc7y7 implements A7y7,B7y7{
      //new mc7y7().test();
      public void mc7y7(){
        new Mc7y7().test();
      }

      @Override
      public void test(){
        A7y7.super.test();
      }
    }

    new Mc7y7().mc7y7();

    System.out.println("Multiple Realisation Interface,7y7");
    interface C7y7 extends A7y7,B7y7{
      @Override
      default void test(){
        A7y7.super.test();
      }
    }

    class ClassC7y7 implements C7y7{
      public void classC7y7(){
        new ClassC7y7().test();
      }
    }

    new ClassC7y7().classC7y7();


    //
    ///
    class Animal7y{
      public Animal7y(){
        System.out.println("Animal7y");
      }

    }
    class Dog7y extends Animal7y{}
    
    //Dog7y d7y = new Animal7y();
    //err//main.java:770: error: incompatible types: Animal7y cannot be converted to Dog7y
    Animal7y a7y = new Dog7y();

    //
    abstract class Person7y12{
    }
    
     //Comparable 
    ///
    /// 
    ////
    class A7y12{
      String val = "A";
      void print(){
        System.out.println(val);
      }
    }

    class B7y12 extends A7y12{
      String val = "B";
    }
    
    A7y12 a7y12 = new A7y12();
    A7y12 b7y12 = new B7y12();

    System.out.println("a7y12>> " + a7y12.val);
    System.out.println("b7y12>> " + b7y12.val);
    a7y12.print();
    b7y12.print();
    ///A A A A


    class B7y12y2 extends A7y12{
      String val = "B2";
      void print(){
        System.out.println(val);
      }
    }

    A7y12 b7y12y2 = new B7y12y2();
    System.out.println("b7y12y2>> " + b7y12y2.val );//A
    b7y12y2.print();//B2
    
    // Fields call　
    // a.val >> super.val 
    // Method call　
    // a.method() >> sub.method()>> (override )
      
    
    //
    /////
    interface Worker7y13{
      void work();
    }

    class Employee7y13{
      public void work(){
        System.out.println("work7y13");
      }
    }

    class Engineer7y13 extends Employee7y13 implements Worker7y13{}

    Worker7y13 w7y13 = new Engineer7y13();
    w7y13.work(); 
    

    // new mc7y13();
/* 
The bottom subclass can use any implementation of the parent class.
The bottom subclass is the type of the instance.
Which subclass a variable is of determines which implementations, fields and methods it can handle in its instance. 
*/
    System.out.println("7y13y2");

    interface W7y13y2{
      void work(); 
    }

    interface W7y13y2y2{
      default void work(){
        System.out.println("W7y13y2y2");
      }
    }

    class E7y13y2{
      public void work(){
        System.out.println("E7y13y2");
      } 
    }

    
    class Eng7y13y2y1 extends E7y13y2 implements W7y13y2, W7y13y2y2{
      // public void work(){
      //   W7y13y2y2.super.work();
      // }
    }

    class Eng7y13y2y2 extends E7y13y2 implements W7y13y2, W7y13y2y2{
      public void work(){
        W7y13y2y2.super.work();
      }
    }


    W7y13y2 w7y13y2y1 = new Eng7y13y2y1();
    w7y13y2y1.work(); //E7y13y2


    W7y13y2 w7y13y2y2 = new Eng7y13y2y2();
    w7y13y2y2.work(); //W7y13y2

    //w7y13y2.W7y13y2y2.super.work();
// Main.java:882: error: package w7y13y2 does not exist
//     w7y13y2.W7y13y2y2.super.work();
    


///
/// ///
/// 
/* 
 * 

The access modifier for local classes (classes defined within methods) is **default (no modifier)** In Java, local classes cannot have access modifiers such as public, protected or private. This is because the scope of local classes is restricted to within methods.

Reason.
Scope limitation.
Local classes can only be used within the methods in which they are defined. Therefore, there is no need to access them externally and there is no point in attaching access modifiers.

Grammatical restrictions
The Java specification does not allow access modifiers to be specified for local classes defined within methods. This ensures code readability and consistency.

 */
    //public interface Worker7y14{
    interface Worker7y14{
      
      void work();

      //void work(){
      //   System.out.println("work7y14");
      // };
      //error: interface abstract methods cannot have body
    }
    
    //public class Employee7y14 implements Worker7y14{ 
    class Employee7y14 implements Worker7y14{ 
      public void work(){
        System.out.println("work7y13");
      }
      public void report(){
        System.out.println("report7y14");
      }
    }
    
    class Engineer7y14 extends Employee7y14{
      public void create(){
        System.out.println("create future 7y14");
      }
    }
    
    //Worker7y14 a7y14 = new Engneer7y14();
    Employee7y14 b7y14 = new Engineer7y14();
    Engineer7y14 c7y14 = new Engineer7y14();
    //a7y14.create();
    //a7y14.work();
    //error: interface abstract methods cannot have body
    b7y14.work();
    c7y14.report();
    
/*

The access modifier for local classes (classes defined within methods) is **default (no modifier)** In Java, local classes cannot have access modifiers such as public, protected or private. This is because the scope of local classes is restricted to within methods.

Reason.
Scope limitation.
Local classes can only be used within the methods in which they are defined. Therefore, there is no need to access them externally and there is no point in attaching access modifiers.

Grammatical restrictions
The Java specification does not allow access modifiers to be specified for local classes defined within methods. This ensures code readability and consistency.

 */

/* 

What is polymorphism?

Polymorphism is a mechanism that allows an instance that is actually running to be handled with a type that is different from the original type of the instance.

By using the parent interface or class as the type of the variable,
we restricts the fields, methods and other data that can be handled by instances of the child subclasses.

*/

/* 
Interfaces and abstract classes cannot be instantiated.
 */


  //
  ////7y15
    //public interface A7y15 {}
    interface A7y15 {
      //  public A7y15(){
      //   System.out.println("A7y15");
      // }

      //public void A7y15print(){
        // System.out.println("interfaceA7y15");
      //}
      // public void A7y15(){};
      //public void A7y15();
      // An interface is not a class, but a blueprint for defining the behavior (method definitions) of an object.

      // The interface itself cannot be instantiated, so it cannot have a constructor.

      public void A7y15print();

    }

    class B7y15 implements A7y15{
      public B7y15(){
        System.out.println("B7y15");
      }

      //void A7y15print(){
      public void A7y15print(){
        System.out.println("IF_A7y15__ClassB7y15");
      }
    }

    class C7y15 extends B7y15{
      C7y15(){
        System.out.println("C7y15");
      }  
      public void A7y15print(){
        System.out.println("IF_A7y15__ClassC7y15");
      }
    }

    class D7y15{
      D7y15(){
        System.out.println("D7y15");
      }
    }

    A7y15[] array7y15 = {
      new B7y15(),
      new C7y15(),
      //new A7y15(),
      //new D7y15()
      //new B7y15().A7y15print(),

    };
    
    System.out.println("7y15_override");
    //new A7y15().A7y15print();  
    new B7y15().A7y15print();
    new C7y15().A7y15print();

    //
    ////

    
// Upcasting.　
// Treat subclasses with variables of a more superclass type.

// Downcasting.
// Handles superclasses with variables of more subclass types.
// Requires a cast expression.
// B b = (B) a;.

// The compiler can only check
// only the type of the variable.
// instance type is unknown.

    class A7y16{ 

    }

    class B7y16 extends A7y16 {
      void hello(){
        System.out.println("B7y16");
      }
    }

    A7y16 a7y16 = new B7y16();
    B7y16 b7y16 = (B7y16) a7y16;
    b7y16.hello();  

    ///
    ///
    /// 

// Casting only changes the type of the variable and the way the instance is handled, but not the type of the referenced instance.

    class A7y17{
      void hello(){
        System.out.println("A7y17");
      }
    }
    class B7y17 extends A7y17{
      void hello(){
        System.out.println("B7y17");
      }
    }    
    A7y17 a7y17 = new A7y17();
    //B7y17 b7y17 = (B7y17) a7y17;
    //Exception in thread "main" java.lang.ClassCastException: class Main$1A7y17 cannot be cast to class Main$1B7y17 (Main$1A7y17 and Main$1B7y17 are in unnamed module of loader 'app')
        // at Main.main(Main.java:1039)
    //b7y17.hello();    
    a7y17.hello();

 
    A7y17 a7y17y2 = new B7y17();
    //B7y17 b7y17y2 = a7y17;
    //Main.java:1046: error: incompatible types: A7y17 cannot be converted to B7y17

    B7y17 b7y17y3 = (B7y17) a7y17y2;
    b7y17y3.hello();

    ///
    /// If you write a cast expression and do an explicit type conversion, the Compilation succeeds.
    // However, if type equivalence is incompatible, an exception is thrown at runtime.

    //
    ////
// Why not just declare the method in the main class?

// In Java, methods can only be defined within a class; the main method is only the entry point of the program and defining another method within it is not permitted.

// Writing another method within the main method will result in a syntax error (illegal start of expression).
    
    System.out.println("7y18");
    class Sample7y18{
      
     void Sample7y18(){
        int num = 10;
        if(num < 11){
          //int num = 20;
          //Main.java:1070: error: variable num is already defined in method Sample7y18()
          num = 20;
          int value = 100;
          // System.out.println(num, value);
          //System.out.println(num + value);
          System.out.printf("num %d, value %d%n",num , value);
        }
        // int num = 10;
        //Main.java:1078: error: variable num is already defined in method Sample7y18()
        num = 10;
        int value = 200;
        System.out.printf("num %d, value %d%n",num, value);
      }
    }
    
    new Sample7y18().Sample7y18();

    //  void Sample7y18(){
    //     //int num = 10;
    //     if(num < 11){
    //       int num = 20;
    //       int value = 100;
    //       System.out.println(num, value);
    //     }
    //     int num = 10;
    //     int value = 200;
    //     System.out.println("value");
    //   }
 

    class Sample7y18y2{
      int num = 10;
      void test(){
        int num = 20;
        System.out.println("S7y18y2_Class.test() >> " + num);
      }
      Sample7y18y2(){        
        System.out.println("S7y18y2_Class.constructor >> " + num);
        //int num = 1000; //Not reflected.
        //this.num = 70000;
      }
      void Sample7y18y2(){
        System.out.println("S7y18y2_Class.S7y18y2_method>> " + num);
      }
    }

    new Sample7y18y2();
    new Sample7y18y2().test();
    new Sample7y18y2().Sample7y18y2();
    
    //
/* 
The subclass has an instance for each of the multiple classes it has inherited so far, and it is treated as a single instance.

So even if there are fields with the same name, it exists separately in each of the multiple instances and exists as different things.

Access to the field depends on which type of variable the instance is treated as.

In the case of methods, they are overridden by the override function.
 */

    class Parent7y19{
      String name;
      String getName(){
        return this.name;
      }
    }

    class Child7y19 extends Parent7y19{
      String name;
      //public String getName(){
      String getName(){
        return super.name + this.name;
        //return super.name;
      }
    }

    Child7y19 child7y19 = new Child7y19();
    child7y19.name = "sample7y19";
    System.out.println(child7y19.getName());

    //System.out.println(child7y19.super.name);
    System.out.println(child7y19.name);



    
    class A7y20{
      public A7y20(){
        System.out.println("A7y20");
      }
    }

    class B7y20 extends A7y20{
      public B7y20(){
        System.out.println("B7y20");
      }
    }

    A7y20 a7y20 = new B7y20();


    //
    ////8y1
    /* 
In Java, from an interface with multiple methods,
Create a subclass with only some methods.

For interfaces with multiple methods,

Inherit only the methods required by the subinterface. Realise the subinterface in a subclass.

Partial implementation in an abstract class.
Then realise it in a subclass.

Anonymous classes and lambda expressions (for functional interfaces).

These design patterns increase flexibility and code reusability. */

/* 
With lambda expressions,
You can assign the method or code you want to execute to an interface-type variable (functional interface) that has only one method that needs to be implemented.

A functional interface has only one abstract method. */

    
    interface Algorithm8y1{
      void perform(String name);
    }

    class Service8y1{
      private Algorithm8y1 logic;
      public void setLogic(Algorithm8y1 logic){
        this.logic = logic;
      }
      public void doProcess(String name){
        System.out.println("start");
        this.logic.perform(name);
        System.out.println("end");
      }
    }
    Algorithm8y1 algorithm8y1 = (name) -> {
      System.out.println("hello, " + name);
    };
    Service8y1 s8y1 = new Service8y1();
    s8y1.setLogic(algorithm8y1);
    s8y1.doProcess("Lambda8y1");

    //
    ////
/* 
,,.
Anonymous classes, lambda expressions.
,,with curly brackets
Can describe multiple processes.
Requires return to return value.
Anonymous class,,
,,Without curly brackets
Only one process is described.
Omit return to return value. */

    //
    ////8y2 
    interface Function8y2{
      String test(String name);
    }
    Function8y2 f8y2y1 = name -> "hello, " + name;
    Function8y2 f8y2y2 = name -> "helloy2, " + name;
    Function8y2 f8y2y3 = name -> {
      return "helloy3, " + name;
    };
    System.out.println(f8y2y1.test("Lambda8y2y1"));
    System.out.println(f8y2y2.test("Lambda8y2y2"));
    System.out.println(f8y2y3.test("Lambda8y2y3"));
    
    //
    ////
/* A variable with the same name as a local variable declared in a method cannot be used as the argument name of a lambda expression.
 */


// --aftJava1234567

//Should result in a compilation error, but can be executed

    interface Function8y3{
      void test(String val);
    }
    String va18y3 = "A8y3";
    Function8y3 f8y3 = (String val8y3) -> {
      System.out.println(val8y3);
    };

    f8y3.test("B8y3");

    //
    ////
    /// 8y4
/* Only variables that can be treated as effectively FINAL local class variables can be accessed from within a lambda expression.
 */

    int cnt8y4 = 0;
    Runnable r8y4 = () -> {
      //for (cnt8y4 = 0; cnt8y4 < 10; cnt8y4++){
        //System.out.println(cnt8y4++);
      //}
        //err//
// Main.java:1274: error: local variables referenced from a lambda expression must be final or effectively final
      
      //for (int cnt8y4 = 0; cnt8y4 < 10; cnt8y4++){
      //   System.out.println(cnt8y4++);      
      // }
      //Main.java:1278: error: variable cnt8y4 is already defined in method main(String[])

      for(int cnt8y4y2 = 0; cnt8y4y2<10; cnt8y4y2++){
        System.out.println(cnt8y4y2++);
      }

    };
    new Thread(r8y4).start();

    //
    ////
    /// 
    String val8y4y2 = "hello8y4y2";

    Runnable f8y4y2 = () -> { 
      //val8y4y2 = "world8y4y2";
      //err///Main.java:1298: error: local variables referenced from a lambda expression must be final or effectively final
      System.out.println(val8y4y2);
    };
    //f8y4y2.test();
    new Thread(f8y4y2).start();
    
/* 
    Only variables that can be treated as effectively FINAL local class variables can be accessed from within a lambda expression.
     */

    interface Function8y4y3{
      void test();
    }
    
    String val8y4y3 = "Hello8y4y3";
    Function8y4y3 f8y4y3 = () -> {
      //String val8y4y3 = "HelloWorld8y4y3";
      //err//Main.java:1315: error: variable val8y4y3 is already defined in method main(String[]
      System.out.println(val8y4y3);
     };
    //val8y4y3 = "HelloHello8y4y3";
    //err//Main.java:1317: error: local variables referenced from a lambda expression must be final or effectively final

    f8y4y3.test();
    
/* 
Changing the value of a practically FINAL variable, even outside a lambda expression, will result in a compile error.
 */
    //
    ///
    
    /* 
     * 
     *
Functional interface Methods
Consumer<T>, void accept(T)
Accepts an argument and processes it. Does not return a result, argument consumer.

Supplier<T>, T get().
Supplier that receives nothing and returns only the result

Predicate<T>, boolean test(T)
Assertion that receives an argument and evaluates it

Fubnction<T,R>, R apply(T)
A ‘process’ that takes an argument and returns a value of the specified type (R)


     */
    
    

    ///8y5 --iptRevJava12345
    /// 
    /// 
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
    
    class ListPredExe8y5{

      List<Sample8y5> list8y5 = Arrays.asList(
                      new Sample8y5(10),
                      new Sample8y5(20),
                      new Sample8y5(30));
      Predicate<Sample8y5> x = s -> list8y5.contains(s);
    
    public ListPredExe8y5(){
        if(x.test(new Sample8y5(20))){
          System.out.println("OK8Y5");
        }
      } 
    }
    
    new ListPredExe8y5();



/* 
    List<Sample8y5> list8y5 = Arrays.asList(
                     new Sample8y5(10),
                     new Sample8y5(20),
                     new Sample8y5(30));
    Predicate<Sample8y5> x = s -> list8y5.contains(s);
    if(x.test(new Sample8y5(20))){
      System.out.println("OK8Y5");
 */
    
    ////end8yy
    /// 
    /// starty9yy APIJava123
    /// 
  
    ///
    ///  starrty11 moduleJava123
    ///13y22 java.base>> java.lang packcage 
    ///
    /// https://docs.oracle.com/javase/jp/11/docs/api/index.html
 

    //
    ////12y44
    class Sample12y44{
      String name;
      int num;
      public Sample12y44(String name, int num){
        this.name = name;
        this.num = num;
      }
      public Sample12y44(){

      }
    }

    class SubSample12y44 extends Sample12y44{
      int price;
      //public SubSample12y44(int price){
      public SubSample12y44(int price){ 
        this.price = price;
      }
      public SubSample12y44(String name, int num, int price){
        super(name, num);
        //this(price);
      }
    }


    SubSample12y44 s12y44y1 = new SubSample12y44(100);
    SubSample12y44 s12y44y2 = new SubSample12y44("sample", 200, 100);
    System.out.println(s12y44y1.name + "," + s12y44y1.num + "," + s12y44y1.price);
    System.out.println(s12y44y2.name + "," + s12y44y2.num + "," + s12y44y2.price);
    

    //
    ////12y46
    /// a = b * (c(1+c)^n) / (1 + c)^n - 1 )
    /// 
    //a=b*(c*Math.pow(1 + c , n) / (Math.pow(1 + c,n)-1))

    class A12y47{
      double a = 15;
      double b = 23;
      double c = 52;
      double n = 3;
      public A12y47(){
        a=b*(c*Math.pow(1 + c , n) / (Math.pow(1 + c,n)-1));
        System.out.println("A12y46 >>" + a);
      }
    }
    
    new A12y47();

    //
    ///
    System.out.println("12y53");
    
    byte x12y53 = 5, y12y53 = 2;

    float a12y53y1 =  Math.round((float) x12y53/y12y53 *100);
    
    float a12y53y2 =  Math.round((float) x12y53/y12y53 *100) / (float) 100;

    System.out.println(a12y53y1);
    System.out.println(a12y53y2);

    System.out.println(Math.round(3.5));
    System.out.println(Math.round((float)3.5));
    System.out.println((float)Math.round((float)3.5));
    ////iptRevJava1234
    /// 
    
    /// 
    /// 12y55
    /// primitiveJava1234
    int[][] a12y55 = {{1,1}, {2,2}};
  
    short b12y55 = (short) 'A';
    // 'A' >> char type
   
    byte c12y55y1 = 10;
    char c12y55y2 = (char)c12y55y1;

    boolean d12y55y1 = (10 == 10);    
    boolean d12y55y2 = (10 == 15);    
            
    double e12y55d = 1.234;
    float e12y55f = (float) 1.2356;
    
    int f12y55 = 12_234__12;
    
    double f12y55f = 12__12_112f;

    //String g12y55 = (String) ('a'); 
    ////String g12y55 = (String) 'a'; 
    //convert char '' to String .
    //Main.java:1498: error: incompatible types: char cannot be converted to String
    
    String g12y55y2 = "a";
    
    //String g12y55y3 = a;
    //err //Main.java:1503: error: cannot find symbol


    //
    ////
    /// --compileErrorjava1234
// Unreachable code 
// Instances that must not be created

    System.out.println("12y56");
    String[][] array12y56 = {
         {"A", "B"},
         {"C"},
         {"D", "E", "F", "G"},
    };
    for (int i = 0; i<array12y56.length; i++){
      int j = 0;
      for (; j < array12y56[i].length; j++){
        System.out.println("[" + i + "," + j + "] = " + array12y56[i][j]);
      }
    }

    ////
    ///
    interface MyInterface {
    void doSomething();
}
    class MyClass implements MyInterface {
    @Override
    public void doSomething() {
        System.out.println("Doing something...");
        }
    }

        MyInterface instance = new MyClass(); // OK
        instance.doSomething();
    
/* 
,,,12y60  --typeJava123
long > String, Uncastable
int > String , Uncastable
String s4 = (String) (s3 + s2 );
>>
compileEror
,,,,
String str = String.valueOf(num); 
String str = "" + num;   //Empty string concatenation
String str = Integer.toString(num);
//
        String str = String.valueOf(num);
        ArrayList<String> list = new ArrayList<>();
        list.add(str); // Stores numeric values as strings

 */
    
    //
    ////12y61 typeJava1234
    System.out.println("12y61");
    String s12y61y1= new String("Java");
    String s12y61y2 = "Java";
    String s12y61y3 = s12y61y2.intern();
    String s12y61y4 = "Java";

    System.out.println(s12y61y1 == s12y61y2);
    System.out.println(s12y61y2 == s12y61y3);
    System.out.println(s12y61y3 == s12y61y1);
    System.out.println(s12y61y4 == s12y61y3);

    //
    ////12y63
    System.out.println("12y63");
    int x12y63;
    //comppileEror,, Main.java:1586: error: variable x12y63 might not have been initialized
    // System.out.println(x12y63 + "," + y12y63);

    //int x12y63 = 0;
    int y12y63 = 3;
    if(y12y63 > 2){
      x12y63 = ++y12y63;
      y12y63 = x12y63 + 5;
    } else {
      x12y63 = 0; //myadd //compileError unreachableCode
      y12y63++;
    }
    System.out.println(x12y63 + "," + y12y63);

     //
     /////12y69
      List<String> list12y69 = new ArrayList<>();
    //  while(true){
    //    list12y69.add("12y69hello");
    //  //notCompileError
    //  }
    //Exception thrown at runtime


    // 12y71
    String[][] array12y71 = new String[2][2];
    array12y71[0][0] = "a";
    array12y71[0][1] = "b";
    array12y71[1][0] = "c";
    array12y71[1][1] = "d";

    // for(String a : array12y71 ){
    //   for(String b : array12y71){
    //     System.out.println(b);
    //   }
    // }

      

  }
}
