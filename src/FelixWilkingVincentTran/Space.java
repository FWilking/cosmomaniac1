package FelixWilkingVincentTran;

public class Space extends Boardobject{
    private String blank;
    private int spaceX;
    private int spaceY;

    public Space(String blank, int spaceX, int spaceY)
    {
        this.blank = blank;
        this.spaceX = spaceX;
        this.spaceY = spaceY;
    }

    public void setspaceX(int xLoc)
    {
        this.spaceX = spaceX;
    }

    public void setspaceY(int yLoc)
    {
        this.spaceY = spaceY;
    }

    public String getName()
    {
        return blank;
    }

    public int getspaceX()
    {
        return spaceX;
    }

    public int getspaceY()
    {
        return spaceY;
    }

}