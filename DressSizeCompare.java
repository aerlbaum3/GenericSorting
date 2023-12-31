import java.util.Comparator;

public class DressSizeCompare implements Comparator<Dress> {

	@Override
	public int compare(Dress dress1, Dress dress2) {
		
		return dress1.getSize() - dress2.getSize();
	}

}
