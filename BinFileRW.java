package com.app;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class BinFileRW {
    public static void main(String[] args) {
       // String filePath = "D:\\Demo\\SRFileReadWrite\\src\\com\\app\\EAGE_ILINE338_Salt_Model_original_cdp_tracl.bin_hx5.000_hz5.000_x2704z840_cdp_dt.sr";
    	String filePath = "D:\\Demo\\SRFileReadWrite\\src\\com\\app\\1_2fldr.bin";
    	//String filePath ="D:\\Demo\\SRFileReadWrite\\src\\com\\app\\outfile.bin";
    	String destinationFilePath = "D:\\\\Demo\\\\SRFileReadWrite\\\\src\\\\com\\\\app\\outfile.bin";
        try {
            // Open the SR file
            FileInputStream fis = new FileInputStream(filePath);
            DataInputStream dis = new DataInputStream(fis);
            
            FileOutputStream fos = new FileOutputStream(destinationFilePath);
            DataOutputStream dos = new DataOutputStream(fos);

       
            while (dis.available() > 0) {
                float value = dis.readFloat();
                dos.writeFloat(value);
                System.out.println("Value: " + value);
                
            }

          
            fis.close();
            dis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

