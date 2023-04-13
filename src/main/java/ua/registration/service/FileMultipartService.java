package ua.registration.service;

import org.springframework.web.multipart.MultipartFile;
import ua.registration.domain.FileMultipart;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileMultipartService {

    FileMultipart storeFile(MultipartFile file) throws IOException;

    FileMultipart getFile(String fileId) throws FileNotFoundException;
}

