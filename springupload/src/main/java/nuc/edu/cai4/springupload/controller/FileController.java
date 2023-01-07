package nuc.edu.cai4.springupload.controller;

import nuc.edu.cai4.springupload.util.Res;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class FileController {
    //多文件上传
    @RequestMapping  ("/multiuploadPage")
    public String multiuploadPage() {

        return "multiupload";

    }
//单文件上传
    @RequestMapping("/singleuploadPage")
    public String singleuploadPage() {

        return "SingleFile";

    }
//单文件上传
   @PostMapping("/upload/page")
   @ResponseBody
   public Res UpLoad(HttpServletRequest req, @RequestParam("file") MultipartFile file) {
       try {
           String fileName = System.currentTimeMillis() + file.getOriginalFilename();
           String destFileName = req.getServletContext().getRealPath("") + "uploaded" + File.separator + fileName;
           System.out.println(destFileName);
           File destFile = new File(destFileName);
           destFile.getParentFile().mkdirs();
           file.transferTo(destFile);//写入对象
       } catch (Exception e) {
           System.out.println("文件没有找到啊！！");
           return Res.error();
       }
       return Res.ok();
   }
//多文件上传
    @PostMapping("/multiUpLoad")
    @ResponseBody
    public Res multitestUpLoad(HttpServletRequest req,@RequestParam("filename")  MultipartFile[] filename) {
        String uploadDir = req.getServletContext().getRealPath("") + "uploaded/";
        System.out.println(uploadDir);
        File dir = new File(uploadDir);
        if (!dir.exists()) {
            dir.mkdir();
        }
        try {
            for (MultipartFile multiFile : filename) {
                if(!multiFile.isEmpty()){
                    executeUpload(uploadDir, multiFile);}
            }

        } catch (Exception e) {
            e.printStackTrace();
            return Res.error();
        }

        return Res.ok();
    }
//文件名称
    private void executeUpload(String uploadDir, MultipartFile file) throws Exception {
        System.out.println("执行文件上传");
        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        String filename = UUID.randomUUID() + suffix;
        File serverFile = new File(uploadDir + filename);
        file.transferTo(serverFile);
    }

    @ResponseBody
    private Map<String, Object> dealResultMap(boolean success, String msg)
    {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("success", success);
        result.put("msg", msg);
        return result;
    }
}

