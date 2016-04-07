import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class TestEx {

	public static void main(String[] args) {
		String[] str ={"east midlands"," belfast city","city of derry"," liverpool john lennon"," bristol"," exeter","doncaster sheffield"," humberside","newcastle",
				"aberdeen","edinburgh","glasgow","leeds bradford","manchester","belfast"," bournemouth","london gatwick"," london luton"," london southend"," london stansted","norwich","southampton"};
		List<String> list = Arrays.asList(str);
		Collections.sort(list);

		for(String s : list)
		{
			System.out.println(s);
		}

	}

}
