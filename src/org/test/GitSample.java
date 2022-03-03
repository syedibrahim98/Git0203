package org.test;

public class GitSample {
	
	public void gitOne() {
		System.out.println("gitone test1");
	}
	
	public void gitTwo() {
		System.out.println("gittwo test2");
	}
	
	private void gitThree() {
		System.out.println("gitThree test3");

	}
	
	public static void main(String[] args) {
		GitSample sample = new GitSample();
		sample.gitOne();
		sample.gitTwo();
		sample.gitThree();
	}

}
