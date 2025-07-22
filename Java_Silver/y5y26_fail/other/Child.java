//package y5y26;
//package y5y26.other;
package other;

//import y5y26.ex26.Parent;
import ex26.Parent;


public class Child extends Parent{
  public static void main(String[] args){
    System.out.println(num);
    //System.out.println(super.num);
  }
} 

/* 
 * 
javac ex26/Parent.java other/Child.java
実行:
コンパイルが成功したら、root_directoryで以下のコマンドを実行します。

bash
java other.Child
注意点:

Childクラスのimport文を修正する必要があります。Parentクラスの正確な名前（大文字で始まる）を使用してください：

java
import ex26.Parent;
Childクラスのmainメソッド内で、num変数にアクセスするには、インスタンスを作成するか、superキーワードを使用する必要があります：

java
System.out.println(new Child().num);
または

java
System.out.println(super.num);
 */