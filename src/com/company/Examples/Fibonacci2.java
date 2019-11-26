package com.company.Examples;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Fibonacci2 {

    public static void main(String[] args){

        Stream.iterate(
                new BigInteger[] { BigInteger.ZERO, BigInteger.ONE },
                t -> new BigInteger[] { t[1], t[0].add(t[1]) })
                .map(t -> t[0])
                .limit(20)
                .forEach(System.out::println);

//        Stream.iterate(0,x -> x++).forEach(System.out::print);


    }
}
