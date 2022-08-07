import java.awt.*;   //allows use of Color class
import java.applet.*;   //allows use of Color class

public class Train_Client extends Applet
{
   public void paint (Graphics g)
   {
      // BoxCar box = new BoxCar (100, 100);
      // box.drawBoxCar(g);
      
      //Caboose bo1x = new Caboose (100, 100);
      //bo1x.drawCaboose(g);
      
      //LocoMotive b = new LocoMotive (100, 100);
      //b.drawLocoMotive(g);
      
      AssembleTrain t1 = new AssembleTrain (100,100,10);
      t1.assembleTrain(g);
   }
}