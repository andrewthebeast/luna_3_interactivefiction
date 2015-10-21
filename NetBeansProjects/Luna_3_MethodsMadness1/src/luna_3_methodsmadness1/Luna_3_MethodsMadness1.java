
package luna_3_methodsmadness1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Luna_3_MethodsMadness1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(300, 380);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        //drawShapes2(gc);
        drawShapes(gc);
        drawShapes2(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.rgb(105, 105, 105));
        gc.setStroke(Color.BLACK);
        gc.fillOval(60, 60, 150, 150);
        gc.strokeOval(60, 60, 150, 150);
            
    }
    private void drawShapes2(GraphicsContext gc) {
        gc.setStroke(Color.BLACK);
        gc.strokeArc(60, 60, 30, 60, 65, 60, ArcType.OPEN);
}
}