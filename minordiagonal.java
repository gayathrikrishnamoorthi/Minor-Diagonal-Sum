package sample;

import java.util.Scanner;

public class minordiagonal {
	public static int Diagonal(int[][] a,int n) {
		int sum=0;
		int i=0;
		int j=n-1;
		while(i<n&&j>0) {
			sum=sum+a[i][j];
		}
		return sum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<n;j++) {
        		a[i][j]=sc.nextInt();
        	}
        }
        int result=Diagonal(a,n);
        System.out.println(result);
        
	}

}


