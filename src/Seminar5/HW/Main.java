package Seminar5.HW;

import Seminar5.HW.controllers.UserController;
import Seminar5.HW.model.FileOperation;
import Seminar5.HW.model.FileOperationImpl;
import Seminar5.HW.model.Repository;
import Seminar5.HW.model.RepositoryFile;
import Seminar5.HW.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        UserController controller = new UserController(repository);
        ViewUser view = new ViewUser(controller);
        view.run();
    }
}
