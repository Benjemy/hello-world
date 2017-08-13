
public class test1 {
	public static void main(String[] args) {
		 Counter test=new Counter();
		 test.setMaxValue(9);
		 test.setCount(5);
		 System.out.println("计数器的值："+test.getCount());
		 System.out.println("计数器的最大值："+test.getMaxValue());

	}

}
class Counter{
	private int count;
	private int maxValue;
	public void increment(){
		this.count++;
		if(this.count>this.maxValue){
			System.out.println("超过最大值，程序结束");			
		}
		
	}
	public void decrement(){
		this.count--;
		if(this.count<0){
			System.out.println("计数器为负数，程序结束");
		}
	}
	public void setCount(int value){
		this.count=value;
		if(this.count>maxValue){
			System.out.println("超过最大值，程序结束");
		}
	}
	public void setMaxValue(int value1){
		this.maxValue=value1;
		if(this.maxValue>2147483647){
			System.out.println("超过int数据类型最大值，程序结束");
		}
	}
	public int getCount(){
		return this.count;
	}
	public int getMaxValue(){
		return this.maxValue;
	}
}