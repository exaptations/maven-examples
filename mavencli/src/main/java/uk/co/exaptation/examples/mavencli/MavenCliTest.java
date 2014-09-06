package uk.co.exaptation.examples.mavencli;

import org.apache.maven.cli.MavenCli;

public class MavenCliTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		cliTest1();
	}

	public static void cliTest1() {
		MavenCli cli = new MavenCli();
		int result = cli.doMain(new String[] { "compile","dependency:tree","-Ddetail=true" }, "./", System.out, System.out);
	}

}
