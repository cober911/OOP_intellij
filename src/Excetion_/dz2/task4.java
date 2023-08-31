package Excetion_.dz2;

import java.io.*;

/*
������������ ���������, ������� �������� Exception, ����� ������������ ������ ������ ������. ������������ ������ ���������� ���������, ��� ������ ������ ������� ������. */
public class task4 {
    public static void main(String[] args) {
        String userVal = getVal();
        System.out.println();
        System.out.println("�� ����� ��������� ������:");
        System.out.println(userVal);
    }

    static String getVal() {
        String val = "";
        System.out.println("������� ���� ������:");
        InputStream UserInput = System.in;
        Reader inputReader = new InputStreamReader(UserInput);
        BufferedReader bufferedReader = new BufferedReader(inputReader);
        try {
            val = bufferedReader.readLine();
            if (val.isBlank()) {
                throw new IllegalArgumentException("������ ������ ���������!");
            }
        } catch (IOException exception) {
            System.out.println("�������� � ������/�������.");
            //exception.printStackTrace();
        }
        return val;
    }
}
