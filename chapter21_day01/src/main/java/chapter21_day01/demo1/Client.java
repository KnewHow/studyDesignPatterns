package chapter21_day01.demo1;

import java.util.List;

/**
 * Just emulate practical scene
 * 
 * @author ygh Jul 26, 2017
 */
public class Client {
	public static void main(String[] args) {
		/**
		 * Root node
		 */
		IRoot ceo = new Root("王大麻子", "总经理", 100000);
		/**
		 * three department manager
		 */
		IBranch developDep = new Branch("刘大瘸子", "研发部经理", 10000);
		IBranch saleDep = new Branch("马二拐子", "销售经理", 20000);
		IBranch financeDep = new Branch("赵三驼子", "财务经理", 30000);

		/**
		 * two head man of R&D
		 */
		IBranch firstDevGroup = new Branch("杨三也斜", "开发一组组长", 5000);
		IBranch secondDevGroup = new Branch("吴大棒槌", "开发二组组长", 6000);

		ILeaf a = new Leaf("a", "发开人员", 2000);
		ILeaf b = new Leaf("b", "发开人员", 2000);
		ILeaf c = new Leaf("c", "发开人员", 2000);
		ILeaf d = new Leaf("d", "发开人员", 2000);
		ILeaf e = new Leaf("e", "发开人员", 2000);
		ILeaf f = new Leaf("f", "发开人员", 2000);
		ILeaf h = new Leaf("a", "销售人员", 5000);
		ILeaf i = new Leaf("i", "销售人员", 6000);
		ILeaf j = new Leaf("j", "财务人员", 5000);
		ILeaf k = new Leaf("k", "CEO秘书", 8000);
		ILeaf zhenglaoLiu = new Leaf("郑老六", "研发部副经理", 20000);

		ceo.add(developDep);
		ceo.add(saleDep);
		ceo.add(financeDep);
		ceo.add(k);

		developDep.add(firstDevGroup);
		developDep.add(secondDevGroup);
		developDep.add(zhenglaoLiu);

		firstDevGroup.add(a);
		firstDevGroup.add(b);
		firstDevGroup.add(c);

		secondDevGroup.add(d);
		secondDevGroup.add(e);
		secondDevGroup.add(f);

		saleDep.add(h);
		saleDep.add(i);

		financeDep.add(j);
		System.out.println(ceo.getInfo());
		getAllSubordinateInfo(ceo.getSubordinateInfo());

	}

	public static void getAllSubordinateInfo(List<?> list) {
		int length = list.size();
		for (int m = 0; m < length; m++) {
			Object s = list.get(m);
			if (s instanceof Leaf) {
				System.out.println(((Leaf) s).getInfo());
			} else {
				Branch branch = (Branch) s;
				System.out.println(branch.getInfo());
				getAllSubordinateInfo(branch.getSubordinateInfo());
			}
		}
	}
}
