package sve.gui;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import sve.core.Animal;
import sve.core.Point2D;

import static sve.gui.helperMethods.randomlyLocationX;
import static sve.gui.helperMethods.randomlyLocationY;

public class AnimalCreator {
    public AnimalCreator(Stage stage, Group gameDisplay, Animal animal, Point2D<Integer> location){
        String imagePath = animal.pathTo(RenderTypes.ICON);

        ImageView imageView = new ImageView(new Image(imagePath));
        StatsPopup popup = new StatsPopup(animal.getClass().getSimpleName());
        Label label = new Label("?");
        label.setId("animalLabel");
        VBox vBox = new VBox(label);
        vBox.setTranslateX(/*location.x*/randomlyLocationX(1280));
        vBox.setTranslateY(/*location.y*/randomlyLocationY(960));
        vBox.getChildren().add(imageView);
        vBox.setAlignment(Pos.CENTER);

        imageView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (!popup.isShowing()){
                    popup.show(stage);
                }
            }
        });

        gameDisplay.getChildren().addAll(vBox);
    }
}
