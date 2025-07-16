package Sample;

public class Methods {
	 
		public static void main(String[] args) {
			String name="i am studing software testing 123";
			String dharani=name.replaceAll("[^0-9]","");
			System.out.println(dharani);
			
			boolean contain=name.contains("stu");
			System.out.println(contain);
			
			String replace=name.replace("t", "e");
			System.out.println(replace);
			
			
		String str="hello";
		String[] name1=str.split("e");
				for(String mathan:name1) {
					System.out.println(mathan);
					
				}
			
		}
	   

	}



