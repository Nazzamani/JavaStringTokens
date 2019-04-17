import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String [] parts = new String[1159];
        parts = s.split("\\W+");
        System.out.println(parts.length);
        for(int i = 0; i< parts.length; i++) {
            System.out.println(parts[i]);
        }
        scan.close();
    }
}