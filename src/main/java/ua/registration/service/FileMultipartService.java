package ua.registration.service;

import ua.registration.domain.FileMultipart;

import java.io.FileNotFoundException;

public interface FileMultipartService {

    FileMultipart save(FileMultipart file);

    FileMultipart getFile(String fileId) throws FileNotFoundException;
}

