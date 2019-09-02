package task_5;

import java.util.HashMap;
import java.util.Map;

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
	Project project=new Project(1,"java","1-aug-19","IBM");
	Employees employees =new Employees(2,"vinod",123,"junior");
	Project project1=new Project(1,"java","1-aug-19","IBM");
	Employees employees1 =new Employees(2,"vinod",123,"junior");
	
	Map<Employees,Project> map=new HashMap<>();
	System.out.println(employees.equals(employees1));
	map.put(employees1, project1);
	map.put(employees, project);
	System.out.println(map);
}
}
