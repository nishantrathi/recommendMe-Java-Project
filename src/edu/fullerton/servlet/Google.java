package edu.fullerton.servlet;

import java.util.ArrayList;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,3,2,5};
		solution(arr,3);

	}

	public static void solution(int[] A, int K) 
	{
		ArrayList<int[]> allArr = new ArrayList<int []>();
		for(int i=K;i<=A.length;i++)
		{
			int temp [] = new int[K];
			for(int j=0;j<temp.length;j++)
			{
				//System.out.print(","+A[i-(j+1)]);
				temp[K-(j+1)]= A[i-(j+1)];
			}
			//System.out.println(" ");
			allArr.add(temp);
			
			
		}
		int count =0;
		for(int x =1;x<allArr.size();x++)
		{
			int [] f = allArr.get(x-1);
			int [] s = allArr.get(x);
			for(int i=0;i<f.length;i++)
			{
				if(f[i]<s[i])
				{
					count = x;
				}
				else
				{
					count = x-1;
				}
			}
		}
		int finalArr [] = allArr.get(count); 
		for(int l=0;l<finalArr.length;l++)
		{
			System.out.print(finalArr[l]+",");
		}
	}
}

