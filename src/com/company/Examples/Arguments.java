package com.company.Examples;

import java.util.LinkedHashMap;
import java.util.Map;

public class Arguments {

    public static void main(String[] args){
        String[] arguments = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Map<String, String> argsMap = new LinkedHashMap<>(arguments.length / 2);
        for (int i = 0; i < arguments.length; i += 2) {
            argsMap.put(arguments[i], arguments[i + 1]);
        }
        argsMap.forEach((key, value) -> System.out.format("%s: %s%n", key, value));
    }
}
