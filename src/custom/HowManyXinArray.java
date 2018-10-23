package custom;

import java.util.Scanner;

public class HowManyXinArray {

	
	public static void main(String[] args) {
	
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		int n,l,u,count,temp;
		for(int i=0;i<t;i++){
		    n=kb.nextInt();
		    l=kb.nextInt();
		    u=kb.nextInt();
		    count=0;
		    for(int j=l+1;j<u;j++){
		        temp=j;
		        while(temp!=0){
		            if(temp%10==n)
		            count++;
		            temp=temp/10;
		        }
		    }
		    System.out.println(count);
		    
		}
	}

	
	
}
