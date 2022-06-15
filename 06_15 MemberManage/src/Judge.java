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

class JudgeBMI implements Comparator<ClubMember> {
	@Override
	public int compare(ClubMember o1, ClubMember o2) {
		if (o1.getBmi()>o2.getBmi()) return 1;
		else if (o1.getBmi()<o2.getBmi()) return -1;
		else return 0;
	}
}