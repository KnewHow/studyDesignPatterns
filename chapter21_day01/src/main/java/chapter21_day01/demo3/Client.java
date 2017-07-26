package chapter21_day01.demo3;

import java.util.List;

/**
 * Just emulate practical scene
 * 
 * @author ygh Jul 26, 2017
 */
public class Client {
	public static void main(String[] args) {

		Branch ceo = compositeCorpTree();

		System.out.println(ceo.getInfo());
		System.out.println(getAllSubordinateInfo(ceo));

	}

	public static Branch compositeCorpTree() {
		/**
		 * Root node
		 */
		Branch ceo = new Branch("王大麻子", "总经理", 100000);
		/**
		 * three department manager
		 */
		Branch developDep = new Branch("刘大瘸子", "研发部经理", 10000);
		Branch saleDep = new Branch("马二拐子", "销售经理", 20000);
		Branch financeDep = new Branch("赵三驼子", "财务经理", 30000);

		/**
		 * two head man of R&D
		 */
		Branch firstDevGroup = new Branch("杨三也斜", "开发一组组长", 5000);
		Branch secondDevGroup = new Branch("吴大棒槌", "开发二组组长", 6000);

		Leaf a = new Leaf("a", "发开人员", 2000);
		Leaf b = new Leaf("b", "发开人员", 2000);
		Leaf c = new Leaf("c", "发开人员", 2000);
		Leaf d = new Leaf("d", "发开人员", 2000);
		Leaf e = new Leaf("e", "发开人员", 2000);
		Leaf f = new Leaf("f", "发开人员", 2000);
		Leaf h = new Leaf("a", "销售人员", 5000);
		Leaf i = new Leaf("i", "销售人员", 6000);
		Leaf j = new Leaf("j", "财务人员", 5000);
		Leaf k = new Leaf("k", "CEO秘书", 8000);
		Leaf zhenglaoLiu = new Leaf("郑老六", "研发部副经理", 20000);

		ceo.addSubordinate(developDep);
		ceo.addSubordinate(saleDep);
		ceo.addSubordinate(financeDep);
		ceo.addSubordinate(k);

		developDep.addSubordinate(firstDevGroup);
		developDep.addSubordinate(secondDevGroup);
		developDep.addSubordinate(zhenglaoLiu);

		firstDevGroup.addSubordinate(a);
		firstDevGroup.addSubordinate(b);
		firstDevGroup.addSubordinate(c);

		secondDevGroup.addSubordinate(d);
		secondDevGroup.addSubordinate(e);
		secondDevGroup.addSubordinate(f);

		saleDep.addSubordinate(h);
		saleDep.addSubordinate(i);

		financeDep.addSubordinate(j);

		return ceo;
	}

	public static String getAllSubordinateInfo(Branch root) {
		List<Corp> subordinateList = root.getSubordinateInfo();
		StringBuilder sb = new StringBuilder();
		for (Corp corp : subordinateList) {
			if (corp instanceof Leaf) {
				sb.append(((Leaf) corp).getInfo());
				sb.append("\n");
			} else {
				sb.append(((Branch) corp).getInfo());
				sb.append("\n");
				sb.append(getAllSubordinateInfo((Branch) corp));
			}
		}
		return sb.toString();
	}
}
