package com.coldraincn.parsing.memoize;

public class MismatchedTokenException extends RecognitionException {
    public MismatchedTokenException(String msg) {
        super(msg);
    }
}