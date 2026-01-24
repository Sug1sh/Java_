public class SearchArrayElement{
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60};
        int target = 30;
        for(int i = 0; i<a.length; i++){
            if(a[i]==target){
                System.out.println("The search element is at index: "+i);
                return;
            }
        }
        System.out.println("The search element not found");
    }
 }
