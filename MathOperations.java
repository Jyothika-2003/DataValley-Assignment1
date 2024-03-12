class MathOperations
{
	public void add(int n1,int n2)
	{
	    System.out.println(n1+n2);
	}
	public void add(double n1,double n2,double n3)
	{
	    System.out.println(n1+n2+n3);
	}
	public void add(String s1,String s2)
	{
	    System.out.println(s1+s2);
	}
	public static void main(String args[])
	{
		MathOperations obj = new MathOperations();
		obj.add(12,100);
		obj.add(12.4,36.987,97.65);
		obj.add("concatenating ","strings");
	}
}
