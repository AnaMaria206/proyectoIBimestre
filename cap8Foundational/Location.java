package cap8Foundational;

public class Location {
	private String address;
    private int capacity;
    private double pricePerDay;
    
    public final String getAddress()
    {
        return address;
    }
    
    public final void setAddress(String address)
    {
        this.address = address;
    }
    
    public final int getCapacity()
    {
        return capacity;
    }
    
    public final void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }
    
    public final double getPricePerDay()
    {
        return pricePerDay;
    }
    
    public final void setPricePerDay(double pricePerDay)
    {
        this.pricePerDay = pricePerDay;
    }
    
    public String toString()
    {
        return this.getClass().getSimpleName() + " " +
        getAddress() + " holds " + getCapacity() + " and costs " +
        getPricePerDay() + " per day";
    }
    public boolean equals (Object object)
    {
        if (object == null ||
            ! (object.getClass() .equals(this.getClass())))
        {
            return false;
        }
        Location other = (Location)object;
        if (getAddress() == other.getAddress() &&
            getCapacity() == other.getCapacity() &&
            getPricePerDay() == other.getPricePerDay())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public int hashCode()
    {
        return getAddress() .hashCode() + getCapacity() +
            (int)getPricePerDay();
    }
    
}
