package aantonovich.Stream;

public class Test {
    public static void main(String[] args) {

      //  Stream.of("10", "11", "32")
        //        .map(x -> Integer.parseInt(x, 16)) ???? почему выводит из 32 -> 50
          //      .forEach(System.out::println);


      /*  Stream.of(120, 410, 85, 32, 314, 12)
                .sorted(Comparator.reverseOrder()) // вывод стрима наоборот
                .forEach(System.out::println);
   */

  //  Stream.of(1, 2, 3, 4, 2, 5)
    //         .takeWhile(x -> x < 3) // выводит элементы пока они удовлетворяют условию
      //        .forEach(System.out::println);
        // dropWhile пропускает элементы пока они удовлетворяют условию (вывод: 3,4,2,5 )


        /*IntStream.of(1, 3, 2, 0, 5, 4)
                .dropWhile(x -> x %2 == 1)
                .forEach(System.out::println);
        */

        //int product = IntStream.range(0, 10)
          //      .filter(x -> x++ % 4 == 0) // product = 0 )))
            //    .reduce((acc, x) -> acc * x)
              //  .getAsInt();
       // System.out.println(product);


      /*  int min = Stream.of(20, 45, 11, 57, 124)
                .min(Integer::compare).get();  // max так же
        System.out.println(min);
    */

     // String s1 = Stream.of("H", "E", "L", "L", "O")
       //       .collect(Collectors.joining("-", "!<<", ">>!"));
       // System.out.println(s1);


     /*   DoubleSummaryStatistics statistics = Stream.of("1.2", "3.14", "2.2", "5.06")
                .collect(Collectors.summarizingDouble(Double::parseDouble));
        System.out.println(statistics);
    */

       // Optional<String> max = Stream.of("ab", "gfh", "book", "finger")
         //       .collect(Collectors.maxBy(Comparator.comparing(String::length)));
       // max.ifPresent(System.out::println); // finger


   // String s = Stream.of(2, 0, 1, 3, 2)
     //       .collect(Collectors.flatMapping(x -> IntStream.range(0,x)
       //     .mapToObj(Integer::toString),Collectors.joining(", ")));
       // System.out.println(s);// 0, 1, 0, 0, 1, 2, 0, 1


      //  IntStream.range(5, 30)
        //        .limit(12).skip(3).limit(6).skip(2)
          //      .forEach(System.out::println); /// 10,11,12,13

    }
}