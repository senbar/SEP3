package view.user.dashBoard;

import controller.user.dashBoard.dashBoardController;
import javafx.event.ActionEvent;

public class dashBoardGUI implements dashBoardView {

    public dashBoardGUI() {
        dashBoardController view = new dashBoardController(this);
    }

    public void testBtnPressed(ActionEvent actionEvent) {
        System.out.println("Test button pressed");
    }
}
