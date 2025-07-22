public class Outer {

    public static void main(String[] args) {
        // 外側のローカルクラス
        class OuterLocal {
            void outerMethod() {
                System.out.println("Outer method");

                // 内側のローカルクラス（outerMethod の中に定義）
                class InnerLocal {
                    int value = 42;

                    void innerMethod() {
                        System.out.println("Inner method: value = " + value);
                    }
                }

                // 内側ローカルクラスのインスタンスを作って、メンバにアクセス
                InnerLocal inner = new InnerLocal();
                inner.innerMethod();            // メソッドにアクセス
                System.out.println(inner.value); // フィールドにアクセス
            }
        }


        
        System.out.println("\n,,,,");
        // 外側のローカルクラスの使用
        OuterLocal outer = new OuterLocal();
        outer.outerMethod();

              
        System.out.println("\n,,,,");

        ////＞＞ outer　インスタンスを作って、　outerMethod実行しないと　innerクラスのメソッド実行されない。
        new OuterLocal();
        /// なにも表示されない
        // outer.outerMethod();
        // Outer method
        // Inner method: value = 42
        // 42

        System.out.println("\n,,,,");
       new OuterLocal().outerMethod();
/* 
Outer method
Inner method: value = 42
42
 */
       System.out.println("\n,,,,");
      //  new OuterLocal().outerMethod().InnerLocal().innerMethod();
/* 
 * 
new OuterLocal().outerMethod().InnerLocal().innerMethod(); という書き方がしたい → ❌ これは文法的に不可能です。

なぜなら InnerLocal は outerMethod() のローカルクラスであり、そのスコープの外からは存在を認識できないため。

outerMethod() は void を返すので .InnerLocal() と続けられない。

そもそも InnerLocal は outerMethod() の内部に定義されたローカルクラスなので、外側からアクセスできない。



 */


        //System.out.println(inner.value); 
        //error: cannot find symbol



    }
}


