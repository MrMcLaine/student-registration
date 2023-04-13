package ua.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.registration.domain.FileMultipart;

@Repository
public interface FileMultipartRepository extends JpaRepository<FileMultipart, String> {
}
