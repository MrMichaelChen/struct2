package processAction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

/*
 * �ļ������ط�ʽ��Ҫ����java����Ŀ���
 */

public class DownloadAction extends ActionSupport{
    //downloaPath�������ڷ�װ�������ļ���·��  
    private String downloadPath;  

    //��ʼ��Ҫ������ļ���  
    private String filename;  

    //�ļ�����·��  
    private String savePath;  

    public String getSavePath() {  
        return savePath;  
    }  

    public void setSavePath(String savePath) {  
        this.savePath = savePath;  
    }    
   
    public String getFilename() {  
           return filename;  
    }  

    public void setFilename(String filename) {  
           this.filename = filename;  
    }  

    public void setDownloadPath(String downloadPath) {  
    	   this.downloadPath = downloadPath;  
    }  

   // �������� targetFile ,���ڷ�װ�����ļ�  
	public InputStream getTargetFile() throws FileNotFoundException  
	{  
	    return new FileInputStream("D:\\work\\pgadmin.log");  
	}  
	
    public String execute()  
    {  
        return "success";  
    }  
}
