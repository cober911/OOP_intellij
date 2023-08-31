package Excetion_.dz2;

import java.util.Arrays;

/*
        ��� ��������� ���, ��������� ��� ���, ��� ��������� (������� 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit) */
public class task3 {
    public int[] divArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return new int[]{0}; // ������� ������� ������ ����� 1 ��� �������� ������
        }

        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0) {
                throw new RuntimeException("������� �� ����"); // ������ ���������� ��� ������� �� ����
            }
            c[i] = a[i] / b[i];
        }

        return c;
    }
}

class Printer {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};

        if (args.length == 0) {
            a = new int[]{12, 8, 16};
            b = new int[]{4, 2, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
            b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        task3 ans = new task3();
        String itresume_res = Arrays.toString(ans.divArrays(a, b));
        System.out.println(itresume_res);
    }
}
