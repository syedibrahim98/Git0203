package org.test;

public class GitSample {

	public void gitOne() {
		System.out.println("gitone test1");
	}

	public void gitTwo() {
		System.out.println("gittwo test2");
	}

	// <<<<<<< HEAD

	private void gitFour() {
		System.out.println("gitFour test4");
	}

	// =======
	private void gitThree() {
		System.out.println("gitThree test3");
		// >>>>>>> d67551f1b63335cabe84a5add5b8d700ab0743ee

	}

	public static void main(String[] args) {
		GitSample sample = new GitSample();
		sample.gitOne();
		sample.gitTwo();
		// <<<<<<< HEAD
		sample.gitFour();
		// =======
		sample.gitThree();
		// >>>>>>> d67551f1b63335cabe84a5add5b8d700ab0743ee
	}

}
