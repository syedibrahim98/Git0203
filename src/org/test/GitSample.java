package org.test;

public class GitSample {
	
	public void gitOne() {
		System.out.println("gitone test1");
	}
	
	public void gitTwo() {
		System.out.println("gittwo test2");
	}
	
	
	private void gitFour() {
		System.out.println("gitFour test4");

	}
	
	public static void main(String[] args) {
		GitSample sample = new GitSample();
		sample.gitOne();
		sample.gitTwo();
		sample.gitFour();
	}

}
