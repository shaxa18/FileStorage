package com.example.demo.service;

import com.example.demo.model.FileStorage;
import com.example.demo.model.FileStorageStatus;
import com.example.demo.repository.FileStorageRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileStorageService {

    private final FileStorageRepository fileStorageRepository;

    public FileStorageService(FileStorageRepository fileStorageRepository) {
        this.fileStorageRepository = fileStorageRepository;
    }

    public void save(MultipartFile multipartFile){
        FileStorage fileStorage=new FileStorage();
        fileStorage.setName(multipartFile.getOriginalFilename());
        fileStorage.setExtension(multipartFile.getOriginalFilename());
        fileStorage.setFileSize(multipartFile.getSize());
        fileStorage.setContentType(multipartFile.getContentType());
        fileStorage.setFileStorageStatus(FileStorageStatus.Draft);
        fileStorageRepository.save(fileStorage);
    }

    private String getExtenction(String fileName){
        String ext=null;
        if (fileName!=null && !fileName.isEmpty()){
            int dot=fileName.lastIndexOf('.');
            if (dot>0 && dot<=fileName.length()-2){
                ext=fileName.substring(dot+1);
            }
        }
        return ext;
    }
}
