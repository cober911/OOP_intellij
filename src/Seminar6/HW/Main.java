package Seminar6.HW;
import Seminar6.HW.controller.NoteController;
import Seminar6.HW.model.*;
import Seminar6.HW.view.NoteView;

public class Main {
    public static void main(String[] args) {
        DateMaker dateMaker = new DateMaker();
        NoteMapper noteMapper = new NoteMapper();
        Saver saver = new Saver();
        NoteBookReader nbReader = new NoteBookReader();
        String fileName = "notes.txt";
        NoteManager noteManager = new NoteManager(noteMapper, saver, nbReader, fileName, dateMaker);
        NoteController noteController = new NoteController(noteManager);
        NoteView view = new NoteView(noteController);
        view.run();
    }
}
