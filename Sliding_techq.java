import java.util.*;

public class Sliding_techq{
    
    public static void main(String args[]){
        
        Scanner input=new Scanner(System.in);
        int arr[]={100,200,300,400,150,260,900}; //Try With your own array or take an input yourself.
        int number,k,csum=0,sum=0,max=0;
        int j;
        System.out.println("Enter Consecutive Elements in array: ");
        number=input.nextInt();
        k=number-1;
        int cons=k; 
        int length=arr.length-cons;
        for(int i=0;i<arr.length;i++){
            if(i==length){
                break;
            }
            for(j=i;j<=k;j++){
                sum=sum+arr[j];
                csum=sum;
            }
            if(j>k){
                    k=k+1;
                }
            sum=0;
            if(csum>max){
                max=csum;
            }
        }
        System.out.println("Maximum: " +max);
    }
}