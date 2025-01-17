package personal;

import personal.controllers.UserController;
import personal.model.FileOperation;
import personal.model.FileOperationImpl;
import personal.model.Repository;
import personal.model.RepositoryFile;
import personal.views.ViewUser;
import personal.utils.Validate;
public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository, validate);
        ViewUser view = new ViewUser(controller, validate);

        view.run();
    }
}


//package personal;
//
//        import personal.controllers.UserController;
//        import personal.model.*;
//        import personal.utils.Validate;
//        import personal.views.ViewUser;
//
//public class Main {
//
//    public static void main(String[] args) {
//        FileOperation fileOperation = new FileOperationJSON("users.txt");
//        Repository repository = new RepositoryFileJSON(fileOperation, new UserMapperJSON());
//        Validate validate = new Validate();
//        UserController controller = new UserController(repository,validate);
//        ViewUser view = new ViewUser(controller, validate);
//        view.run();
//    }
//}


//import personal.controllers.UserController;
//        import personal.model.FileOperation;
//        import personal.model.FileOperationImpl;
//        import personal.model.Repository;
//        import personal.model.RepositoryFile;
//        import personal.utils.Validate;
//        import personal.views.ViewUser;
//
//public class Main {
//    public static void main(String[] args) {
//        FileOperation fileOperation = new FileOperationImpl("users.txt");
//        Repository repository = new RepositoryFile(fileOperation);
//        Validate validate = new Validate();
//        UserController controller = new UserController(repository, validate);
//        ViewUser view = new ViewUser(controller, validate);
//
//        view.run();
//    }
//}