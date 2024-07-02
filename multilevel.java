package oops;
class college
{
    public void studentdetails()
    {
        String studentname="dharaneesh";
        String rollno="22CS063";
        System.out.println("student details"+studentname);
        System.out.println("roll no"+rollno);
    }
}
class semester extends college
{
    public void result()
    {
        int percentage=80;
        float cgpa=45.5f;
        System.out.println("the result"+percentage);
        System.out.println("cgpa"+cgpa);
    }
}
class fees extends semester
{
    public void collegefees()
    {
        int semester_fees=90000;
        int busfees=4500;
        System.out.println("the college fees"+semester_fees);
        System.out.println("student bus fees"+busfees);
    }
}
public class multilevel {
    public static void main(String[] args) {
    fees ff=new fees();
    ff.studentdetails();
    ff.result();
    ff.collegefees();
}
}
