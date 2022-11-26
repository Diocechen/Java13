package myJava13;
class RadiusTooLarge extends Exception  
{
}
class RadiusIsNegative extends Exception
{
}

class CCircle
{
   private double radius;
   public void setRadius(double r) throws RadiusTooLarge,RadiusIsNegative
   {
      if(r<0)
      {
         throw new RadiusIsNegative();
      }else if(r>100) {
    	 throw new RadiusTooLarge();
      }
      else
         radius=r;
   }

   public void show()
   {
      System.out.println("area="+3.14*radius*radius);
   }
}
public class Class10 {

	public static void main(String[] args) {
		CCircle cir=new CCircle();
	    try
	    {
	       cir.setRadius(-100.0);
	    }
	    catch(RadiusIsNegative e)
	    {
	       System.out.println(e+" throwed");
	    }
	    catch(RadiusTooLarge e){
	    	System.out.println(e+" throwed");
	    }
	    cir.show();
	}

}