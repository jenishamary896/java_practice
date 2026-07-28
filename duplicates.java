import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); 
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            for( int j=0;j<a;j++){
                if(i!=j){
                    if((arr[i]==arr[j])&&(j>i)){
                        System.out.println(arr[i]);
                        break;
                    }
                    else if((arr[i]==arr[j])&&j<i){
                        break;
                    }
                }
            }
        }
        
        
    }
}
