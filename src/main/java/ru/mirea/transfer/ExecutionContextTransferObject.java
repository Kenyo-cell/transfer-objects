package ru.mirea.transfer;

import java.io.InputStream;
import java.io.Serializable;

public record ExecutionContextTransferObject(byte[] source, byte[] input) implements Serializable {
}