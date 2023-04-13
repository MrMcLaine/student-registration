package ua.registration.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import ua.registration.domain.FileMultipart;
import ua.registration.repository.FileMultipartRepository;
import ua.registration.service.FileMultipartService;

import java.io.FileNotFoundException;
import java.io.IOException;

@Service
public class FileMultipartServiceImpl implements FileMultipartService {
    private final FileMultipartRepository repository;

    public FileMultipartServiceImpl(FileMultipartRepository repository) {
        this.repository = repository;
    }

    @Override
    public FileMultipart storeFile(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        FileMultipart fileMultipart = null;
        if (!fileName.contains("..")) {
            fileMultipart = new FileMultipart(fileName, file.getContentType(), file.getBytes());
        }
        return repository.save(fileMultipart);
    }

    @Override
    public FileMultipart getFile(String fileId) throws FileNotFoundException {
        return repository.findById(fileId).orElseThrow(FileNotFoundException::new);
    }
}
