public class CandidateCode 
{ 
    public static int[] arraySum(int[] input1,int[] input2)
    {
	int[] output=new int[input1.length];
        for(int i=0;i<input1.length;i++)
        {
            output[i]=input1[i]+input2[i];
        } 
        return output;
        
    }
}