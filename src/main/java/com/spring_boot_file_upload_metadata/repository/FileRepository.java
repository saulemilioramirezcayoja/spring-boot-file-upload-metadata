package com.spring_boot_file_upload_metadata.repository;

import com.spring_boot_file_upload_metadata.model.FileModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<FileModel, Long> {
}