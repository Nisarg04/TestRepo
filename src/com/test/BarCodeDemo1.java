package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.BarcodeEAN;
import com.itextpdf.text.pdf.PdfWriter;

public class BarCodeDemo1 {
	public static void main(String[] args) throws DocumentException, IOException {
		Document document = new Document();
		OutputStream outStream = new FileOutputStream("E://output//a1.pdf");
		PdfWriter writer = PdfWriter.getInstance(document, outStream);
		BarcodeEAN codeEAN = new BarcodeEAN();
		document.open();
        codeEAN.setCodeType(codeEAN.EAN8);
        codeEAN.setCode("9780201615883");
        Image imageEAN = codeEAN.createImageWithBarcode(writer.getDirectContent(), null, null);
        document.add(imageEAN);
        document.close();
        
        InputStream inputStream = new FileInputStream("E://output//aa.pdf");
        int numberBytes = inputStream.available();
        byte bytearray[] = new byte[numberBytes];
        String encoded = new String(java.util.Base64.getEncoder().encode(bytearray));
        System.out.println(encoded);
	}
}
