import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Empoyee> l = new ArrayList<Empoyee>();

		l.add(new Empoyee("balla", 1));

		l.add(new Empoyee("balla2", 2));
		l.add(new Empoyee("balla2", 2));
		l.add(new Empoyee("balla3", 3));
		l.add(new Empoyee("balla", 1));
	     
		
	 	Map<Integer, Empoyee> collect = l.stream().collect(Collectors.toMap(Empoyee::getId,emp -> emp,(existingValue, newValue) -> newValue));
	 	List<Empoyee> collect2 = collect.entrySet().stream().map(m -> m.getValue()).collect(Collectors.toList());
 
	 	
	 	System.out.println(collect2);
 
	}

}

class Empoyee {
	private String name;
	private Integer id;

	public Empoyee(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}

	public Empoyee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Empoyee [name=" + name + ", id=" + id + "]";
	}

}