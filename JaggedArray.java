package arrayexamples;

public class JaggedArray {

	public static void main(String[] args) {
		int arr[][]=new int[3][];
		arr[0]=new int[2];
		arr[1]=new int[4];
		arr[2]=new int[3];
		
		int num=1;
		//initialising a jagged array
		for(int i=0;i<arr.length;i++)//arr.length will return lengthof row
		{
			for(int j=0;j<arr[i].length;j++)//arr[i].length will return length of col
			{
				arr[i][j]=num++;
				//num++;
				
			}
		}
		//printing the data of a jagged array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)//arr[i].length will return length of col
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
