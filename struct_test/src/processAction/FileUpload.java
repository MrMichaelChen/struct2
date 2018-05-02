package processAction;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FileUpload extends ActionSupport {
	// upload
	private File[] uploadfile;
	private String[] uploadfileFileName;
	private String[] uploadfileContentType;
	
	@Override
	public String execute() throws Exception {
		upload();
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
	 * �ϴ��ļ�����һ  ͨ���ļ��ϴ�
	 */
    public String upload1() throws IOException {  
        String realpath = ServletActionContext.getServletContext().getRealPath("D:\\work\\");  
        if (uploadfile != null) {  
            File savepath = new File(realpath);  
            if (!savepath.exists())  
                savepath.mkdirs();  
            for (int i = 0; i < uploadfile.length; i++) {  
                File savefile = new File(realpath, uploadfileFileName[i]);  
                FileUtils.copyFile(uploadfile[i], savefile);  
            }  
            ActionContext.getContext().put("message", "�ϴ��ɹ���");  
        }  
        System.out.println("success upload");
        
        return "success";  
    }  
	/*
	 * �ϴ��ļ������� ͨ���ֽ����ϴ�
	 */
	public String upload() throws IOException {
		for (int i = 0; i < uploadfile.length; i++) {
			FileOutputStream fos = new FileOutputStream("D:\\work\\" + uploadfileFileName[i]);
			FileInputStream fis = new FileInputStream(uploadfile[i]);
			byte[] buffer = new byte[1024];
			int len = 0;
			while ((len = fis.read(buffer)) > 0) {
				fos.write(buffer, 0, len);
			}
		}
		System.out.println("success upload");
		return "success";
	}

}
