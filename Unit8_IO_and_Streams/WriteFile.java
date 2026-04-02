package Unit8_IO_And_Streams;

import java.io.*;

 class FileWrite{
    public static void main(String[] args) throws Exception {
        FileOutputStream f = new FileOutputStream("C:\\Users\\Acerr\\OneDrive\\Desktop\\Ramesh.txt");
        
        String s  = "Hello It's me sugish and the text is saved in sugish7.txt";
        f.write(s.getBytes());
     
        
        f.close();
    }
    
}