import java.util.Comparator;

public class DressPriceCompare implements Comparator<Dress>{

	

@Override
public int compare(Dress dress1, Dress dress2) {
	
	return (int) (dress1.getPrice() - dress2.getPrice());
}
}
