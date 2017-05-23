package oo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SimpleWrite {

	public static void main(String[] args) {
		try{
			FileOutputStream fos = new FileOutputStream("data.txt");  //檔案出現在 myproject底下
			fos.write(66);   //ASCII碼-B
			fos.flush();
			fos.close();     //可寫可不寫
		}catch(FileNotFoundException e){
			e.printStackTrace();   //未來在寫錯誤訊息
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
