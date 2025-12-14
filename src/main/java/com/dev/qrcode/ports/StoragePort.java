package com.dev.qrcode.ports;

public interface StoragePort {

    String uploadFile(byte[] file, String fileName, String contentType);
}
