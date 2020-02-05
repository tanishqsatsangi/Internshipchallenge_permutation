import java.util.*;
import java.io.*;
import java.lang.reflect.Array;


class Code {
    public static void main(String[] args) {
        String csvFile="";//csv file path
        BufferedReader br = null;//reader
        String line = "";//to input each line
        String split = ",";//seprator in csv file
        ArrayList<String> al=new ArrayList<>();
        
			String st="";
			Scanner in=new Scanner(System.in);
			csvFile=args[0];
			
			
		
		try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                String[] value = line.split(split);

                String strrow="";
                for(String s:value)
                {
                    strrow=strrow+s.charAt(1);
                }
				al.add(strrow);
                
            }
			
				
        } catch (Exception e) {
            System.out.println("There has been an error in the code please check stack trace");
			
			//to handle all kind of Exception
        e.printStackTrace();
			
		} 
		
		//to make permutation of strings arrray al
/*

the code uses looping to multiply the next array element to the previous one
 i.e.
 abc
 ij
 becomes 
 ai bi ci aj bj cj
 the for yx
 aix bix cix ajx bjx cjx aiy biy ciy ajy bjy cjy

 which gets strored in c array 
	*/	
		
		ArrayList<String> c=new ArrayList<>();
		String s=al.get(0);
//intially the arraylist contains the first line of the csv file 	
	for(int q=0;q<s.length();q++){
			c.add(String.valueOf(s.charAt(q)));
		}
		
		//it start from second line multiplying each item to the c array 
	for(int x=1;x<al.size();x++){
		
		ArrayList<String> als=new ArrayList<>();
		String se=al.get(x);
		for(int j=0;j<se.length();j++){
			int k=0;
			while(k<c.size()){
				als.add(c.get(k)+se.charAt(j));	
		k++;
		}
		}
		c=als;				
	}
	//printing of the permutation list
for(int t=0;t<c.size();t++){
	System.out.print(c.get(t)+",");
}
		}		
		
		
}
			
			
	

		