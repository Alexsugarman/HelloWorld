public class Car //
{
	public Car()
	{
		model = null;
		year = 0;
		price = 0;
		options = null;
	}
	public Car(String aModel, int aYear, int aPrice, Option aOptions)
	{
		model = aModel;
		year = aYear;
		price = aPrice;
		options = aOptions;
		price += options.getCount() * 100;
	}
	public void setModel(String aModel)
	{
		model = aModel;
	}
	public void setYear(int aYear)
	{
		year = aYear;
	}
	public void setPrice(int aPrice)
	{
		price = aPrice;
		price += options.getCount() * 100;
	}
	public void setOptions(Option aOptions)
	{
		options = aOptions;
	}
	public String getModel()
	{
		return model;
	}
	public int getYear()
	{
		return year;
	}
	public int getPrice()
	{
		return price;
	}
	public String getInfo()
	{
		return model + " of  " + year + " costs " + price + " dollars."; 
	}
	
	private String model;
	private int year;
	private int price;
	private Option options;
}
