import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controller implements Initializable {

    @FXML
    private BorderPane navbar;

    @FXML
    private Circle q0;

    @FXML
    private Button btn_start;

    @FXML
    private Circle q1;

    @FXML
    private Circle q3;

    @FXML
    private Circle q4;

    @FXML
    private Circle q5;

    @FXML
    private Circle q6;

    @FXML
    private Circle q7;

    @FXML
    private Circle q8;

    @FXML
    private Circle q9;

    @FXML
    private Circle q10;

    @FXML
    private Circle q11;

    @FXML
    private Circle q12;

    @FXML
    private Circle q13;

    @FXML
    private Circle q14;

    @FXML
    private Circle q15;

    @FXML
    private Circle q16;

    @FXML
    private Button btn_restart;

    @FXML
    private Circle q17;

    @FXML
    private Circle q18;

    @FXML
    private Circle q19;

    @FXML
    private Circle q20;

    @FXML
    private Button btn_finish;

    @FXML
    private TextField input;

    @FXML
    private Circle q2;

    @FXML
    private Circle q;

    @FXML
    private Circle q22;

    ArrayList<Circle> listaCirculos;

    private void addCircles() {
        listaCirculos.add(q);
        listaCirculos.add(q0);
        listaCirculos.add(q1);
        listaCirculos.add(q2);
        listaCirculos.add(q3);
        listaCirculos.add(q4);
        listaCirculos.add(q5);
        listaCirculos.add(q6);
        listaCirculos.add(q7);
        listaCirculos.add(q8);
        listaCirculos.add(q9);
        listaCirculos.add(q10);
        listaCirculos.add(q11);
        listaCirculos.add(q12);
        listaCirculos.add(q13);
        listaCirculos.add(q14);
        listaCirculos.add(q15);
        listaCirculos.add(q16);
        listaCirculos.add(q17);
        listaCirculos.add(q18);
        listaCirculos.add(q19);
        listaCirculos.add(q20);
        listaCirculos.add(q22);
    }

    @FXML
    void onMouseClickedFinished(Event event) {
        System.exit(1);
    }

    @FXML
    void onMouseClickedRestart(Event event) {
        for (Circle circle : listaCirculos) {
            circle.setFill(Color.BLACK);
        }
    }

    @FXML
    private void onMouseClickedStart(Event event) {
        String text = input.getText();
        String[] words = text.split(" ");
        String circleState = "0";
        boolean datCom1 = false;
        boolean datCom2 = false;
        boolean datCom3 = false;
        boolean datCom4 = false;
        for (int j = 0; j < words.length; j++) {
            Pattern p = Pattern.compile("for");
            Matcher m = p.matcher(words[j]);
            Pattern p1 = Pattern.compile("[(]");
            Matcher m1 = p1.matcher(words[j]);
            Pattern p2 = Pattern.compile("int");
            Matcher m2 = p2.matcher(words[j]);
            Pattern p3 = Pattern.compile(";");
            Matcher m3 = p3.matcher(words[j]);
            Pattern p4 = Pattern.compile("[a-zA-Z]+");
            Matcher m4 = p4.matcher(words[j]);
            Pattern p5 = Pattern.compile("[=]");
            Matcher m5 = p5.matcher(words[j]);
            Pattern p6 = Pattern.compile("[0-9]+");
            Matcher m6 = p6.matcher(words[j]);
            Pattern p7 = Pattern.compile("[<|>](=)*|(!|=)(=)");
            Matcher m7 = p7.matcher(words[j]);
            Pattern p8 = Pattern.compile("[++]|[--]");
            Matcher m8 = p8.matcher(words[j]);
            Pattern p9 = Pattern.compile("[)]");
            Matcher m9 = p9.matcher(words[j]);
            Pattern p10 = Pattern.compile("[{]");
            Matcher m10 = p10.matcher(words[j]);
            Pattern p11 = Pattern.compile("instrucciones");
            Matcher m11 = p11.matcher(words[j]);
            Pattern p12 = Pattern.compile("[}]");
            Matcher m12 = p12.matcher(words[j]);
            if (m.matches() && circleState.equals("0")) {
                // listaCirculos.get(j).setFill(javafx.scene.paint.Color.GREEN);
                q.setFill(javafx.scene.paint.Color.GREEN);
                // listaCirculos.get(j).setFill(javafx.scene.paint.Color.GREEN);
                q0.setFill(javafx.scene.paint.Color.GREEN);
                q1.setFill(javafx.scene.paint.Color.RED);
                circleState = "1";
            } else if (m1.matches() && circleState.equals("1")) {
                q1.setFill(javafx.scene.paint.Color.GREEN);
                q2.setFill(javafx.scene.paint.Color.RED);
                q17.setFill(javafx.scene.paint.Color.RED);
                circleState = "2";
            } else if (m2.matches() && circleState.equals("2")) {
                q2.setFill(javafx.scene.paint.Color.GREEN);
                q3.setFill(javafx.scene.paint.Color.RED);
                circleState = "3";
            } else if (m4.matches() && circleState.equals("3")) {
                q3.setFill(javafx.scene.paint.Color.GREEN);
                q17.setFill(javafx.scene.paint.Color.RED);
                q4.setFill(javafx.scene.paint.Color.RED);
                circleState = "4";
            } else if (m5.matches() && circleState.equals("4")) {
                q4.setFill(javafx.scene.paint.Color.GREEN);
                q5.setFill(javafx.scene.paint.Color.RED);
                circleState = "5";
            } else if (m6.matches() && circleState.equals("5")) {
                q5.setFill(javafx.scene.paint.Color.GREEN);
                q6.setFill(javafx.scene.paint.Color.RED);
                circleState = "6";
            } else if (m3.matches() && circleState.equals("6")) {
                q6.setFill(javafx.scene.paint.Color.GREEN);
                q7.setFill(javafx.scene.paint.Color.RED);
                circleState = "7";
            } else if (m4.matches() && circleState.equals("7")) {
                q7.setFill(javafx.scene.paint.Color.GREEN);
                q8.setFill(javafx.scene.paint.Color.RED);
                circleState = "8";
            } else if (m7.matches() && circleState.equals("8")) {
                q8.setFill(javafx.scene.paint.Color.GREEN);
                q9.setFill(javafx.scene.paint.Color.RED);
                circleState = "9";
            } else if (m6.matches() && circleState.equals("9")) {
                q9.setFill(javafx.scene.paint.Color.GREEN);
                q10.setFill(javafx.scene.paint.Color.RED);
                circleState = "10";
            } else if (m3.matches() && circleState.equals("10")) {
                q10.setFill(javafx.scene.paint.Color.GREEN);
                q11.setFill(javafx.scene.paint.Color.RED);
                circleState = "11";
            } else if (m4.matches() && circleState.equals("11")) {
                q11.setFill(javafx.scene.paint.Color.GREEN);
                q12.setFill(javafx.scene.paint.Color.RED);
                circleState = "12";
            } else if ((words[j].equals("++") || words[j].equals("--")) && circleState.equals("12")) {
                q12.setFill(javafx.scene.paint.Color.GREEN);
                q22.setFill(javafx.scene.paint.Color.RED);
                circleState = "13";
            } else if (m9.matches() && circleState.equals("13")) {
                q22.setFill(javafx.scene.paint.Color.GREEN);
                q13.setFill(javafx.scene.paint.Color.RED);
                circleState = "14";
            } else if (m10.matches() && circleState.equals("14")) {
                q13.setFill(javafx.scene.paint.Color.GREEN);
                q14.setFill(javafx.scene.paint.Color.RED);
                circleState = "15";
            } else if (m11.matches() && circleState.equals("15")) {
                q14.setFill(javafx.scene.paint.Color.GREEN);
                q15.setFill(javafx.scene.paint.Color.RED);
                circleState = "16";
            } else if (m3.matches() && circleState.equals("16")) {
                q15.setFill(javafx.scene.paint.Color.GREEN);
                q16.setFill(javafx.scene.paint.Color.RED);
                circleState = "17";
            } else if (m12.matches() && circleState.equals("17")) {
                q16.setFill(javafx.scene.paint.Color.GREEN);
                circleState = "18";
            } else if (m3.matches() && circleState.equals("2")) {
                q17.setFill(javafx.scene.paint.Color.GREEN);
                q18.setFill(javafx.scene.paint.Color.GREEN);
                q19.setFill(javafx.scene.paint.Color.RED);
                q7.setFill(javafx.scene.paint.Color.RED);
                circleState = "7";
            } else if (m3.matches() && circleState.equals("7")) {
                q19.setFill(javafx.scene.paint.Color.GREEN);
                q20.setFill(javafx.scene.paint.Color.GREEN);
                q11.setFill(javafx.scene.paint.Color.RED);
                q22.setFill(javafx.scene.paint.Color.RED);
                circleState = "11";
            } else if (m9.matches() && circleState.equals("11")) {
                q22.setFill(javafx.scene.paint.Color.GREEN);
                q13.setFill(javafx.scene.paint.Color.RED);
                circleState = "14";
            }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        listaCirculos = new ArrayList<>();
        addCircles();
    }

    // for ( int a = 0 ; a < 2 ; i ++ ) { instrucciones             -READY
    // for ( int a = 0 ; a < 2 ; )                                  -READY
    // for ( int a = 0 ; ; i ++ )                                   -READY
    // for ( int a = 0 ; ; )                                        -READY
    // for ( ; a < 2 ; i ++ )                                       -READY
    // for ( ; a < 2 ; )                                            -READY
    // for ( ; ; i ++ )                                             -READY
    // for ( ; ; )                                                  -READY
}
