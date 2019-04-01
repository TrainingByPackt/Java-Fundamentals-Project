package com.packt.jamescutajar.lesson6;

public class LevenshteinDistance {
    /**
     * Exercise for Lesson 6.
     * Implement the Levenshtein distnace algorithm in this method as explained in the reading material
     */
    public int stringDistance(String strA, String strB) {
        int[][] dist = new int[strA.length() + 1][strB.length() + 1];
        for (int i = 0; i <= strA.length(); i++) dist[i][0] = i;
        for (int i = 0; i <= strB.length(); i++) dist[0][i] = i;

        for (int x = 0; x < strA.length(); x++) {
            for (int y = 0; y < strB.length(); y++) {
                if (strA.charAt(x) == strB.charAt(y))
                    dist[x + 1][y + 1] = dist[x][y];
                else {
                    int a = dist[x][y], b = dist[x + 1][y],
                            c = dist[x][y + 1];
                    dist[x + 1][y + 1] =
                            Math.min(a, Math.min(b, c)) + 1;
                }
            }
        }

        return dist[strA.length()][strB.length()];
    }
}
