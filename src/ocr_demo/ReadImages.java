package ocr_demo;
import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException; 

public class ReadImages {
	
	public static void main(String [] args) {
	ITesseract image = new Tesseract(); 
	
	try {
		System.out.println("[!] Simple Captcha Reader useing OCR --> does not support jpg!")
		String str = image.doOCR(new File("/Users/a-robot/Documents/CS/PROJECT/ocr_11/picture.png"));
		System.out.println("Data is in: \n\n" + str);
		
		String []myArray = str.split("below");
		String convertedData = myArray[1].replaceAll("[^a-zA-Z]", "");
		System.out.println(convertedData);
		
		
	}catch (TesseractException e){
		System.out.println(e.getMessage());
		
		
	}
	
}}
