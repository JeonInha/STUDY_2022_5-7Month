import java.util.Comparator;

class JudgeWeight implements Comparator<ClubMember> {
	@Override
	public int compare(ClubMember o1, ClubMember o2) {
			if (o1.getWeight()>o2.getWeight()) return 1;
			else if (o1.getWeight()<o2.getWeight()) return -1;
			else return 0;
	}
}

class JudgeTall implements Comparator<ClubMember> {
	@Override
	public int compare(ClubMember o1, ClubMember o2) {
		if (o1.getTall()>o2.getTall()) return 1;
		else if (o1.getTall()<o2.getTall()) return -1;
		else return 0;
	}
}

class JudgeBMI_R implements Comparator<ClubMember> {
	@Override
	public int compare(ClubMember o1, ClubMember o2) {
		if (o1.getBmi()>o2.getBmi()) return -1;
		else if (o1.getBmi()<o2.getBmi()) return 1;
		else return 0;
	}
}

class JudgeName implements Comparator<ClubMember> {
	@Override
	public int compare(ClubMember o1, ClubMember o2) {
		return o1.getName().compareTo(o2.getName());	
		// String이 가지고 있는 compareTo 사용
	}
	
}