package Excetion_.dz2;

/*
���� ����������, ��������� ������ ��� (������� 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit) */
public class task2 {
    public static void main(String[] args) {
        try {
            int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            int d = 1; // �������� �������� d, ����� �������� ������� �� ����
            double catchedRes1 = (double) intArray[8] / d; // ���������� � double ��� ������� �������
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) { // ��������� ��� ����������
            System.out.println("Catching exception: " + e);
        }
    }
}
