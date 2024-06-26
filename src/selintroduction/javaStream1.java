package selintroduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;





public class javaStream1 {

	//@Test

	public void regular()

		{

		ArrayList<String> names = new ArrayList<String>();

		names.add("Aarav");

		names.add("Anubhuti");

		names.add("Bhumi");

		names.add("Akshatagowda");



		int count = 0;



		for(int i=0;i<names.size();i++)

		{

		String actuals = names.get(i);

		if(actuals.startsWith("A"))

		{

		count++;

		}

		}

		System.out.println(count);
		}
	
//@Test
public void stremFilter() {
	
	
	ArrayList<String> names = new ArrayList<String>();

	names.add("Aarav");
	names.add("Anubhuti");
	names.add("Bhumi");
	names.add("Akshatagowda");
long c=	names.stream().filter(s->s.startsWith("A")).count();
System.out.println(c);
long d=	Stream.of("Aarav","Anubhuti","Bhumi","Akshatagowda").filter(s->
{
	s.startsWith("A");
return true;
}).count();
System.out.println(d);
//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));

names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));



}





//@Test
public void streamMap() {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Ahmed");
	names.add("Mohmed");
	names.add("Marwan");
	names.add("Ali");
	
	List<String> names1=Arrays.asList("Azrav","Anubhuti","Bhumi","Akshatagowda","Rama");
	
	Stream.of("Aarav","Anubhuti","Bhumi","Akshatagowda","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
	.forEach(s->System.out.println(s));
	
	
	names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	
	Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
	
	newStream.sorted().forEach(s->System.out.println(s));
	boolean flag= newStream.anyMatch(s->s.equalsIgnoreCase("Marwan"));
Assert.assertTrue(flag);
System.out.println(flag);

	
}
@Test
public void collect() {
	
	List <String> ls=Stream.of("Aarav","Anubhuti","Bhumi","Akshatagowda","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
	.collect(Collectors.toList());
	System.out.println(ls.get(0));
	List<Integer> Values=Arrays.asList(8,9,6,2,3,3,5);
	
	//PRINT UNIQUE Numbers
	//sorted them
    
	Values.stream().distinct().forEach(s->System.out.println(s));	
     List<Integer> li= Values.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(li.get(2));
	
}
}