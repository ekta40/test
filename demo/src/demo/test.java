package demo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;


public class test {
	
	public static void main(String[] args) throws IOException {
		

		/*Path pdfPath = Paths.get("D:/newfolder/out1.pdf");
		byte[] pdf = Files.readAllBytes(pdfPath);*/
		
		 FileInputStream fis = new FileInputStream("E:/NewUrlFile.txt");
	        //System.out.println(file.exists() + "!!");
	        //InputStream in = resource.openStream();
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        byte[] buf = new byte[1024];
	        try {
	            for (int readNum; (readNum = fis.read(buf)) != -1;) {
	                bos.write(buf, 0, readNum); //no doubt here is 0
	                //Writes len bytes from the specified byte array starting at offset off to this byte array output stream.
	                System.out.println("read " + readNum + " bytes,");
	            }
	        } catch (IOException ex) {
	           // Logger.getLogger(genJpeg.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        byte[] bytes = Base64.getDecoder().decode(bos.toByteArray());

	        //below is the different part
	        File someFile = new File("E:/responsejava.pdf");
	        FileOutputStream fos = new FileOutputStream(someFile);
	        fos.write(bytes);
	        fos.flush();
	        fos.close();	
		
		
	}

}
