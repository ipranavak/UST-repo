package demo;

public interface Shape {
	public void draw();

}
class Triangle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		int a, b;

        
        for (a = 0; a < 5; a++) {

            
            for (b = 0; b <= a; b++) {
                
                System.out.print("* ");
            }

            
            System.out.println();
	}
	
}	
}
class Square implements Shape{

	@Override
	public void draw() {
		
		int a, b;

       

       
        for (a = 1; a <= 3; a++) {
           
            for (b = 1; b <= 4; b++) {
                
                if (a == 1 || a == 3 || b == 1 || b == 4)

                    System.out.print("*");
                else

                   
                    System.out.print(" ");
            }

         
            System.out.println();
        
	}
	}
}
class Perform {
	public static void main(String[] args) {
		Triangle T=new Triangle();
		T.draw();
		Square S=new Square();
		S.draw();
	}
}


