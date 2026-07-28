import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in); 
        int a=sc.nextInt();
        for(int i=0;i<=a/2;i++){
            int val=0;
            for(int j=0;j<a;j++){
                if(j<=i){
                    System.out.print(++val);
                }
                else if(i+j>=a){
                    System.out.print(--val);
                }
                else{
                    System.out.print(val);
                }
                
            }
            System.out.println();
        }
        for(int i=(a/2)-1;i>=0;i--){
            int val=0;
            for(int j=0;j<a;j++){
                if(j<=i){
                    System.out.print(++val);
                }
                else if(i+j>=a){
                    System.out.print(--val);
                }
                else{
                    System.out.print(val);
                }
                
            }
            System.out.println();
        }
        
        
        
        
    }
}
