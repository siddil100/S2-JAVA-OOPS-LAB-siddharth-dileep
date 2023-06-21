class First
{            //single inheritance
	int empid;
	String name;
	int salary;
	String address;
	public void get(int a,String b,int c,String d)
	{
		empid=a;
		name=b;
		salary=c;
		address=d;
		System.out.println(name);
	}
		
}

class Teacher extends First
{
	String department;
	String subject;
	public void put(String c)
	{
		subject=c;
		System.out.println(subject);
	}
		
	public static void main(String[] args)
	{
		Teacher t=new Teacher();
		t.get(10,"sid",1000,"urumbil");
		t.put("commerce");
}
}


