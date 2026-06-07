package com.mohamdy.grok150.support;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Test-only helpers for comparing results whose ordering is not specified
 * (e.g. lists of subsets, groups of anagrams, sets of coordinates).
 */
public final class Cases {
    private Cases() {
    }

    /** Canonicalize a list of integer lists: sort each inner list, then sort the outer list. */
    public static List<List<Integer>> canon(List<List<Integer>> in) {
        List<List<Integer>> out = new ArrayList<>();
        for (List<Integer> l : in) {
            List<Integer> c = new ArrayList<>(l);
            Collections.sort(c);
            out.add(c);
        }
        out.sort(Cases::cmpInt);
        return out;
    }

    private static int cmpInt(List<Integer> a, List<Integer> b) {
        for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
            int c = Integer.compare(a.get(i), b.get(i));
            if (c != 0) {
                return c;
            }
        }
        return Integer.compare(a.size(), b.size());
    }

    /** Canonicalize a list of string lists: sort each inner list, then sort the outer list. */
    public static List<List<String>> canonS(List<List<String>> in) {
        List<List<String>> out = new ArrayList<>();
        for (List<String> l : in) {
            List<String> c = new ArrayList<>(l);
            Collections.sort(c);
            out.add(c);
        }
        out.sort(Cases::cmpStr);
        return out;
    }

    private static int cmpStr(List<String> a, List<String> b) {
        for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
            int c = a.get(i).compareTo(b.get(i));
            if (c != 0) {
                return c;
            }
        }
        return Integer.compare(a.size(), b.size());
    }

    /** Sort the rows of a 2-D int array (each row left intact) for order-independent comparison. */
    public static int[][] sortRows(int[][] m) {
        int[][] c = new int[m.length][];
        for (int i = 0; i < m.length; i++) {
            c[i] = m[i].clone();
        }
        Arrays.sort(c, (x, y) -> {
            for (int i = 0; i < Math.min(x.length, y.length); i++) {
                int d = Integer.compare(x[i], y[i]);
                if (d != 0) {
                    return d;
                }
            }
            return Integer.compare(x.length, y.length);
        });
        return c;
    }
}
