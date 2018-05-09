package processAction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import processAction.IOUtils;
public class FileUpload extends ActionSupport {
	// upload
	private File[] uploadfile;
	private String[] uploadfileFileName;
	private String[] uploadfileContentType;
	
	@Override
	public String execute() throws Exception {
		// 利用本类中的方法进行文件的上传 使用filecopy方法:
		// upload();
		
		// 利用util工具类中的函数进行上传 使用字节流上传文件:
		IOUtils util = new IOUtils();
	 	util.files_copy(uploadfile,uploadfileFileName);
		return super.execute();
	}
	
	public File[] getUploadfile() {
		return uploadfile;
	}
	
	public void setUploadfile(File[] uploadfile) {
		this.uploadfile = uploadfile;
	}
	
	public String[] getUploadfileFileName() {
		return uploadfileFileName;
	}
	
	public void setUploadfileFileName(String[] uploadfileFileName) {
		this.uploadfileFileName = uploadfileFileName;
	}
	
	public String[] getUploadfileContentType() {
		return uploadfileContentType;
	}
	
	public void setUploadfileContentType(String[] uploadfileContentType) {
		this.uploadfileContentType = uploadfileContentType;
	}
	/*
	 * 上传文件方法一  通过文件方式上传
	 */
    public String upload1() throws IOException {  
        //String realpath = ServletActionContext.getServletContext().getRealPath("./");  
        String realpath = "D:\\work\\";
    	if (uploadfile != null) {  
        	System.out.println("上传文件的存储路径为："+realpath);
            File savepath = new File(realpath);  
            if (!savepath.exists())  
                savepath.mkdirs();  
            for (int i = 0; i < uploadfile.length; i++) {  
                File savefile = new File(realpath, uploadfileFileName[i]);  
                FileUtils.copyFile(uploadfile[i], savefile);  
            }  
            ActionContext.getContext().put("message", "上传成功！");  
        }  
        System.out.println("success upload");
        
        return "success";  
    }  
	/*
	 * 上传文件方法二 通过字节流上传
	 */
	public String upload() throws IOException {
		String realpath = "D:\\work\\";
		for (int i = 0; i < uploadfile.length; i++) {
			FileOutputStream fos = new FileOutputStream(realpath + uploadfileFileName[i]);
			FileInputStream fis = new FileInputStream(uploadfile[i]);
			byte[] buffer = new byte[1024];
			int len = 0;
			while ((len = fis.read(buffer)) > 0) {
				fos.write(buffer, 0, len);
			}
		}
		System.out.println("上传文件的存储路径为："+realpath);
		System.out.println("success upload");
		return "success";
	}

}
