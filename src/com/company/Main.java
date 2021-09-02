package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        long _inputan;
        System.out.println("Anda akan menghitung nilai dari sebuah faktorial");
        System.out.print("Masukkan angka yang akan anda hitung : ");
        Scanner scanner = new Scanner(System.in);
        _inputan = scanner.nextLong();
        System.out.println("Nilai Faktorial adalah : " +hitungFaktorial(_inputan));

    }

    private static long hitungFaktorial(long _nilai){
        if (_nilai == 1){
            return 1;
        }else{
            return _nilai * hitungFaktorial(_nilai-1);
        }
    }
}
