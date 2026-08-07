import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int even_sum=0;
        int odd_sum=0;
        for(int i=0;i<n;i=i+2){
             even_sum+=arr[i];
            }
            for(int i=1;i<n;i=i+2){
                odd_sum+=arr[i];
            }
           
            System.out.println(even_sum);
            System.out.println(odd_sum);

        
        
    }
}//2 loops


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int even_sum=0;
        int odd_sum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even_sum+=arr[i];
            }
            else{
                odd_sum+=arr[i];
            }
            }
           
            System.out.println(even_sum);
            System.out.println(odd_sum);

        
        
    }
}//1 loop
