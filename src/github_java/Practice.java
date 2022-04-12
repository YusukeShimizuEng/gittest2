package github_java;

public class Practice {

/*
 * alt + shift + x  →  j
 * または
 * ctrl + F11
 * でプログラム実行
 * */

	public static void main(String[] args) {
		try {
			int a = 10;
			if(a == 10) {
				throw new Exception();
			}
			System.out.println("例外じゃないよ！");
		}
		catch(Exception e){
			System.out.println("例外発生！");
		}


	}

}

