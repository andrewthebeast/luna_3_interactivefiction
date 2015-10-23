package Luna_3_methodsmadness;

import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.canvas.Canvas; 
import javafx.scene.canvas.GraphicsContext; 
import javafx.scene.paint.Color; 
import javafx.scene.shape.ArcType; 
import javafx.stage.Stage;

 public class Luna_3_methodsmadness extends Application {

public static void main(String[] args) { 
    launch(args); 
}

@Override 
public void start(Stage primaryStage) { 
    primaryStage.setTitle("Drawing Operations Test"); 
    Group root = new Group(); 
    Canvas canvas = new Canvas(300, 380); 
    GraphicsContext gc = canvas.getGraphicsContext2D();
    drawHead(gc); 
    drawMask2(gc); 
    drawMask(gc); 
    drawCircle(gc); 
    drawFace(gc); 
    drawEyes(gc); 
    drawArcs(gc); 
    drawStress(gc); 
    drawEyebrows(gc); 
    root.getChildren().add(canvas); 
    primaryStage.setScene(new Scene(root)); 
    primaryStage.show(); }

private void drawHead(GraphicsContext gc) { 
    gc.setFill(Color.rgb(105, 105, 105));
    gc.fillOval(60, 60, 150, 150); 
} 
private void drawCircle(GraphicsContext gc) { 
    gc.setStroke(Color.BLACK); 
    gc.strokeOval(60, 60, 150, 150); 
}

private void drawMask(GraphicsContext gc) { 
    gc.setStroke(Color.BLACK); 
    gc.setLineWidth(1); 
    gc.strokeArc(63, 95, 145, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(63, 130, 144, 50, 0, -180, ArcType.OPEN); 
}

private void drawMask2(GraphicsContext gc) { 
    gc.setStroke(Color.rgb(255, 255, 240)); 
    gc.strokeArc(63, 96, 145, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(63, 97, 145, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(63, 98, 145, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(63, 99, 145, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(63, 100, 145, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(62, 100, 146, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(62, 101, 146, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(62, 102, 146, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(62, 103, 146, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(62, 104, 146, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(62, 105, 146, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(61, 105, 147, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(61, 106, 147, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(61, 107, 147, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(61, 108, 147, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(61, 109, 147, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(61, 109, 147, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(61, 110, 147, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(60, 110, 148, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(60, 111, 148, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(60, 112, 148, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(60, 113, 148, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(60, 114, 148, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(60, 115, 148, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(61, 115, 147, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(61, 116, 147, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(61, 117, 147, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(61, 118, 147, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(61, 119, 147, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(61, 120, 147, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(62, 120, 146, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(62, 121, 146, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(62, 122, 146, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(62, 123, 146, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(62, 124, 146, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(62, 125, 146, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(63, 125, 145, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(63, 126, 145, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(63, 127, 145, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(63, 128, 145, 50, 0, -180, ArcType.OPEN); 
    gc.strokeArc(63, 129, 145, 50, 0, -180, ArcType.OPEN);

} 
public void drawFace(GraphicsContext gc) { 
    gc.setFill(Color.BLACK); 
    gc.setStroke(Color.BLACK); 
    gc.setLineWidth(1); 
    gc.fillOval(105, 150, 10, 20); 
    gc.fillOval(145, 150, 10, 20); 
    gc.strokeOval(105, 150, 10, 20); 
    gc.strokeOval(145, 150, 10, 20); 
} 
public void drawEyes(GraphicsContext gc) { 
    gc.setFill(Color.rgb(255, 255, 240)); 
    gc.fillOval(110, 152, 4, 9); 
    gc.fillOval(150, 151, 4, 9); 
} 
private void drawArcs(GraphicsContext gc) { 
    gc.setStroke(Color.BLACK); 
    gc.setLineWidth(2); 
    gc.strokeArc(145, 170, 15, 3, 0, 180, ArcType.OPEN); 
} 
public void drawStress(GraphicsContext gc) { 
    gc.setStroke(Color.BLACK); gc.setLineWidth(1); 
    gc.strokeArc(160, 151, 4, 5, 0, 90, ArcType.OPEN); 
    gc.strokeArc(158, 162, 5, 6, 0, 75, ArcType.OPEN); 
    gc.strokeArc(95, 157, 5, 6, 0, -55, ArcType.OPEN); 
} 
private void drawEyebrows(GraphicsContext gc) { 
    gc.setFill(Color.BLACK); 
    gc.setStroke(Color.BLACK); 
    gc.setLineWidth(2); 
    //gc.strokePolygon(new double[]{108, 95, 80}, 
                    //new double[]{144, 95, 90}, 3); 
    gc.fillPolygon(new double[]{108, 90, 70}, 
            new double[]{143, 95, 90}, 3); 
    gc.fillPolygon(new double[]{155, 175, 185}, 
            new double[]{148, 80, 90}, 3); 
    gc.strokeArc(109, 145, 8, 3, 0, -180, ArcType.OPEN); 
    gc.strokeArc(147, 145, 7, 3, 0, -180, ArcType.OPEN);

} 
 }
