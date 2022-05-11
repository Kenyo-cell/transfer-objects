package ru.mirea.transfer;

import java.io.Serializable;

public record ExecutionResultTransferObject(byte[] result) implements Serializable {
}
