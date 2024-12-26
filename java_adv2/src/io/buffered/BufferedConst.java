package io.buffered;

public class BufferedConst {

    public static final String FILE_NAME = "temp/buffered.dat";
    public static final int FILE_SIZE = 10 * 1024 * 1024; // 10MB
    public static final int BUFFER_SIZE = 8192; // 8KB // 시스템이 쓰고 읽을 때 모으는 단위가 4 혹은 8 KB 라고한다.
}
