package controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class MainFormController {

    @FXML
    private TableView<?> tableAuthor;

    @FXML
    private TableColumn<?, ?> colAuthorId;

    @FXML
    private TableColumn<?, ?> colAuthorName;

    @FXML
    private TableColumn<?, ?> colCountry;

    @FXML
    private TableColumn<?, ?> colCount;

    @FXML
    private TableView<?> tableBooks;

    @FXML
    private TableColumn<?, ?> colBookId;

    @FXML
    private TableColumn<?, ?> colBookName;

    @FXML
    private TableColumn<?, ?> colBookYear;

    @FXML
    private TableColumn<?, ?> colBookPrice;

    @FXML
    private TextField txtAuthorName;

    @FXML
    private JFXComboBox<?> comboBooks;

    @FXML
    private JFXComboBox<?> comboAuthors;

    @FXML
    private TextField txtBookName;

    @FXML
    private TextField txtBookYear;

    @FXML
    private TextField txtBookPrice;

    @FXML
    private Label labelPrice;

    @FXML
    private Button countBtn;

    @FXML
    private Button saveAuthorBtn;

    @FXML
    private Button deleteAuthorBtn;

    @FXML
    private Button saveBookBtn;

    @FXML
    private Button searchByCountryBtn;

    @FXML
    private Button increase;

    @FXML
    private Button viewAuthorsBtn;

    @FXML
    private TextField txtAuthorCountry;

    @FXML
    private Button after2010Btn;

    @FXML
    private JFXComboBox<?> comboCountry;

    @FXML
    void ComboBookOnAction(ActionEvent event) {

    }

    @FXML
    void after2010BtnOnAction(ActionEvent event) {

    }

    @FXML
    void comboAuthorOnAction(ActionEvent event) {

    }

    @FXML
    void countButtonOnAction(ActionEvent event) {

    }

    @FXML
    void deleteAuthorBtnOnAction(ActionEvent event) {

    }

    @FXML
    void increaseButtonOnAction(ActionEvent event) {

    }

    @FXML
    void saveAuthorBtnOnAction(ActionEvent event) {

    }

    @FXML
    void saveBookBtnOnAction(ActionEvent event) {

    }

    @FXML
    void searchByCountryButtonOnAction(ActionEvent event) {

    }

    @FXML
    void viewAuthorsBtnOnAction(ActionEvent event) {

    }

}
