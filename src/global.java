//class global is the subclass of HelloWorld: Below in comment is the definition of HelloWorld class.
//
//public class HelloWorld {
//	protected int number = 3;
//}


/**
 * @@@ WHAT WE LEARN:
 * 1. instanceof only look at the object at the right-hand-side of declaration.
 * 2. method still follows bottom-most convention in casting.
 * 3. var does not.
 * 4. casting only works for any ancestors of right-hand-side object.
 *  
 * @author tracy
 */

public class global extends HelloWorld{
	
	private int number = 4;
	@Override
	public String toString(){
		return "hah";
	}
	
	public static void main(String[] args){
		HelloWorld a = new HelloWorld();
		global c = new global();
		Object b = new Object();
		
		HelloWorld superhandsome = new global(); // superhandsome can be cast to be any ancestors of global;
		
//		System.out.println( ((Object) a) instanceof HelloWorld);//true
//		System.out.println( ((Object) superhandsome) instanceof global);//true
//		System.out.println( superhandsome instanceof HelloWorld); //true
//		System.out.println( (global) superhandsome instanceof global); //true
		
//		System.out.println( ((HelloWorld) b) instanceof HelloWorld); //error, because it was assigned to be Object.
		
//		System.out.println( ((HelloWorld) c).toString()); // "hah", call global's method.
//		System.out.println( ((HelloWorld) c).number); //3, HelloWorld's variable.
//		System.out.println( ((global) a).number); // error, because a was assigned to be a HelloWorld
		System.out.println( ((global) superhandsome).number); // 4
		}
	
}
