package com.company.Examples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Arguments {

    public static void main(String[] args){

        String[] arguments = {"-i", "in.txt", "--limit", "40", "-d", "1", "-o", "out.txt"};
        Map<String, String> argsMap = new LinkedHashMap<>(arguments.length / 2);
        for (int i = 0; i < arguments.length; i += 2) {
            argsMap.put(arguments[i], arguments[i + 1]);
        }
        argsMap.forEach((key, value) -> System.out.format("%s: %s%n", key, value));

        //and back

        String[] args2 = argsMap.entrySet().stream()
                .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                .toArray(String[]::new);
        System.out.println(String.join(" ", args2));
// -i in.txt --limit 40 -d 1 -o out.txt
    }
}
