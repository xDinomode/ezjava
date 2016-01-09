import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

class CopyFile{
    public static void main(String args[]) throws IOException{
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
        
        try{
            inputStream = new BufferedReader(new FileReader("infile.txt"));
            outputStream = new PrintWriter(new FileWriter("outfile.txt"));
            
            String a;
            while((a = inputStream.readLine()) != null){
                outputStream.println(a);
            }
        } finally{
            if(inputStream != null){
                inputStream.close();
            }
            if(outputStream != null){
                outputStream.close();
            }
        }
    }
}