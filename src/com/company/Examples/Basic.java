package com.company.Examples;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Basic {

    public static void main(String[] args){

//        args = new String[] {"-l","100","-r","","-t","0"};
//
//        List<String> list = Arrays.stream(args).filter(s -> s.length()<=2).collect(Collectors.toList());
//
//        list.forEach(System.out::println);

//        IntStream.of(120,410,85,32,314,12).filter(x->x<300).map(x->x+11).limit(3).forEach(System.out::println);



//        IntStream.range(0, 200)
//                .mapToObj(value -> new Integer(value))
//                .forEach(x -> System.out.println(x.getClass().getName()));


//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        IntStream.of(1,2,3,4,5,6,7,8,9,10)
//                .filter(x->x>5)
//                .map(x->x+10)
//                .limit(4)
//                .forEach(System.out::println);

        //.collect(Collectors.toList());
        //.forEach(System.out::println);

//        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        List<Integer> list = integers.stream().filter(x->x>5).collect(Collectors.toList());
//        list.forEach(System.out::println);


//        List<String> names = Arrays.asList("John","Max","Den","Filip","Filip");
//        Set<String> uNames = names.stream().map(String::toUpperCase).collect(Collectors.toSet());
//        uNames.forEach(System.out::println);


        List<String> names = Arrays.asList("John","Max","Den","Filip","Filip");
        Set<String> uNames = names.stream().map(String::toUpperCase).collect(Collectors.toSet());
        uNames.forEach(System.out::println);
    }
}
