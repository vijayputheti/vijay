import java.util.*;

public class Test
{

public static void main(String[] args)
{


final List<String> modifiable = new ArrayList<>();
modifiable.add("Java");
modifiable.add("is");

List<String> un = new ArrayList<String>(modifiable);
for(String str : un)
{
  un.remove("is");
}
System.out.println(un);
}
}