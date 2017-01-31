
/**
 * Class to compute price and configuration of desk.
 * 
 * @author John Bloswick
 * @version 1.0
 */
public class Desk
{   
    private int deskLength, deskWidth, numDrawers, orderNum, finalPrice;
    private String woodType, customerName;
    
    public Desk(int length, int width, int drawers, int order, String wood, String name)
    {
        deskLength = length;
        deskWidth = width;
        numDrawers = drawers;
        orderNum = order;
        woodType = wood;
        customerName = name;       
        calculateFinalPrice();
    }
    
    public void printReceipt() 
    {
     System.out.println("Order Number: " + orderNum + "\nCustomer Name: " + customerName + "\nWood Type: " + woodType + "\nDesk Dimensions: " + deskLength + " X " + deskWidth + "\nDesk Drawers: " + numDrawers + "\nFinal Price: $" + finalPrice);           
    }
    
    private void calculateFinalPrice()
    {
        int minCharge = 200, bigDeskCharge = 50, mahoganyCharge = 150, oakCharge = 125, extraDrawerCharge = 30;
        
        finalPrice = 0;
        finalPrice += minCharge;
        
        if (deskLength * deskWidth > 750)
        {
            finalPrice += bigDeskCharge;
        }
        if (woodType == "mahogany")
        {
            finalPrice += mahoganyCharge;
        }
        else if (woodType == "oak")
        {
            finalPrice += oakCharge;
        }
        if (numDrawers > 0)
        {
            finalPrice += numDrawers * extraDrawerCharge;
        }        
    }
}
