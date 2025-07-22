

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import javax.management.RuntimeErrorException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//import m10y3.sse10y3;
//import m7y5.A7y5;


public class Main{

  
  public static void main(String[] args){

///
/// 
/* 

--instanceJava123
--staticJava1234567
--overloadJava123
--overrideJava123
--arrayJava123
--JavaJava123
--localVariJava123
--classJava123
--lambdaJava12345
--exceptionJava12344566

 */    
///
/// about:blank#blocked
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
/// C:\xampp\htdocs\_344htdocs_xampp_GA1y1\_Projects\555Java\Java_Silver_Examp\Main.java

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


    ///
    /// ///arrayJava12345
    /// 
    
    //
    int[] array10y1 = {};
    System.out.println(",,,array10y1" + array10y1);
//I@372f7a8
//  array10y1[0] = 10;
    //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
    

    //int array4y9[][] = new int[][] {{1,2},  {2, 3, 4}};
    //error

    ///
    int array4y9[][] = new int[][] {
    {1, 2}, 
    {2, 3, 4} 
    };

    //err 
    //int array4y9y2y1[][][] = new int[][][] {{1,2},  {2, 3, 4}, {7, 8}};
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
/// ///premitiveJava1234
/// instanceJava1234

    /// /instanceJava1234
    /// ///premitive int type
    
    System.out.println("\n,,,instanceJava");
  
    int a6st3;
    //System.out.println("a6st3>>"+ a6st3);
    // error: variable a6st3 might not have been initialized
    // System.out.println("a6st3>>"+ a6st3);
    

    //new int a6st4;
    //err

    // int a6st4 = new int;
    //err error: '[' expected
  
    // int a6st4;
    // a6st4 = new int;
    //err

    //int a6st4 = new int;
    //err

    //System.out.println("a6st4>>" + a6st4);
    
    // int a6st4 = new int[];
    // error: array dimension missing

    // int a6st4 = new int[]{};
    //error: incompatible types: int[] cannot be converted to int 

    //varはlocalVari, tryWithResources_localVari ,ExtendedFor, Forで使える
    
/* polyJava12345
 * 
サブクラスの変数にスーパークラスのインスタンスを代入する → 不可（コンパイルエラーまたは実行時エラー）

スーパークラスの変数にサブクラスのインスタンスを代入する → 可能（アップキャスト、ポリモーフィズムの基本）

1,スーパークラス型の変数にはサブクラスのインスタンスを代入できる（アップキャスト）

2	変数の型が親クラスの場合、親クラスに定義されていないメソッドにはアクセスできない（※オーバーライドはされる）

3	子クラス独自のメソッドを使いたい場合はダウンキャストが必要

,,,ダウンキャスト
Animal mydog = new Dog(); 
((Dog) mydog).dogrun();


Javaにおけるダウンキャスト (Downcasting) は、スーパークラスの参照型変数に格納されているオブジェクトが、実際には特定のサブクラスのインスタンスである場合に、そのサブクラス型に明示的に型を変換することを指します。

ダウンキャストの必要性
ダウンキャストが必要になるのは、ポリモーフィズムによってスーパークラスの参照型変数として扱われているオブジェクトを、サブクラス特有のメソッドやフィールドで操作したい場合です。

 */

//
////
/// 
    System.out.println("\n,,,,,,localVariyylv1");


    for (var i = 0; i < 10; i++) {
      System.out.println(i);
    }
////
    List<String> list_lv1 = List.of("A", "B", "C");
    for (var item : list_lv1) {
        System.out.println(item);
    }

///
        // try-with-resources文内でvarを使用
    try (var reader = new BufferedReader(new FileReader("example.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    
//
////

    int var = 5;
    System.out.println("\n,,,,var>" + var);

    int[] a13y17ya2;
    a13y17ya2 = new int[]{};
    System.out.println(a13y17ya2);
    //suc //[I@548c4f57

    System.out.println("\n,,,,instanceJava");
    int prem1y1;
    //System.out.println(prem1y1);
    //error: variable prem1y1 might not have been initialized  

    int arr1y1[];
    //System.out.println(arr1y1);
    //error: variable arr1y1 might not have been initialized

    Integer objInte1;
    //System.out.println(objInte1);
    //error: variable objInte1 might not have been initialized
    

/////
/// /--5yy --arrayJava1234

///13y20    defaultinstanceJava123456
/// premitive, array, default value
/// Integer 0 
/// Floating point 0.0 
/// Character \u0000 
/// Boolean false 
/// Reference value null
/// /
/// 

////
//////arrayJava1234  instanceJava1234
    System.out.println("\n,,,,13y33");
    class S13y33{
      public void test(Object[] val){
        System.out.println("A");
      }
      public void test(long[] val){
        System.out.println("B");
      }
      public void test(Object val){
        System.out.println("C");
      }
    } 
    new S13y33().test(new int[3]);//C
    new S13y33().test(new float[3]);//C
    new S13y33().test(new Integer[3]);//A
    new S13y33().test(new Float[3]);//A

    // new S13y33().test(new Float[]{1, 3, 4});
    // Float F13y34 = Float[];
    //error: '.class' expected

    System.out.println("\n,,,,classy1");
    Class<?> classy1 = Float[].class;
    System.out.println(classy1); 
    // class [Ljava.lang.Float;

///
/// 

    /// --instanceJava1234567
    System.out.println("10y11");
    String n10y11;
    //error: variable name10y11 might not have been initialized
    n10y11 = null;

    class m10y11{
      public static void mm10y11(String name){
        if(name == null){
          System.out.println("null");
        } else if("".equals(name)){
          System.out.println("kara");
        }
      }
    }
    
    // new m10y11(n10y11).mm10y11();
    new m10y11().mm10y11(n10y11);

    ///
    System.out.println(",,,,10y11,,sys");
    // name10y11 == null;
    System.out.println(n10y11 == null);    //true

    ///
    /// 

    String[] n10y11y2; 
    // error: variable n10y11y2 might not have been initialized
    
    //n10y11y2 = {};
    //  error: illegal start of expression  
    // n10y11y2 = new String[];
    // error: array  dimension missing
    n10y11y2 = new String[4];

    System.out.println(n10y11y2);
    System.out.println(n10y11y2 == null);
    //System.out.println(n10y11y2 == "");
    //  error: incomparable types: String[] and String
    System.out.println("".equals(n10y11y2));

// [Ljava.lang.String;@3d71d552 
// false
// false
    ////
    String[] n10y11y2y2 = {};
    System.out.println(n10y11y2y2);
//[Ljava.lang.String;@1cf4f579  


    // ////aftjava123
     // bool 10y11a = nam
    // System.out.println((name == null)); 

    // System.out.println(("".equals()name));


///endBdrInstanceJava1234
//
////staicJava123
///13y52 staticjavaは　インスタンスへの参照を示すthisを使えない。

///
/////
    //not "compile err", not "exception"
    // >> print out "hash code"
    int[] array5y1 = new int[0];
   System.out.println("array5y1>" + array5y1);
   //array5y1>[I@816f27d

    int[] array5y2 = new int[3];
    Class clazz5y2 = array5y2.getClass();
    System.out.println("clazz5y2>>" + clazz5y2.getCanonicalName() );
    // clazz5y2>>int[]

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
    A5y9yy2[] array5y9yy2 = new B5y9yy2[]{ new B5y9yy2(), new B5y9yy2()};//suc


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
///localVariJava123456
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
    
    //localVariJava123
    ////ローカル変数とラムダ式で宣言している変数名が重複したらコンパイルエラー

   ////
   /// 
   

    // private static void test13y37(String str){
    //   System.out.println(str);
    // }

    // static void test13y37(String str){
    //   System.out.println(str);
    // }

    String str13y37;
    //test13y37(str13y37);

    /* classJava123456 
以下の問題点教えて
public class Main{
  public static void main(String[] args){
    private static void test13y37(String str){
      System.out.println(str);
    }
    String str13y37;
    test13y37(str13y37);
  }
}
>>
Javaではメソッドの入れ子定義（メソッドの中にメソッド）はできません。？？
staticやprivateなどの修飾子はクラス直下で使います。
mainから同じクラス内のprivate staticメソッドは呼び出せます。

     */

  ///localVari123456
  /// 初期化されてないローカル変数の参照＞＞　コンパイルエラー
  /// 初期化されてないフィールドの参章＞デフォルト値
  /// 
  System.out.println("\n,,,,,13y78");
  // static int num13y78;
  //error: illegal start  of expression
  // System.out.println(num13y78);


   ////
   /// --localvariJava12345
/*     class lc2y1{
      private class c1{
        static public void c1m1(){
          
          //private void c1m2(){}
          // illegal start of expression  

          //void c1m3(){}
          //error

          //static void c1m4(){}
          // illegal start of expression  
          

          ///
          /// 
          //private class c2{}
          // error: illegal start of expression 

          class c2y2{}
//localvarijava12345678
//メソッド直下のローカルクラスにはアクセス修飾子付けられない.
//メソッドの直下にメソッド作れない。

          //protected class c2y3{}
          //error: illegal start of expression  

          //public class c2y4{}
          ///error: illegal start of expression    
          /// 
          class c2y5{
            static public void c2m1(){
              System.out.println("c2y5");
            } 

            private class c3y1{}
          }
        }
      }
    }

  //lc2y1().c1m1().c2y5().c2m1();
  //error :cannnot find symbol
    new lc2y1().c1m1().c2y5().c2m1();
// error: cannot find symbol
    lc2y1.c1m1().c2y5.c2m1();
//error: cannot find symbol
     */
    
  //  error: illegal start of expression 

/// 
////
  ///iptRevJava1234 6y16
  ///overloadJava123
  /// when there is difference of only "return value" about two methods, those are same method  .
  ///

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
      ///>>require disclibing default constractor, because there is not described default_constractor.
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
/// interfaceJava1234
/// インターフェイスで定義される抽象メソッドは暗黙的にpublicで定義される。
/// 
//////finalJava
/// ////
/// 定数や継承不可なクラスにする。
///
//////247インターフェイスで定義できるフィールド
/// finalを使って動的に値が変更されない
/// staticを使ってインスタンスが生成できなくても使える。
///
/// ///583
/// インターフェイスに定義する抽象メソッドをfinalで定義できない　///抽象メソッドはオーバーライドされて実装されるから。
/// 
/// ///292 メソッド内のラムダ式がアクセスできる、そのメソッド内のローカル変数 
/// 実質的に"final"なローカル変数
/// ラムダ式内、式外でそのローカル変数を変更してはいけない。
/////
//567  final int  num;　のように変数宣言だけした場合は　コンストラクタで初期化しなければならない。
///
/// ///583
/// 
/// 13y289 //finalJava12344
    
    class S13flv29{
      private final int num;
      public S13flv29(String str){
        this(Integer.parseInt(str));
      }
      public S13flv29(int num){
        this.num = num;
      }

      ///public S13flv29(){      }
      //error: variable num might not have been initialized 
      
      //public S13flv29(double dnum){}
      //error: variable num might not have been initialized 
      
      public S13flv29(){
        //num = null ;
        //error: incompatible types: <null> cannot be converted to int
        // num = (float)4.08;
        // error: incompatible types: possible lossy conversion from float to int
        num = (int)4.095F;
        double num2 = (double)num;
      }
      
      public int getNum(){
        return this.num;
      }
    }

/// 
/// 
/// 
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



//////start8yy lambda
/// 
/// 13y36
    
    System.out.println("\n,,,13y36");

    final String v13y36 = "Hello, Lambda";
    
    //  Consumer<String> f13y36 = (v13y36) -> System.out.println(v13y36);
    //error: variable v13y36 is already defined in method main(String[])  
    
    Consumer<String> f13y36 = (v) -> System.out.println(v);

    f13y36.accept("Hello, Java");
    //Hello, Java

    //localVariJava123
    ////ローカル変数とラムダ式で宣言している変数名が重複したらコンパイルエラー

///
/// 
   ////lambdaJava123456
   ///13y76
   System.out.println("\n......13y76");
   Function<String, String> f13y76 = String::toUpperCase;
   System.err.println(f13y76.apply("hello")); 
    
    Function<String, String> f13y76y2 = x -> x.toUpperCase();
    System.out.println(f13y76y2.apply("hello13y76y2"));


/// 
    

/// 
/// 
    //
    ////8y1
/* 
 * 
8y1
インターフェイスA型　変数　
＝　Aの抽象メソッドをオーバーライドして実現するメソッド

Aを継承せずともAのメンバを使用するクラスBのインスタンスB.Aのメソッドを含むBのメソッド(Aのインスタンス)



yy8y4
Function<args, return>
　
 */
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
    //String val8y3 = "A8y3";
    //error: variable val8y3 is already defined in method main(String[])
    Function8y3 f8y3 = (String val8y3) -> {
      System.out.println(val8y3);
    };

    f8y3.test("B8y3");

    //
    ////
    /// 8y4
/* Only variables that can be treated as effectively FINAL local class variables can be accessed from within a lambda expression.
 */

    // int c8y4 = 0;
    Runnable rr8y4 = () -> {
      // for(c8y4 = 0; c8y4<10; c8y4++)
      for(int c8y4 = 0; c8y4<10; c8y4++){
        System.out.println(c8y4++);
      }
    };

    new Thread(rr8y4).start();

    int c8y4 = 0;
    System.out.println("\n,,,,c8y4>>"+c8y4);

    double c8y4d = c8y4;
    
//
////
    // System.out.println(c8y4);
    // for(c8y4 = 0; c8y4<10; c8y4++){
    //     System.out.println(c8y4++);
    //   }
    /// error: cannot find symbol

//
////


//
////
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

    ////13y31
    System.out.println("\n,,,13y31");
    class A13y31{
      private Collection collection;
      public void set(Collection collection){
        this.collection = collection;
      }
      public Collection get(){
        return this.collection;
      }
    }

    class B13y31 extends A13y31{
      public void set(Map<String, String>map){
        set(map.values());
      }
      public void set(String key, String value) {
        set(Map.of(key, value));
      }
      
      @Override
      public String toString() {
        //return String.valueOf(super.collection);
        //sop >> //[v1hashmap, v2hasmap]
        return "B13y31{collection=" + get() + "}";
        //sop>> B13y31{collection=[v1hashmap, v2hasmap]}
      }
     
    }

    //
    B13y31 b13y31 = new B13y31();
    Map<String, String> map13y31 = new HashMap<>();
    map13y31.put("k1", "v1hashmap");
    map13y31.put("k2", "v2hasmap");
    b13y31.set(map13y31);
    System.out.println(b13y31.get());
    //[v1hashmap, v2hasmap]
    System.out.println(b13y31);
    //B13y31{collection=[v1hashmap, v2hasmap]}
    
    ///aftJava1234
    // System.out.println(b13y31.keySet());
    // System.out.println(b13y31.values());
     
    //
    //
    B13y31 b13y31y2 = new B13y31();
    b13y31y2.set("k1", "v1" );

    System.out.println(b13y31y2.get());//[v1]
    //[v1]
    

    ///
    /// 
    System.out.println("\n,,,,13y31y3");
    class B13y31y3 implements Map<String, String> {
        private HashMap<String, String> map = new HashMap<>();
        
        // Mapインターフェースの主要メソッド実装
        @Override
        public Set<String> keySet() {
            return map.keySet();
        }
        
        @Override
        public Collection<String> values() {
            return map.values();
        }
        
        @Override
        public String put(String key, String value) {
            return map.put(key, value);
        }
        
        //
        ////The following are required.
        @Override
        public int size() {
            return map.size();
        }

        @Override
        public boolean isEmpty() {
            return map.isEmpty();
        }

        @Override
        public boolean containsKey(Object key) {
            return map.containsKey(key);
        }

        @Override
        public boolean containsValue(Object value) {
            return map.containsValue(value);
        }

        @Override
        public String get(Object key) {
            return map.get(key);
        }

        @Override
        public String remove(Object key) {
            return map.remove(key);
        }

        @Override
        public void putAll(Map<? extends String, ? extends String> m) {
            map.putAll(m);
        }

        @Override
        public void clear() {
            map.clear();
        }

        @Override
        public Set<Entry<String, String>> entrySet() {
            return map.entrySet();
        }

    }


    B13y31y3 b13y31y3 = new B13y31y3();
    
    // データの設定
    b13y31y3.put("k1", "v1");
    b13y31y3.put("k2", "v2");
    b13y31y3.put("k3", "v3");
    
    // keySet()とvalues()メソッドを使用して出力
    System.out.println(b13y31y3.keySet());
    System.out.println(b13y31y3.values());
    

    ////
    ///
    System.out.println("\n,,,13y31y4"); 
    class A13y31y4 {
      private List<String> list = new ArrayList<>();

      // 1つの値を追加するset
      public void set(String v) {
          list.add(v);
      }

      // すべての値を取得するgetter
      public List<String> getList() {
          return list;
      }
    }

    class B13y31y4 extends A13y31y4 {
        // Mapの値を全てset(String v)で追加
        public void set(Map<String, String> map) {
            map.forEach((k, v) -> set(v));
        }
        public void setA(Map<String, String> map) {
            map.forEach((k, v) -> set(k + "_setA_k" ));
        }
    }

    B13y31y4 b13y31y4 = new B13y31y4();
    Map<String, String> map13y31y4 = new HashMap<>();
    map13y31y4.put("k1", "v1");
    map13y31y4.put("k2", "v2");
    map13y31y4.put("k3", "v3");

    b13y31y4.set(map13y31y4);

    // 結果を出力
    System.out.println(b13y31y4.getList()); // [v1, v2, v3]    

    B13y31y4 b13y31y4y2 = new B13y31y4();
    b13y31y4y2.setA(map13y31y4);
    System.out.println(b13y31y4y2.getList());
    //[k1_setA_k, k2_setA_k, k3_setA_k] 
    
    ////
    /// 
    ////end8yy
    /// 
    /// startyy9yy APIJava123
    /// 
    /// 
    System.out.println("\n,,,,9y9");

    class m9y9{
      public static void mm9y9(){
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("A2");
        list.add(2, "B");
        list.add("C");
        list.add("D");
        //myIpt
        list.add(3,"Emy");  
         for(String str : list){
          System.out.print(str  + " ");
         }
      }
    }
    new m9y9().mm9y9();
    // A A2 B Emy C D
    //
 
    
    ///
    ///startyy10yy ----exceptionJava12344567
  
/* 
--listLeaJava1234567
--iptRevJava1234567

、、、、、、
コンパイルエラー
構造ミス
文法ミス
プログラムのコンパイル時にエラー
プログラム実行不可

ーー
、、、、、
値的なミス
プログラムのコンパイル完了後に
プログラム実行時に発生したエラー＞＞例外
例外発生　＝　例外スロー


,,,,
,,,,,uncheckd Exception　catch不要
>> Error class, RuntimeException
Java programでの
例外用の追加の対応求めない
非検査例外は数多くある。

,,
,,,Error class
,,unchecked exception
実行環境でのエラー、
もしくは実行環境に及ぶエラー。
致命的エラー
、、マシンのメモリ不足
、、データの保存先ドライブのアクセス権限不足
、、ネットワーク接続不可

・StackOverflowError(スタック領域のオーバーフロー)
無限に同じものを呼び出す繰り返し構文、状態に陥って起きるエラー

,,原因	事故的に起きる例	対策方法
,,無限再帰	関数やメソッドが自分自身を永久に呼ぶ	終了条件の追加、再帰の回避
,,循環依存	AがBを呼び、BがAを呼ぶ	設計改善、DIの見直し
[[[
複数のオブジェクトが互いにイベントリスナーとして登録し合い、特定のイベントが発生したときに無限にイベントが連鎖的に発火し続けるような状況
]]]

,,自動生成コード	toString()やequals()の誤用	出力確認と手動修正
,,スタック小さすぎ	深い再帰処理	-Xssでスタックサイズを拡大
[[[
JVMのデフォルトのスタックサイズは限られているため、たとえ最終的には終了する再帰であっても、その深さが限界を超えるとエラーになります。
]]


・OutOfMemoryError(メモリの不足)
大量のオブジェクトを作成し続けることで、ヒープメモリが枯渇する場合。

・InternalError(内部エラー)
JVMの内部状態が不正である場合や、リソースの不足が原因で発生することがあります。
・ClassFormatError(クラスファイルの破損、解釈できない)
不正なバイトコードを持つクラスファイルをロードしようとした場合。
・UnknownError(未知の重大なエラー)
システムのリソースが枯渇している場合や、JVMが致命的なエラーに遭遇した場合に発生します。


,,
,,,,Runtime Exception class
,,unchecked exceptionn
アプリケーションで発生するエラー
Java programが正しい＞起こらない
コンパイルではエラーではないが
ランタイム（実行時）ではエラー。
定義や文法ではなく、
変数の中身でエラー

・NullPointerException(ぬるぽ)
オブジェクトが初期化されていない状態でメソッドを呼び出すと例外
・ArrayIndexOutOfBoundsException(配列で存在しない要素へのアクセス)
・IllegalArgumentException(不正な引数をメソッドに渡した)
・ArithmeticException(算術例外)
・ClassCastException(継承関係のないクラスへのキャスト)
・NegativeArraySizeException(負の値を配列のサイズに指定)
・SecurityException(セキュリティ違反)
・TypeNotPresentException(型定義が未存在)
・UnsupportedOperationException(サポートされていないような操作)

,,,,
,,,,
,,,,,,checked Exception　catc必要
java programで対応求める

,,
,,,,Runtime以外のException class
,,,,checked exceotion
アプリケーションで発生するエラー

java programが正しい＞起こりうる

・IOException(入出力関係の例外)
開こうとしたファイルが
壊れてていて開けない。アクセス権限がない。存在しない。

・SQLException(DB系の例外)
SQL文が不正であるため、データベースがクエリを実行できない。
データベースへの接続が失敗した場合。

・ClassNotFoundException(クラスが見つからない)
指定したクラス名が間違っている、またはクラスファイルが存在しない場合。

・InstantiationException(インスタンス化不可のクラスをnewした時)
抽象クラスやインターフェイスについて
抽象メソッド未具象化などの不備があるまま直接インスタンス化しようとした場合。抽象メソッドをオーバーライドしていない、

・InterruptedException(スレッドへの割り込み)
スレッドが sleep()やwait() メソッドで待機中に、他のスレッドから割り込みが入った場合。

・NoSuchFieldException(クラスに要求したフィールドがない)
リフレクションを使用して、指定されたクラスに存在しないフィールドを要求した場合に発生します。

・NoSuchMethodException(クラスに要求したメソッドがない)
リフレクションを使用して、指定されたクラスに存在しないメソッドを要求した場合に発生します。



リフレクション（Reflection）とは、Javaプログラミングにおいて、実行時にクラスの情報を取得したり、クラスのメソッドやフィールドにアクセスしたりする機能を指します。リフレクションを使用することで、プログラムの構造や動作を動的に変更することが可能になります。
Field field = clazz.getField("nonExistentField"); // ここでNoSuchFieldException

  Method method = clazz.getMethod("nonExistentMethod"); // ここでNoSuchMethodExcep





  紫本表7-1
*/


///
/// 
    System.out.println("\n\n,,,10y1");

    try {
      int[] array10y1y2 = {};
      array10y1y2[0] = 10;
      System.out.println("finish");
    } catch (ArrayIndexOutOfBoundsException e){
      System.out.println("error");
    }
    //error
    
    System.out.println(",,,10y1y2");
    try {
      int[] array10y1y2 = {};
      // localVari  NonE　rr
      //array10y1y2[0] = 10;
      System.out.println("finish");
    } catch (ArrayIndexOutOfBoundsException e){
      System.out.println("error");
    }
    ///finish
  
    System.out.println(",,,10y1y3");
    try {
      int[] array10y1y2 = {};
      // localVari  NonE　rr
      array10y1y2[0] = 10;
      System.out.println("finish");
    }
    //  catch (NullPointerException e){
    //   System.out.println("error");
    // }
//     ,,,10y1y3
// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
//         at Main.main(Main.java:2402)
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("ArrayIndexOutOfBoundsException");
    }
    catch(Exception e){
      System.out.println("Exception");
    }
    finally{
       System.out.println("finally");
    }
  //ArrayIndexOutOfBoundsException

    /// 
    ///
    /// --localvariJava1234567
/*     
    private class lcl1y5{
      private class lc1y5yy2{
        //static lm1y5y1(){}
      }

    } 

*/  
/* 
ローカルクラスのメソッドに定義できる
修飾子教えて ??? 
public	❌ 不可
private	❌ 不可
protected	❌ 不可
static	❌ 不可
final	✅ 可
abstract	✅ 可(そのメソッドの親クラスがabstractの場合だけ)
strictfp	✅ 可（用途は限定的）
>>全部定義できた

,,

ローカルクラスの直下のメソッドに定義できる
修飾子教えて 

ローカルクラスの直下の直下のローカルクラスに定義できる修飾子教えて

ローカルクラスやローカルクラス直下のローカルクラスやメソッドに定義できるpublic, private, protected
などのアクセス修飾子について
その修飾子を指定することによるメリットやデメリット教えて

、、、
メソッドの直下にメソッドは定義できない。
メソッドの直下にローカルクラス作って
その中にメソッドを作ることはできる。



,,,

抽象クラス lc1abc1 を作成する場合、以下の要件に注意する必要があります：

抽象クラスは abstract キーワードで宣言する
抽象メソッドを含む場合、クラスは必ず抽象クラスでなければならない
抽象メソッドには実装（本体）がない
抽象クラスはインスタンス化できない（具象サブクラスが必要）

 */

//--localvari

  System.out.println("\n,,,lc1y5");

  System.out.println("\n,,,lc1y5");

  class lc1r5{
    void lm1t2(){}
    protected void lm1t3(){}
    public void lm1t4(){}
    private void lmlt5(){}
    static void lm1t6(){}
    
    // abstract void lm1ab(){}
    //error: abstract methods cannot have a body 
    
    //abstract void lm1aby1()
    //error: ';' expected
    //abstract void lm1aby1();
    //error: lc1r5 is not abstract and does not override abstract method lm1aby1() in lc1r5
    //そのabstractメソッドの親クラスもabstractクラスでなくてはならない
    //abstarct class lc1abc1
    abstract public class lc1abc1
    {
        abstract void lc1abc1m1();
        private void lc1abc1m2(){};
        void lc1abc1m3(){};
        protected void lc1abc1m4(){};
        public void lc1abc1m5(){};

        static private void lc1abc1m6(){
          System.out.println(",,,static method lc1abc1m6");
        };

        final private void lc1abc1m7(){};
          
    }



    private int lv1t1 = 5;
    int lv1t2 = 54; 
    protected int lv1t3 = 5; 
    public int lv1t4 = 5;

    static private int lv1t1s = 5;
    static int lv1t2s = 54; 
    protected int lv1t3s = 5; 
    public int lv1t4s = 5; 

    private void lm1t1(){
      System.out.println("asda");
    }

    /////
    /// ////--localvariJava1234
    private class lc1c2{

      private class lc1c3{
        private void lc1c3m1(){
          //private class lc1c3m3c1{} 
          //error: illegal start of expression
          // static class lc1c3m3c1{}
          class lc1c3m3c1{
            static private
            int lv1 = 5;
            static int lv2 = 54;

          } 
        
        }
      }

        //static lm1y5y1(){}
      void lm1t2(){}
      protected void lm1t3(){}
      public void lm1t4(){}
      static void lm1t5(){}

      private int lv1t1 = 5;
      int lv1t2 = 54; 
      protected int lv1t3 = 5; 
      public int lv1t4 = 5;

      static private int lv1t1s = 5;
      static int lv1t2s = 54; 
      protected int lv1t3s = 5; 
      public int lv1t4s = 5; 

      

    }

  } 


  //lc1r5 instLc1r5 = new  lc1r5();

  //lc1abc1m6();
  //error: cannot find symbol

  //new lc1r5().lc1abc1().lc1abc1m6();  
  //error: cannot find symbol   
  // new lc1r5().new lc1abc1().lc1abc1m6();
  // error: lc1r5.lc1abc1 is abstract; cannot be instantiated

  // new lc1r5().new lc1abc1().lc1abc1m6();
  

  lc1r5 instLc1r5 = new lc1r5();
    // 匿名クラスを使用して lc1abc1 を実装
    lc1r5.lc1abc1 lc1abc1Instance = instLc1r5.new lc1abc1() {
        @Override
        void lc1abc1m1() {
            // 抽象メソッドの実装
            System.out.println("abstract class, anonymous class,  implement, lc1abc1m1");
        }
    };
    lc1abc1Instance.lc1abc1m1(); // 抽象メソッドの呼び出し
    lc1r5.lc1abc1.lc1abc1m6(); // 静的メソッドの呼び出し


// lc1abc1m1 implemented
// lc1abc1m6
// 




    /// 
    /// 
    System.out.println("\n,,,,10y3");

    class supse10y3 extends Exception{}    
  
    class subse10y3 extends supse10y3  {} 
  

    class m10y3{
      public void m10y3m1(){
         
        try{
          callsubse10y3();
          callsupse10y3();
        } catch (supse10y3 e){
          System.out.println("supse10y3");
        }
        //  catch (subse10y3 e){
        //   System.out.println("subse10y3");
        // } 
        //  error: exception subse10y3 has already been caught
        /// 構造的にcatch supの下に catch subがあったらエラー


        try{
          callsubse10y3();
          callsupse10y3();
        }
        catch (subse10y3 e){
          System.out.println("subse10y3");
        } catch (supse10y3 e){
          System.out.println("supse10y3");
        } 
        // catch(subse10y3 e){
        //   System.out.println("subse10y3");
        // }
        // error: exception subse10y3 has already been caught
        ///値的には catch supにはいかなくともエラーにならない　
        /// 構造的にcatch supの下に catch sub があったら　コンパイルエラー 

        try{
          callsubse10y3();
        } catch (subse10y3 e){
          System.out.println("subse10y3");
        } catch (supse10y3 e){
          System.out.println("supse10y3");
        }
        //余計

      }
      /*
      --exceptionjava123456 
,,,,10y3
supse10y3
subse10y3
subse10y3
catch文の構造的に間違っている
catchで例外キャッチ使用とするとき
superのあとにsubでcatchしようとしてはいけない
       */

      static void callsupse10y3() throws supse10y3 {
        throw new supse10y3();
      }
      static void callsubse10y3() throws supse10y3{
        throw new subse10y3();
      }
    }

    new m10y3().m10y3m1();
    System.out.println("\n\n");

 
/*
    public m10y3(){
      try{
        callse10y3();
        callsse10y3();
      } catch (se10y3 e){
        System.out.println("se10y3");
      } 
      // catch(sse10y3 e){
      //   System.out.println("sse10y3");
      // }

    }


 */

/* 
public class Main{

  public static void main(String[] aregs){
   
    class se10y3 extends Exception{}    
  
    class sse10y3 extends se10y3  {} 


    static void callse10y3() throws se10y3 {
      throw new se10y3();
     }
    static void callsse10y3() throws sse10y3{
      throw new sse10y3();
    }
 
  }

}

 */

    System.out.println("!\n,,,,10y4");
    try {
      Object obj = null;
      System.out.println(obj.toString());
      System.out.println("A");
    } 
    catch(NullPointerException e){
      System.out.println("Catch");
    }
    //上記がないと　以下が発生して後続の処理がされない。　例外はcatchしないと処理がとまる
    //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.toString()" because "<local125>" is null    
    finally{
      System.out.println("finally");
    }
    System.out.println("\n");


/* 
 * 

public class Main{

  public static void main(String[] aregs){
  }

}
 */

    ////
    /// 
    System.out.println("\n,,,,10y5");

/*     
   System.out.println(new m10y5().t10y5(null));
    //error: cannot find symbol
    ///
    System.out.println(m10y5.t10y5());
    //error: cannot find symbol
 */
    class m10y5{
      public static void mm10y5(){
        System.out.println(t10y5(null));
      }
      
      private static String t10y5(Object obj){
        try{
          System.out.println(obj.toString());
        } catch (NullPointerException e){
          return "A";
        } finally {
          System.out.println("B");
          return "B_finally";
        }
        //return "C";
        //error: unreachable statement
      }
    }
//B
//B_finally
////--try-catchにおけるreturnは　より後の文が優先される。　
/// --exceptionJava123456
////--localVariJava1234567
/// 
    new m10y5().mm10y5();

///
/// 
    System.out.println("\n..,,,,10y5y2");

    
    class m10y5y2{
      public static void mm10y5(){
        System.out.println(t10y5(null));
      }
      
      private static String t10y5(Object obj){
        //return "previousTryCatch";
        ///error: unreachable statement
        //ここ以降がunreachable
        try{
          System.out.println(obj.toString());
        } catch (NullPointerException e){
          return "A";
        } finally {
          System.out.println("B");
          //return "B_finally";
        }
        return "C";
        //finally{}でreturnがなければ、ここでerror: unreachable statement　は起きない。
      }
    }

    new m10y5y2().mm10y5();

///
///   
    System.out.println("\n,,,,,m10y6");


    //--localVariJava1234567
    //static class m10y6
    class m10y6
    {
/*    
      int res = sam();
      //System.out.println(res);
      m10y6(){
        System.out.println(res);
      }
      */
      //sucJava 上記もOK
      //  ローカルクラスの外で
      //  new m10y6();
       

      private static int sam()
      //suc
      //suc  private int sam()
      //suc protected int sam()
      //sucJava public int sam() 
      //sucJava int sam()
      //
      {
        try {
          throw new RuntimeException();
        } catch (RuntimeException e){
          return 10;
        } finally {
          return 20;
        }
      }
    } 

    new m10y6();
    //20

///
/// 

    System.out.println("\n,,,mm10y5y1");
    
    class m10y5y1{
      public static void mm10y5(){
        System.out.println(t10y5(null));
      }
      
      private static String t10y5(Object obj){
        try{
          System.out.println(obj.toString());
        } catch (NullPointerException e){
          return "A";
        } finally {
          System.out.println("B");
          //return "B_finally";
          //error: missing return statement
          //try-ca-fin文の外の
          //return "C";　を書くなら　ここに
          //return "B_finally"はかけない
        }
        return "C";
        //上記がないなら
        //return "B_finallly"　、書ける。
        
        // error: missing return statement
      
      }
    }  
    
    new m10y5y1().mm10y5();
// B
// A
///
/// //  
/// 
/// 
    System.out.println("\n,,,10y7");

    //static class m10y7
    class m10y7
    {
      //public static void mm10y7(String[] args){
      public static void mm10y7(){       
        int res = sample();
        System.out.println(res);
      }

      private static int sample(){
        //int val = 0;
        Integer val = 0;
        try {
          String[] array = { "A", "B", "C"};
          System.out.println(array[3]); 
        } catch (RuntimeException e) {
          val = 10;
          return val ;
        } finally {
          val += 10;
          return val;//myadd
        }
        
        //return val;
        //finalyでreturnする￥場合はerror: unreachble
        // finallyでも、その下でも　returnなかったら
        //  error: missing return statement
      } 
    }
    
    new m10y7().mm10y7();
    //20

    //
    //
    System.out.println("10Y10");

    //static void m10y10m(){
//    }

    //Class M10y10 
    class m10y10 
    { 
      static public void mm10y10()
      {
        try(FileInputStream is  = new FileInputStream("sample.txt"))
        {   
        //throw new FileNotFoundException();
        //あっても出力はA B
        //ファイルが見つからない場合に自動的にスローされる例外。 ないほうが良い。　
        
        //myadd
        int try1 = 27;          
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
          // System.out.println(is);
          // error: cannot find symbol

          System.out.println("B");
          //  System.out.println(try1);
          // error: cannot find symbol

          int try2 = 45;
          System.out.println(try2);
        }
      }
    }
    
    new m10y10().mm10y10();
//A
//B


/* 
///
/// try() の　括弧内には、AutoCloseableインターフェースを実装したオブジェクトを指定する必要があります。ブール値はリソースではないため、try()の文法としては無効です。

///
try()の意味
リソースの宣言: try()の括弧内には、リソースを宣言します。例えば、ファイルを開くためのFileInputStreamや、データベース接続のためのConnectionオブジェクトなどです。

自動クリーンアップ: tryブロックが終了すると、括弧内で宣言されたリソースのclose()メソッドが自動的に呼び出されます。これにより、リソースリークを防ぎ、コードが簡潔になります。
  
 */

///
/// 
    System.out.println("\n,,,,10y15");
    int i10y15 = 54;
    String s10y15 = "moses";
    
    ////以下二つはコンパイルエラー
    // i10y15 = "yh";
    //  error: incompatible types: String cannot be converted to int

    // s10y15 = 54;  
    // error: incompatible types: int cannot be converted to String

////
/// 
    class m10y15y1{}
    class m10y15y2{}
    
    m10y15y1 inst10y15y1 = new m10y15y1();

    m10y15y2 inst10y15y2 =  new m10y15y2();

    //  以下二つもコンパイルエラー
     
    // inst10y15y1 = inst10y15y2;
    // error: incompatible types: m10y15y2 cannot be converted to m10y15y1  

    // inst10y15y1 = (m10y15y1) inst10y15y2;
    // error: incompatible types: m10y15y2 cannot be converted to m10y15y1 


    ////
    ///
    // 以下はRuntimeException
    //     ,,,,10y15
    //String s = null;
    //System.out.println(s.length());

///java Main >>>
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local133>" is null 
//         at Main.main(Main.java:3255)
// PS C:\xampp\htdocs\_344htdocs_xampp_GA1y1\_Projects\555Java\Java_Silver_Examp>

///
/// 
    class m10y15y3{
      void mm10y15y3() throws Exception {
        //throw new IOException(); /
        
        throw new Exception(); // throwsがなければコンパイルエラー[1][3][10]


        // try{
        // }
        // catch(Exception e){
        //   System.out.println("Exception,,10y15y3");
        // }
        ////javac 
        /// error 
        ///  error: unreachable statement
      }
    }
///javac Main.java >>
///Main.java:3269: error: unreported exception Exception; must be caught or declared to be thrown throw new Exception(); // try-catch?throws?????????????[1][3][10]

////iptrevExceptionJava123456789101112
///vscodeなどでjavaを実行するときそのコードが 
//コンパイルエラーか　RuntimeExceptionか
// RuntimeException以外の検査例外か区別する方法教えて

/* 
 * 


,,,
javac Main.javaでエラー
>>コンパイルエラー
[[[[
error: incompatible types: m10y15y2 cannot be converted to m10y15y1 
]]]]

,,,
java Main で処理結果出力中に処理と止まって例外スロー
>> RuntimeException
[[[[
  Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local133>" is null 
]]]]

,,,
javac Main.javaでコンパイル時に例外スロー
>> 検査例外
runtimeException以外のExceptionクラスやサブクラス検査例外か
[[[
Main.java:3269: error: unreported exception Exception; must be caught or declared to be thrown throw new Exception(); // try-catch?throws?????????????[1][3][10]  
]]]

 */

////
///
    System.out.println("\n,,,10y15y2");

    class Am10y15 {
      private int num;
      public Am10y15(int num){
        this.num = num;
      }
      public boolean equals(Object obj){
        Am10y15 a = (Am10y15) obj;
        return this.num == a.num;
      }
    }
    
     class Bm10y15 {
      private int num;
      public Bm10y15(int num){
        this.num = num;
      }
      public boolean equals(Object obj){
        Bm10y15 a = (Bm10y15) obj;
        return this.num == a.num;
      }
    }

    class m10y15{
      public static void mm10y15(){
        Am10y15 a = new Am10y15(10);
        Bm10y15 b = new Bm10y15(10);
        //suc >> Exception 
        //System.out.println(a.equals(b));
      }
    }

    new m10y15().mm10y15();
    ////javac main.java
// Main.java:3269: error: unreported exception Exception; must 
// be caught or declared to be thrown
//       throw new Exception(); // try-catch?throws?????????????[1][3][10]
//       ^
// 1 error

    Integer i10y15y1 = 55;
    Integer i10y15y2;
    String s10y15y2 = "afafa";

    //i10y15 = i10y15y2; //suc
    //  error: variable i10y15y2 might not have been initialized

    i10y15y2 = i10y15; //suc
  
    // s10y15y2 = (String) i10y15;
    // error: incompatible types: int cannot be converted to String
    // s10y15y2 = (String) i10y15y2;
    // error: incompatible types: int cannot be converted to String

////ExceptionJava1234567
/// コンパイルエラーはExceptionクラスですか？なんのクラスですか？
/// コンパイルエラーはExceptionクラスでもErrorクラスでもなく、「Javaのクラス階層に属さない、コンパイラが検出する文法的なエラー」です。
/// 
/// 

    ///
    ///  starrtyy11 moduleJava123
    ///13y22  java.base>> java.lang packcage 
    ///
    /// https://docs.oracle.com/javase/jp/11/docs/api/index.html
 

    //
    ////yy12y44
    System.out.println("\n,,,,12y44");
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

    ///
    /// //JavaJava123
    //////ソースコード　人が書くコード
    /// ///コンパイラ
    /// コードを実行するプラットフォームを考慮せず
    /// JVM が読み込める形式に翻訳する。
    /// 
    // ///JVM
    ///各プラットフォームで実行できる形式にコードを翻訳する。
    /// あらかじめ決められえた形式でしかコードを読み込めない。
    ///  
    /// Javaは必要に応じて必要なクラスファイルを読み込む
    /// 

  }
}
