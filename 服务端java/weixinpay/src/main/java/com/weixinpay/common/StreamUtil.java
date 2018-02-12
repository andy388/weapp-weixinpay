package com.weixinpay.common;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class StreamUtil {
	public static String read(InputStream is){
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			int len = 0;
			byte[] buffer = new byte[512];
			while((len = is.read(buffer)) != -1){
				baos.write(buffer, 0, len);
			}
			return new String(baos.toByteArray(), 0, baos.size(), "utf-8");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
}
