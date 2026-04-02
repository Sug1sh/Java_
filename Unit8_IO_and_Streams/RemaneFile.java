package Unit8_IO_And_Streams;
import java.io.*;
class  RenameFile{
    public static void main(String[] args) throws Exception {
        File f= new File("C:\\Users\\Acerr\\OneDrive\\Desktop\\sugish.txt");
        File t = new File("C:\\Users\\Acerr\\OneDrive\\Desktop\\devkota.txt");
        if(f.exists()){
            System.out.println(f.renameTo(t));
        }
        else{
            System.out.println("Filenot Found");
        }
    }
}