package ProgramsTest;

public class A3DuplicatelelemtnsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int arr[]=new int[]{24,5,8,5,2,8,24};
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[i]);
                };
                
                
            };
        };
        
    }  

	}


