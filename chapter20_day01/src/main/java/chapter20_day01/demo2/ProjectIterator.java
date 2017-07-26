package chapter20_day01.demo2;

import java.util.List;

public class ProjectIterator implements IProjectIterator {

	private List<IProject> projectList = null;
	private int currentItem = 0;

	public ProjectIterator(List<IProject> projectList) {
		super();
		this.projectList = projectList;
	}

	@Override
	public boolean hasNext() {
		boolean b = true;
		if (this.projectList == null || this.currentItem >= this.projectList.size()
				|| this.projectList.get(currentItem) == null) {
			b = false;
		}
		return b;
	}

	@Override
	public IProject next() {

		return this.projectList.get(currentItem++);
	}

}
