public class Main {
    // sample12y17 メソッドはクラス内に独立して定義する
    void sample12y17(int... val) {
        if (val.length >= 3) {
            System.out.println(val[0] + " " + val[1] + " " + val[2]);
        } else {
            System.out.println("Insufficient arguments provided.");
        }
    }

    public static void main(String[] args) {
        Main main = new Main(); // Mainクラスのインスタンスを作成
        // main.sample12y17(1, 2); // メソッド呼び出し
        main.sample12y17(1, 2, 3); // 
        main.sample12y17(new int[]{3, 74, 52, 14, 24});]

        //main.sample12y17(new int{43, 745, 542, 134, 224}); 
        // error: '[' expected
        
    }
}


/*

 //package m13y17;

public class Main {
  public static void main(String[] args) {
    void sample12y17(int... val) {
      // System.out.println(val[1] + val[2] + val[3]);
      if (val.length > 3) {
      System.out.println(val[1] + " " + val[2] + " " + val[3]);
    }
    //cllass instance//new sample12y17(int[]{1, 2, 3});
    sample12y17(1, 2, 3);
  }

}

 */