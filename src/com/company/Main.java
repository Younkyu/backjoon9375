package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            Map<String, Integer> set = new HashMap<>();
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                String str = sc.next();
                String key = sc.next();
                if(set.containsKey(key)) {
                    int add = set.get(key) + 1;
                    set.put(key, add);
                } else {
                    set.put(key, 2);
                }
            }

            int result = set.values().stream().reduce(1, ((p,v) -> p * v)) - 1;
            System.out.println(result);
        }
    }
}
