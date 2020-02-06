package com.ice.tar;

import java.io.DataOutputStream;
import java.io.IOException;

public class ProcessTest {

	public static void main(String[] args) {

		try {
			Runtime rt = Runtime.getRuntime();
			Process process = rt.exec("sh");
			DataOutputStream os = new DataOutputStream(process.getOutputStream());
			String command = "ln -s " + args[0];
			os.writeBytes(command + "\n");
			os.flush();
			os.writeBytes("exit\n");
			os.flush();
			process.waitFor();
		} catch (IOException e) {
			throw new RuntimeException(e);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}