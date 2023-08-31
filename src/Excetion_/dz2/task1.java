package Excetion_.dz2;

import java.util.Scanner;

public class task1 {
    /*
    ���������� �����, ������� ����������� � ������������ ���� �������� ����� (���� float), � ���������� ��������� ��������.
    ���� ������ ������ ����� �� ������ ��������� � ������� ����������, ������ �����, ���������� �������� ��������� � ������������ ���� ������. */
    public static void main(String[] args) {
        float number = getFloatInput();
        System.out.println("�� �����: " + number);
    }

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("������� ������� �����: ");
                float value = Float.parseFloat(scanner.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("������! ������� ���������� ������� �����.");
            }
        }
    }
}
