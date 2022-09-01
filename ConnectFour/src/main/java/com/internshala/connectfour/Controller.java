package com.internshala.connectfour;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

	private static final int COLUMN = 7;
	private static final int ROW = 6;

	private static final int CIRCLE_DIAMETER = 80;

	private static String PLAYER_ONE = "Player One";
	private static String PLAYER_TWO = "Player Two";

	private static final String discColor1 = "#24303E";
	private static final String discColor2 = "#4CAABB";

	private boolean isPlayerOneTurn = true;

	@FXML
	public GridPane rootGridPane;
	@FXML
	public Pane insertedDiscsPane;
	@FXML
	public Label playerNameLabel;

	public void createPlayground(){
		Shape rectangleWithHoles = new Rectangle(COLUMN*CIRCLE_DIAMETER,ROW*CIRCLE_DIAMETER);

		Circle circle = new Circle();
		circle.setRadius(CIRCLE_DIAMETER/2);
		circle.setCenterX(CIRCLE_DIAMETER/2);
		circle.setCenterY(CIRCLE_DIAMETER/2);

		rectangleWithHoles = Shape.subtract(rectangleWithHoles,circle);
		rectangleWithHoles.setFill(Color.WHITE);
		rootGridPane.add(rectangleWithHoles,0,1);



		rectangleWithHoles.setFill(Color.WHITE);
		rootGridPane.add(rectangleWithHoles,0,1);
	}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {

	}
}