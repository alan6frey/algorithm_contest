package test4;

import java.util.Scanner;
/*
 * 这种做法感觉不好，没有抓住实质，arr[next-1]=next
 * 就相当于直接赋值了
 * next表示下一个应转到的位置
 * tmp表示下一个应转到的位置上原来的错误的值
 */
public class CD23_P394_v1 {
	public void sort1(int[] arr){
        int tmp=0,next=0;
        for(int i=0;i<arr.length;i++){
            next=arr[i];
            while(arr[i]!=i+1){
                tmp=arr[next-1];
                arr[next-1]=next;
                next=tmp;
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();
        CD23_P394_v1 ma=new CD23_P394_v1();
        ma.sort1(arr);
        for(int i=0;i<N;i++)
            System.out.print(arr[i]+" ");
        sc.close();
    }
}
