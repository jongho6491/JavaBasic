package Pro250521;

import java.util.*;

public class Pro05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int setVale = 1;
		int maxV =0;
		String Vset;
		do {
			System.out.print("점수를 입력하세요 : ");
			setVale = sc.nextInt();
			if (setVale > -1) {
				list.add(setVale);
				if (maxV < setVale) {
					maxV = setVale;
				}
			}
		} while(setVale != -1);
		if (list.size() > 0) {
			System.out.println("전체 학생은 " + list.size() + "명이다.");
			
			System.out.print("학생들의 성적 : ");
			for (int set : list) {
				System.out.print(set + " ");
			}
			System.out.println();
			
			for (int i = 0; i < list.size(); i++) {
				if (maxV-10 < list.get(i)) {
					Vset = "A";
				} else if (maxV-20 < list.get(i)) {
					Vset = "B";
				} else {
					Vset = "C";
				}
				System.out.println(i + "번 학생의 성적은 " + list.get(i) + "점이며 등급은" + Vset + "이다.");
			}
		}
	}
}
