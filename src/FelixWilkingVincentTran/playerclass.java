package FelixWilkingVincentTran;

public class playerclass extends Boardobject {
    private String name;
    int xLoc;
    int yLoc;

    public playerclass(String name, int xLoc, int yLoc){
        this.name = name;
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }

    public void setxLoc(int xLoc)
    {
        this.xLoc = xLoc;
    }

    public void setyLoc(int yLoc)
    {
        this.yLoc = yLoc;
    }

    public String getName()
    {
        return name;
    }

    public int getxLoc()
    {
        return xLoc;
    }

    public int getyLoc()
    {
        return yLoc;
    }

    public void printPlayerCurrentLocation()
    {
        System.out.println("Your current location is (" + getxLoc() + "," + getyLoc() + ")");
    }


}
