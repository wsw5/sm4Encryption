package com.sinosoft.ims.core.common.utils;

/**
 * wsw
 *
 * @auth /**
 * @ClassName SM4_Context_one
 * @Description TODO
 * @Author wsw
 * @Date 2021/10/28 16:18
 */
public class SM4_Context {
    public int mode;

    public int[] sk;

    public boolean isPadding;

    public SM4_Context() {
        this.mode = 1;
        this.isPadding = true;
        this.sk = new int[32];
    }
}
