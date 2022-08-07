import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.web.WebView;

public class InternetAccessItaly extends Application 
{
    public static void main(String[] args) 
    {
        launch(args);
    }
    public void start(final Stage primaryStage)
    {
        final WebView wv = new WebView();
        wv.getEngine().load("https://tradingeconomics.com/italy/stock-market");
        primaryStage.setScene(new Scene(wv));
        primaryStage.show();
    }
}
