package lab16;
/**A store has a name, 
 * an address, 
 * a unique identifier (like the SSN number), 
 * and an owner. 
 */
public class Store {
	private String name;
	private String address;
	private int id;
	private String owner;

	public Store(){
	}
	
	public Store(String a, String b, int c, String d){
		name=a;
		address=b;
		id=c;
		owner=d;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String toString(){
		return "name: "+name
				+"\naddress: "+address
				+"\nID: "+id
				+"\nOwner: " +owner;
	}
	
}
