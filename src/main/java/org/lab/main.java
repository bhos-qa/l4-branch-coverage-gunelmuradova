package org.lab;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Classroom {

    public static int addition (int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int power (int x, int y) {
        return (int) Math.pow(x, y);
    }

    public static double division (int x, int y) {
        return (double) x / y;
    }

    public static int multiplication (int x, int y) {
        return x * y;
    }


    public static int modulo (int x, int y) {
        return x % y;
    }

    public static int square (int n) {
        return n * n;
    }

    public static int cube (int n) {
        return n * n * n;
    }

    public static int factorial (int n) {
        int fact = 1;
        for(int i=1 ;i<=n ; i++){
            fact=fact*i;
        }
        return fact;
    }

    public byte[] makeHash (String data) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        return messageDigest.digest(data.getBytes());
    }

}