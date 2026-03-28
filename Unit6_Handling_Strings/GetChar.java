package labreportjava;

class GetChar{
    public static void main(String[] args) {
        String str = "iamdifferentthanothers";
        char[] result = new char[8];
        str.getChars(0,4,result,0);
        System.out.println(result);
    }
}