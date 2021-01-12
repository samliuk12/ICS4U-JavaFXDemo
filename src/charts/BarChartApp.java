/* ....Show License.... */
package charts;
 
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.stage.Stage;
 
 
/**
 * A chart that displays rectangular bars with heights indicating data values
 * for categories. Used for displaying information when at least one axis has
 * discontinuous or discrete data.
 */
public class BarChartApp extends Application {
 
    private BarChart chart;
    private CategoryAxis xAxis; // Axis of categories
    private NumberAxis yAxis;
 
    public Parent createContent() {
        String[] years = {"2007", "2008", "2009"};
        xAxis = new CategoryAxis();
        xAxis.setCategories(FXCollections.<String>observableArrayList(years));
        yAxis = new NumberAxis("Units Sold", 0.0d, 3000.0d, 1000.0d); // Title, start, end, increment
        ObservableList<BarChart.Series> barChartData =
            FXCollections.observableArrayList(
              new BarChart.Series("Apples", FXCollections.observableArrayList( // Series = one type of data
                new BarChart.Data(years[0], 567d), // Data = specific plot point
                new BarChart.Data(years[1], 1292d),
                new BarChart.Data(years[2], 1292d))),
              new BarChart.Series("Lemons", FXCollections.observableArrayList(
                new BarChart.Data(years[0], 956),
                new BarChart.Data(years[1], 1665),
                new BarChart.Data(years[2], 2559))),
              new BarChart.Series("Oranges", FXCollections.observableArrayList(
                new BarChart.Data(years[0], 1154),
                new BarChart.Data(years[1], 1927),
                new BarChart.Data(years[2], 2774)))
            );
        chart = new BarChart(xAxis, yAxis, barChartData); // Axis object, axis object, data object
        return chart;
    }
 
    @Override public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }
 
    /**
     * Java main for when running without JavaFX launcher
     */
    public static void main(String[] args) {
        launch(args);
    }
}