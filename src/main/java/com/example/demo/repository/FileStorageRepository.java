package com.example.demo.repository;

import com.example.demo.model.FileStorage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileStorageRepository extends JpaRepository<FileStorage,Long> {

    FileStorage findByHashId(String hashId);
}
