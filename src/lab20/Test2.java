package lab20;

public class Test2 {
	public static void main(String[] args){
		GeometricObject[] go = new GeometricObject[20];
		
		go[0] = new Rectangle(1,2);
		go[10] = new Circle(1);
		
		try{
			for(int i=1;i<10;i++){
				go[i]= (GeometricObject)(go[0].clone());			
			}
			for(int i=11;i<20;i++){
				go[i]= (GeometricObject)(go[10].clone());
			}

			System.out.println("Max is: " + GeometricObject.max(go));
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}
