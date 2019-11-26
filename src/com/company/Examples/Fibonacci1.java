package com.company.Examples;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

public class Fibonacci1 {

    public static void main(String[] args){
        StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(
                        new FibonacciIterator(),
                        Spliterator.ORDERED | Spliterator.SORTED),
                false /* is parallel*/)
                .limit(10)
                .forEach(System.out::println);
    }

    public static class FibonacciIterator implements Iterator<BigInteger> {
        private BigInteger a = BigInteger.ZERO;
        private BigInteger b = BigInteger.ONE;
        @Override
        public boolean hasNext() {
            return true;
        }
        @Override
        public BigInteger next() {
            BigInteger result = a;
            a = b;
            b = result.add(b);
            return result;
        }
    }
}
