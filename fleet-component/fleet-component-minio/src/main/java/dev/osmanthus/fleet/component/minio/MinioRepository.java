package dev.osmanthus.fleet.component.minio;

import dev.osmanthus.fleet.common.utils.StringUtils;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import io.minio.ObjectWriteResponse;
import io.minio.UploadObjectArgs;
import io.minio.errors.*;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Repository
public class MinioRepository {
    private final MinioConfig minioConfig;
    private MinioClient minioClient;

    public MinioRepository(MinioConfig minioConfig) {
        this.minioConfig = minioConfig;
        this.init();
    }

    private void init() {
        if (!StringUtils.isNullOrEmpty(this.minioConfig.getEndpoint())) {
            try {
                this.minioClient = MinioClient
                    .builder()
                    .endpoint(this.minioConfig.getEndpoint())
                    .credentials(this.minioConfig.getAccessKey(), this.minioConfig.getSecretKey())
                    .build();
            } catch (Exception e) {
                e.printStackTrace();
                this.minioClient = null;
            }
        }
    }

    public boolean isAvailable() {
        return this.minioClient != null;
    }

    public void uploadObject() {
        // Upload '/home/user/Photos/asiaphotos.zip' as object name 'asiaphotos-2015.zip' to bucket
        // 'asiatrip'.
        try {
            ObjectWriteResponse objectWriteResponse = minioClient.uploadObject(
                UploadObjectArgs.builder()
                    .bucket("asiatrip")
                    .object("asiaphotos-2015.zip")
                    .filename("/home/user/Photos/asiaphotos.zip")
                    .build());
        } catch (ErrorResponseException | InsufficientDataException | InternalException | InvalidKeyException ex) {
            throw new RuntimeException(ex);
        } catch (InvalidResponseException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (NoSuchAlgorithmException ex) {
            throw new RuntimeException(ex);
        } catch (ServerException ex) {
            throw new RuntimeException(ex);
        } catch (XmlParserException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println(
            "'/home/user/Photos/asiaphotos.zip' is successfully uploaded as "
                + "object 'asiaphotos-2015.zip' to bucket 'asiatrip'.");
    }

    public void makeBucket() {
        if (this.minioClient == null) {
            return;
        }

        try {
            this.minioClient.makeBucket(MakeBucketArgs.builder().bucket("asiatrip").build());
        } catch (ErrorResponseException e) {
            throw new RuntimeException(e);
        } catch (InsufficientDataException e) {
            throw new RuntimeException(e);
        } catch (InternalException e) {
            throw new RuntimeException(e);
        } catch (InvalidKeyException e) {
            throw new RuntimeException(e);
        } catch (InvalidResponseException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        } catch (ServerException e) {
            throw new RuntimeException(e);
        } catch (XmlParserException e) {
            throw new RuntimeException(e);
        }
    }
}
