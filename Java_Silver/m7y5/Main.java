//package m7y5;


public class Main {
    public static void main(String[] args) {
        A7y5 a7y5 = new B7y5();
        System.out.print("a7y5.sample()>>");
        a7y5.sample(); // "B7y5"と出力される
        System.out.println(a7y5);
    }
}

//
//

// //package m7y5;
// //public interface A7y5 {
// interface A7y5 {
  
//     default void sample() {
//         System.out.println("A7y5");
//     }
// }

// //public class B7y5 implements A7y5 {
// class B7y5 implements A7y5 {
//     @Override
//     public void sample() {
//         System.out.println("B7y5");
//     }
// }
