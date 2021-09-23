package _08_collection_estrutura_de_dados.lista01._02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(5);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(8);
        nums.add(8);

        // todos os números são mostrados
        nums.forEach(System.out::println);
        System.out.println("----------------------------");

        Set<Integer> nums2 = new HashSet<>();

        nums2.add(1);
        nums2.add(5);
        nums2.add(5);
        nums2.add(6);
        nums2.add(7);
        nums2.add(8);
        nums2.add(8);
        nums2.add(8);

        // números repetidos não são mostrados
        nums2.forEach(System.out::println);
    }
}
