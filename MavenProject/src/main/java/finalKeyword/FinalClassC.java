package finalKeyword;

  class FinalClassC extends  FinalClassP//bcoz the class FinalClassP is declared as Final
 {
	 void display()
		{
			System.out.println("The car is Red colour");
		}

	public static void main(String[] args) 
	{
		FinalClassC obj=new FinalClassC();
		obj.print();
		obj.display();
		
	}

}
