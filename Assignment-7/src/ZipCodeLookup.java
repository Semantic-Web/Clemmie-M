
import java.util.List;
import javax.swing.JOptionPane;
import org.geonames.PostalCode;
import org.geonames.WebService;

public class ZipCodeLookup {
	public static void main(String[] args) {

		String zip = JOptionPane.showInputDialog("Enter Zip code");
		WebService.setUserName("cmalley1");
		try {
			List<PostalCode> p = WebService.postalCodeSearch(zip, "", "US");
			
			for( int i=0; i < p.size(); i++){
				System.out.println("City: \t"+ p.get(i).getPlaceName());
				System.out.println("County: "+ p.get(i).getAdminName2());
				System.out.println("State: \t"+ p.get(i).getAdminName1());

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
