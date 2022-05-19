package com.example.demo.repository;

import com.example.demo.model.FileStorage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileStorageRepository extends JpaRepository<FileStorage,Long> {

}
