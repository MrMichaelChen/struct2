package processAction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

/*
 * 文件的下载方式需要进行java代码的控制
 */

public class DownloadAction extends ActionSupport{
    //downloaPath属性用于封装被下载文件的路径  
    private String downloadPath;  

    //初始化要保存的文件名  
    private String filename;  

    //文件保存路径  
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

   // 隐含属性 targetFile ,用于封装下载文件  
	public InputStream getTargetFile() throws FileNotFoundException  
	{  
	    return new FileInputStream("D:\\work\\pgadmin.log");  
	}  
	
    public String execute()  
    {  
        return "success";  
    }  
}
