//WAP to read the data from the file...........
package Unit8_IO_And_Streams;

import java.io.FileInputStream;

class ReadFile{
    public static void main(String[] args) throws Exception {
        FileInputStream f = new FileInputStream("C:\\Users\\Acerr\\OneDrive\\Desktop\\sugish.txt");
        int i;
        while((i=f.read())!=-1){
            System.out.print((char)i);
        }
        f.close();
    }
}