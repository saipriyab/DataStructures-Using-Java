package com.learning.soring;

public class InsertionSort {

	public static void main(String[] args) {
		int nums[]= {5,3,2,1,4};
		
		int temp=0,i=0,j=0;
		for(i=1;i<nums.length;i++)
		{
			temp=nums[i];
			j=i-1;
			while(j>=0&&nums[j]>temp)
			{
				nums[j+1]=nums[j];
				j=j-1;
			}
			nums[j+1]=temp;
		}
		for(i=0;i<nums.length;i++)
			System.out.println(nums[i]);

	}

}
