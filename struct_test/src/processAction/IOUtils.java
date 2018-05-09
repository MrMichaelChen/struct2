package processAction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOUtils {
	public static void main(String[] args) {
		
	}
	
	public String files_copy(File[] uploadfile,String[] uploadfileFileName) throws IOException {
		String realpath="D:\\work\\";
		if(uploadfile == null){
			System.out.println("请输入有效的上传文件");
			return "input";
		}
		else {
		for (int i = 0; i < uploadfile.length; i++) {
			@SuppressWarnings("resource")
			FileOutputStream fos = new FileOutputStream(realpath + uploadfileFileName[i]);
			@SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream(uploadfile[i]);
			byte[] buffer = new byte[1024];
			int len = 0;
			while ((len = fis.read(buffer)) > 0) {
				fos.write(buffer, 0, len);
			}
		}
		System.out.println("上传文件的存储路径："+realpath);
		System.out.println("success upload");
		return "success";
	}
	}
}
