import javafx.application.*;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane; 
public class OceanExplorer extends Application{
	final int dimension = 10;
	final int scale = 50;
	boolean[][] oceanGrid = new boolean[10][10];
	OceanMap oceanMap = new OceanMap();
	
	public OceanExplorer() {
		oceanGrid = oceanMap.getMap();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

	@Override
	public void start(Stage oceanStage) throws Exception {
		// TODO Auto-generated method stub
		AnchorPane myPane = new AnchorPane();
		Scene scene = new Scene(myPane);	
		oceanStage.setScene(scene);
		oceanStage.setTitle("My Island");
		oceanStage.show();
		drawMap(myPane);
	}
	
	public void drawMap(AnchorPane myPane) {
		for(int x = 0; x < dimension; x++){
			 for(int y = 0; y < dimension; y++){
			 Rectangle rect = new Rectangle(x*scale,y*scale,scale,scale);
			rect.setStroke(Color.BLACK); // We want the black outline
			rect.setFill(Color.PALETURQUOISE); // I like this color better than BLUE
			myPane.getChildren().add(rect); // Add to the node tree in the pane
			}
			}
	}

}

