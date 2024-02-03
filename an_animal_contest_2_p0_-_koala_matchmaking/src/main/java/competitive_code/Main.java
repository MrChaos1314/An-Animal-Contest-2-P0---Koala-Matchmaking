package competitive_code;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main v = new Main();
        v.run();
    }

    public void run() throws IOException {
        System.out.println(matchmaking());
    }

    public String matchmaking() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long favouriteNumber = Long.parseLong(st.nextToken());

        long average = (favouriteNumber + (favouriteNumber - 2)+1) / 2;

        return String.valueOf(average);
    }
}