
public class Single {
	
	private Object[] top = null;
    private Object[] end = null;
	private int num;
	
	public void add(Object obj){
		if(top[0]==null){
			top = new Object[]{obj,null};
			end = top;
		}
		
		end[1]=new Object[]{obj,null};
		end = (Object[]) end[1];
		num++;
	}
	
	public int getsize(){
		return num;
	}
	
	    
	 private Object[] next = null;
	public Object getSingle() throws Exception{
		if(next==null){
	       next = top;
		}else{
			if(next[1]==null){
				throw new Exception();
			}
			next = (Object[]) next[1];
		}
		return next[0];
	}
	
	private	Object[] next1 = top;
	private Object[] top1 = null;
	public void remove(Object obj){
		
	  if(next1[0]==obj){
		  top1=(Object[]) next1[1];
		  next1 = (Object[]) top1[1];
		  
	  }
		
		
		
		
		
	}
}
