class TestEncapsulation
{

	public static void main(String[] args)
	{
		// creating object of class EncapsulationExample
		EncapsulationExample a=new EncapsulationExample();
		// object is used to access the methods of a class
		a.setId(1);
        a.setAge(21);
		a.setName("Akanksha");
		System.out.println("Id:"+a.getId()+"\n"+"Age:"+a.getAge()+"\n"+"Name:"+a.getName());

	}

}
