package codeForcesTemplate;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        StringBuilder out = new StringBuilder();

        // your code here

        System.out.print(out.toString());
    }

    static class FastScanner {
        byte[] buf = new byte[1 << 16];
        int len = 0, ptr = 0;
        InputStream in;
        FastScanner(InputStream in) { this.in = in; }
        int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buf);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buf[ptr++];
        }
        int nextInt() throws IOException {
            int c, s = 1, x = 0;
            do c = read(); while (c <= ' ');
            if (c == '-') { s = -1; c = read(); }
            while (c > ' ') {
                x = x * 10 + c - '0';
                c = read();
            }
            return x * s;
        }
        String next() throws IOException {
            int c;
            StringBuilder sb = new StringBuilder();
            do c = read(); while (c <= ' ');
            while (c > ' ') {
                sb.append((char)c);
                c = read();
            }
            return sb.toString();
        }
    }
}
