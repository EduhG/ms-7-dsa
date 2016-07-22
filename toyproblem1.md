```java
package toyproblem1;

public class problem1 {

	public String ThirdGreatest(String[]strArr){
		boolean sort = true;
		String strValue = "" , result="";
		
		while(sort){//beginning of bubble sort
			
			for(int i=0; i<strArr.length;i++){//loop thru the array
				if(strArr[i].length() <  
						strArr.length[i+1].length()){//compare lengths of the array elements
					strValue=strArr[i];//assign current element to a string
					strArr[i]=strArr[i+1];//swap the current element with the next value
					strArr[i+1]=strValue;//assign the next value with the strvalue
					sort=false;//make sort=true ti aviud infinite looping.
					
				}
				
			}//end of comparing
			
		}//end of looping array
	}//end of sort
	if(strArr.length < 3 && str.length > 0){
		result = strArr [strArr.lenth-1];
	}else{
		result = strArr[2];
	}
	return result;
}

