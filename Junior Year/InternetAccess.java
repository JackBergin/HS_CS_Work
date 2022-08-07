import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.web.WebView;

public class InternetAccess extends Application 
{
    //Allows for the following variables to be accessable for the entire class
    static String month = ""; 
    static String day = ""; 
    static String year = ""; 
    static String stockName = "";
    
    public static void main(String[] args) 
    {
        
        //Inputs the specific date and type of stock that one wants to access
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! This is the API Algorithm finder!");
        System.out.println("Enter in the month, then day, then year you want and the stock that you want: ");
        month = input.nextLine();
        day = input.nextLine();
        year = input.nextLine();
        stockName = input.nextLine();
        
        //Launches the website and the start method.
        launch(args);
    }

    
    public void start(final Stage primaryStage)
    {
        //Creates the new object
        final WebView api = new WebView();
        
        //URL we are altering
        api.getEngine().load("https://quantprice.herokuapp.com/api/v1.1/scoop/period?tickers="+stockName+"&begin="+year+"-"+month+"-"+day);
      
        //Working URL of the API: https://quantprice.herokuapp.com/api/v1.1/scoop/period?tickers=AAPL&begin=2018-06-01
        primaryStage.setScene(new Scene(api));
        primaryStage.show();
    }
}
