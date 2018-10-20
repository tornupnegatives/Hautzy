package hautzy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private RadioButton V1_Radio;
    @FXML
    private RadioButton V2_Radio;
    @FXML
    private RadioButton V3_Radio;
    @FXML
    private TextField Angle_Field;
    @FXML
    private TextField Distance_Field;
    @FXML
    private Button Calc_Button;

    private ToggleGroup group;
    private RadioButton rb;
    private String s;

    Calc calc;


        /** GENERATES MESSAGE WHEN GO BUTTON IS PRESSED */
        public void calculate(ActionEvent event) throws Exception {

            configRadio();


            if(V1_Radio.isSelected())
                calc = new Calc(1, Integer.parseInt(Angle_Field.getText()));

            else if(V2_Radio.isSelected())
                calc = new Calc(2, Integer.parseInt(Angle_Field.getText()));

            else if(V3_Radio.isSelected())
                calc = new Calc(3, Integer.parseInt(Angle_Field.getText()));

            Distance_Field.setText(calc.getDistance() + " meters");
        }

        public void configRadio() {
            group = new ToggleGroup();

            V1_Radio.setToggleGroup(group);

            V2_Radio.setToggleGroup(group);

            V3_Radio.setToggleGroup(group);
        }

        // @Override
        public void initialize(URL location, ResourceBundle resources) {

        }
    }
