package lat73;

//****************************************************
// Firm.java 		Author: Lewis/Loftus
//
// Demonstrates polymorphism via inheritance.
//****************************************************
public class Firm 
{

    //----------------------------------------------------------------------------
    //  Creates a staff of empolyees for a firm and pays them.
    //----------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        Staff personnel = new Staff();
        
        personnel.payday();
    }
}
