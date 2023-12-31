import java.util.Comparator;

public class DressStyleCompare implements Comparator<Dress>{

	@Override
	public int compare(Dress dress1, Dress dress2) {
	
		return dress1.getStyle().compareTo(dress2.getStyle());
	}
	

}
