package com.technical.testing.timeduration;







public class TimeDuration {
	private int second;
	private int min=0;
	private int hr=0;
	
	
	public TimeDuration(int second) {
		//this.second = second;
		if(second<0) {
			//on leve l'exeption
		}
		else {
			int heure = this.convertir(second);
			if()
		}
		
	}
	
	public int convertir(int second) {
		
		while(second>=3600) {
			hr =hr+ second/3600;
			second = second%3600;
		}
		while(second>=60) {
			min =min+ second/60;
			second = second%60;
		}
		return hr;
	}
	public String toString(int second, int min, int hr) {
		String newHour = new String();
		newHour = String.valueOf(hr);
		String newMin = new String();
		newMin = String.valueOf(min);
		String newSec = new String();
		newSec = String.valueOf(hr);
		String formatedOutput = newHour+"h"+newMin+"h"+newSec+"h";
		return  formatedOutput;
		//return 
	}

}
