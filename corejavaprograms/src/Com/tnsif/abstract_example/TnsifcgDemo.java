package Com.tnsif.abstract_example;

public class TnsifcgDemo {
	
	public static void main(String[] args)
	{
		Trainer t= new TechTrainer();
		
		t.session();
		t.checks();
		
		t=new SoftSkillTrainer();
		
		t.session();
		t.checks();
	}

}
