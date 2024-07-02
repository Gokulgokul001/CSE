package basic;

public class Hotel extends meels implements OOPS.multiple.lunch,morningtiffen, OOPS.multiple.nightdinner {
    @Override
    public void Lunch() {
        System.out.println("briyani");

    }

    @Override
    public void Morningtiffen() {
        System.out.println("idly");
    }

    @Override
    public void Nightdinner() {
        System.out.println("chappathi");
    }
    public static void main(String[] args) {
        Hotel obj=new Hotel();
        obj.Lunch();
        obj.Morningtiffen();
        obj.Nightdinner();
        obj.Meels();
    }
}