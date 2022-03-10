package Proyecto;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;

public class Grafico extends Application{


/** 
 * @param primaryStage
 */
public void start(Stage primaryStage) {
    
    CategoryAxis yAxis = new CategoryAxis();
    yAxis.setLabel("Palabras"); NumberAxis xAxis = new NumberAxis();
    xAxis.setLabel("Frecuencia");
    BarChart<Number, String> chart = new BarChart<Number, String>(xAxis, yAxis);
    chart.setTitle("10 usuarios mas famosos");
    // agregamos datos
    chart.setData(obtenerDatos());
    // Paneles
    StackPane root = new StackPane();
    root.getChildren().add(chart);
    // Tamaño del Frame
    Scene scene = new Scene(root, 640, 427); primaryStage.setTitle("Prueba MFg");
    primaryStage.setScene(scene);
    primaryStage.show();
}

/** 
 * @return ObservableList<Series<Number, String>>
 */
@SuppressWarnings("unchecked")
public static ObservableList<XYChart.Series<Number, String>> obtenerDatos() {
    
    XYChart.Series<Number, String> frecuenciasPalabras = new XYChart.Series<>();
    Principal pl = new Principal();
    pl.OrdenadorDatos();
    frecuenciasPalabras.setName("Cantidad Palabras");
    for(int i=0;i<pl.getCont().size();i++){
    frecuenciasPalabras.getData().addAll(
    new XYChart.Data<>(pl.getCont().get(i),pl.getList2().get(i))); 
}

    ObservableList<XYChart.Series<Number, String>> data = FXCollections.observableArrayList();
    data.addAll(frecuenciasPalabras); return data;
    }
}