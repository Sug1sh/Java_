package Unit8_IO_And_Streams;
import java.io.*;
class NewFile{
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\Acerr\\OneDrive\\Desktop\\sugish.txt");
        
        if (f.createNewFile()){
            System.out.println("File successfully Created!!!");
        }
        else{
            System.out.println("File already exits");
        }
    }
}