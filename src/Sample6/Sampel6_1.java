package Sample6;

class Sample6_1 {
	public static void main(String[] args){
		Car car1 = new Car("13號車");
		car1.start();
		
		for(int i = 0; i < 5; i++){
			System.out.println("正在進行main()的處理工作");
		}
	}
}

class Car extends Thread{
	
	private String name;
	
	public Car(String n){
		name = n;
	}
	
	public void run(){
		for(int i = 0; i < 5; i++){
			System.out.println("正在進行" + name + "的處理工作");
		}
	}
}

