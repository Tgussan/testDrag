package com.example.demo;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;
import java.util.Map;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;
import java.util.HashMap;
import java.util.LinkedHashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.ui.Model;
import org.apache.catalina.startup.FailedContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


@Controller
public class testController {
	//private static final Logger logger =
            //LoggerFactory.getLogger(DocListRest.class);
	@RequestMapping("/test")
	public String method() {
		//�Q�l�y�[�Whttps://codepen.io/ueokande/pen/VeRBvr
		return "test";
	}
	@RequestMapping("/")
	public String fileUploadPage(Model model) {
		//�Q�l�y�[�Whttps://qiita.com/t-iguchi/items/64f1b018a0ffb324edb8
		return "file4";
	}
//	 @RequestMapping(value = "/upload", method = RequestMethod.POST)
//	    public String index(@RequestParam("files") List<MultipartFile> files, Model model) {
//	        for (MultipartFile file : files) {
//	            System.out.println("getOriginalFilename="+file.getOriginalFilename());
//	        }
//	        return "file";
//	    }
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(FileUploadForm fileUploadForm) {
		
        System.out.println((fileUploadForm.getFileData().getName() + ", " + fileUploadForm.getFileData().getSize()));
        return "file4";
    }
	 @RequestMapping("/file2")
		public String fileUploadPage2(Model model) {
			//�Q�l�y�[�Whttps://qiita.com/t-iguchi/items/64f1b018a0ffb324edb8
			return "file2";
		}
	 @RequestMapping("/file3")
		public String fileUploadPage3(Model model) {
			//�Q�l�y�[�Whttp://www.techscore.com/blog/2012/11/12/html5-%E3%81%AE-file-api-%E3%81%A7%E3%83%89%E3%83%A9%E3%83%83%E3%82%B0%EF%BC%86%E3%83%89%E3%83%AD%E3%83%83%E3%83%97%E3%81%99%E3%82%8B/
			return "file3";
		}

	    
	    
}
