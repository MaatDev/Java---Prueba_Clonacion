
public class CustomString implements Cloneable {

	public String text;
	
	private String string2;

	public String getString2() {
		return string2;
	}

	public void setString2(String string2) {
		this.string2 = string2;
	}
	
	public CustomString clone(){
		
		try {
			return (CustomString) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	
}
