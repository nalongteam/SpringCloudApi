package com.market.auth;

import com.market.auth.until.RsaUtils;
import org.apache.tomcat.jni.Directory;
import org.junit.Test;

import java.io.File;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * @ClassName JwtTest
 * @Description: TODO
 * @Author zhengweilin
 * @Date 2019/9/12
 * @Version V1.0
 **/
public class JwtTest {
    private static final String pubKeyPath = "C:\\tmp\\rsa\\rsa.pub";

    private static final String priKeyPath = "C:\\tmp\\rsa\\rsa.pri";

    private static final String secret = "mk@zwl!!568633995";

    private PublicKey publicKey;

    private PrivateKey privateKey;

    @Test
    public void testRsa() throws Exception {
        File file=new File("C:\\tmp\\rsa");
        if (!file.exists()){
             file.mkdirs();
        }

        RsaUtils.generateKey(pubKeyPath, priKeyPath, secret);
    }
}
