package com.training.prog;
import java.util.*;

public class UniqueNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();//no specifc order

        System.out.println("Enter numbers (type -1 to stop):");
        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;
            set.add(n);
        }

        System.out.println("Unique numbers: " + set);
        sc.close();
    }
}
