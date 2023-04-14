package ua.registration.service.impl;

import org.springframework.stereotype.Service;
import ua.registration.domain.FileMultipart;
import ua.registration.repository.FileMultipartRepository;
import ua.registration.service.FileMultipartService;

import java.io.FileNotFoundException;

@Service
public class FileMultipartServiceImpl implements FileMultipartService {
    private final FileMultipartRepository repository;

    public FileMultipartServiceImpl(FileMultipartRepository repository) {
        this.repository = repository;
    }

    @Override
    public FileMultipart save(FileMultipart file) {
        return repository.save(file);
    }

    @Override
    public FileMultipart getFile(String fileId) throws FileNotFoundException {
        return repository.findById(fileId).orElseThrow(FileNotFoundException::new);
    }
}
