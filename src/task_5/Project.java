package task_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Project {
	private int pcode;
	private String ptitle,duration,clientname;
	public Project(int pcode, String ptitle, String duration, String clientname) {
		super();
		this.pcode = pcode;
		this.ptitle = ptitle;
		this.duration = duration;
		this.clientname = clientname;
	}
	
@Override
	public String toString() {
		return "Project [pcode=" + pcode + ", ptitle=" + ptitle + ", duration="
				+ duration + ", clientname=" + clientname + "]";
	}

public static void main(String[]args)
{
	Map<Employees,Project> map=new HashMap<>();
	int i=0;
	Scanner sc=new Scanner(System.in);
	while(i<3){
	System.out.println("please enter employyeno empname salary  destination ");
	Employees employees =new Employees(sc.nextInt(),sc.next(),sc.nextInt(),sc.next());
	
	System.out.println(" please enter  projectcode,  projecttitle, duration,clientname in that order ");
	
	Project project=new Project(sc.nextInt(),sc.next(),sc.next(),sc.next());
	Employees employees1 =new Employees(2,"vinod",123,"junior");
	
	//Map<Employees,Project> map=new HashMap<>();
	System.out.println(employees.equals(employees1));
	map.put(employees, project);
	
i++;
}
	System.out.println(map);
}
}
