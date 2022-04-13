package github_java;

import java.util.ArrayList;

public class Stream_test {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < 11; i++) {
			list.add(i);
		}

		//streamなら１行
		list.stream().forEach(i -> System.out.println(i));

		//拡張forだと３行
		for(Integer j: list){
			System.out.println(j);
		}



	}

}
