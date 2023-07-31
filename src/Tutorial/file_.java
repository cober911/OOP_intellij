package Tutorial;

import Seminar5.HW.model.FileOperation;

import java.io.*;

public class file_ {
    public static void main(String[] args) throws IOException, FileNotFoundException {
//        ------------Смотрим файлы в директории-----------
        File dir = new File(".");
        String[] names = dir.list();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
//        ------------Работаем с файлом note.txt-------------
        File file = new File("notes.txt");
        System.out.println(file.length()); // Узнаем длину файла

//        ------------Работаем с файлом note.txt-------------
        FileInputStream input = new FileInputStream("notes.txt");
        int length = input.available(); // Узнаем размер файла
        System.out.println(length);
//        ------------Работаем с файлом note.txt-------------
        byte[] data = new byte[length]; // Создаем массив с байтовым объектом
        input.read(data);

        String text = new String(data); // Передаем массив строк в объект
        System.out.println(text);

//        ------------Изменяем файл note.txt-------------
        FileOutputStream output = new FileOutputStream(file, true); // Благодаря параметру true файл дозаписывается.
        String newText = "<!-- Hello Vova -->";
        byte [] newTextBytes = newText.getBytes(); // Конструкции превращает текст в массив байтов.
        output.write(newTextBytes);
        output.close();
    }
}
