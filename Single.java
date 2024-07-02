package OOPS;
class Travels
{
    public  void Buname()
    {
        String BusName="NaveenTravles";
        String Route="Salem to Coimbatore";
        System.out.println("The Travels name :"+BusName);
        System.out.println("The Route :"+Route);
    }

}
class Driver extends Travels
{
    public void Drivers_details()
    {
        String D_name="Kumar";
        Long Phn_no=9858784564l;
        System.out.println("Driver_name:"+D_name);
        System.out.println("Contact NO:"+Phn_no);


    }
}



public class Single {
    public static void main(String[] args) {
        Driver DD=new Driver();
        DD.Buname();
        DD.Drivers_details();

    }
}
