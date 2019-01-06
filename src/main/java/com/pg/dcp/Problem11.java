package com.pg.dcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * Implement an autocomplete system. That is, given a query string s and a set of all possible query strings,
 * return all strings in the set that have s as a prefix.
 * <p>
 * For example, given the query string de and the set of strings [dog, deer, deal], return [deer, deal].
 * <p>
 * Hint: Try preprocessing the dictionary into a more efficient data structure to speed up queries.
 */
public class Problem11 {
    public static void main(String[] args) throws IOException {
        Set<String> strings = loadWords();




    }

    private static Set<String> loadWords() throws IOException {
        Set<String> set = new HashSet<>();

        InputStream resourceAsStream = Problem11.class.getClassLoader().getResourceAsStream("/data/problem11_words.txt");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(resourceAsStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                set.add(line);
            }
        }
        return set;
    }

    private static String[] findPrefixedStrings(String[] strings, String de) {


        return new String[0];
    }
}
