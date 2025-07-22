
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {


////yy6yy  javaS StreamAPI
/* 
 * 
 * 6yy1
JavaのストリームAPI（Stream API）は、Java 8で導入された機能で、コレクション（リスト、セット、マップなど）や配列などのデータソースに対して、宣言的な方法で操作を行うためのAPIです。ストリームAPIを使用することで、データの処理を簡潔かつ効率的に行うことができます。

JavaのストリームAPIは、データの処理を簡潔かつ効率的に行うための強力なツールです。宣言的なスタイル、パイプライン処理、遅延評価、並列処理などの特徴を活かして、複雑なデータ操作をシンプルに記述することができます。

### ストリームAPIの主な特徴

1. **宣言的なスタイル**:
   - ストリームAPIは、データの処理を宣言的に記述することができ、従来の命令型プログラミングスタイルよりもコードが簡潔になります。

2. **パイプライン処理**:
   - ストリームは、データの変換やフィルタリング、集約などの操作を連鎖的に行うことができるパイプラインを形成します。

3. **遅延評価**:
   - ストリームの操作は遅延評価されるため、必要なときにのみ計算が行われます。これにより、パフォーマンスが向上します。

4. **並列処理**:
   - ストリームAPIは、簡単に並列処理を行うことができるため、大量のデータを効率的に処理することが可能です。

### ストリームAPIの基本的な使い方

ストリームAPIを使用するための基本的な流れは以下の通りです。

1. **ストリームの生成**:
   - コレクションや配列からストリームを生成します。

2. **中間操作**:
   - ストリームに対してフィルタリング、マッピング、ソートなどの中間操作を行います。中間操作は遅延評価されます。

3. **終端操作**:
   - ストリームの処理を完了させるために、集約や収集などの終端操作を行います。終端操作はストリームを消費します。



### ストリームAPIの主な操作

- **中間操作**:
  - `filter(Predicate<? super T> predicate)`: 条件に合致する要素をフィルタリングします。
  - `map(Function<? super T, ? extends R> mapper)`: 要素を別の型に変換します。
  - `sorted()`: 要素をソートします。

- **終端操作**:
  - `collect(Collector<? super T, A, R> collector)`: ストリームの要素をコレクションに収集します。
  - `forEach(Consumer<? super T> action)`: 各要素に対してアクションを実行します。
  - `reduce(T identity, BiFunction<T, ? super T, T> accumulator)`: 要素を集約します。


### 例: ストリームAPIの使用例
 */

        System.out.println("\n,,,,6yy1");

        List<Integer> numbers6yy1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 偶数の合計を計算
        int sumOfEvens6yy1 = numbers6yy1.stream() // ストリームを生成
                .filter(n -> n % 2 == 0) // 偶数をフィルタリング
                .mapToInt(Integer::intValue) // int型にマッピング
                .sum(); // 合計を計算

        System.out.println("even sum total: " + sumOfEvens6yy1);
    }
}

 





