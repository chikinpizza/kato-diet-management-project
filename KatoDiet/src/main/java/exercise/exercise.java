package exercise;

public class exercise {
	String userid;
	String date;
	String time;
	String exercise_type;
	String duration;
	String caloriesBurn;

	public String getCaloriesBurn() {
		return caloriesBurn;
	}

	public void setCaloriesBurn(String exercise_type, String duration) {
		
		double durationX = Double.parseDouble(duration);
		switch(exercise_type) {
			case "Bicycling":
				caloriesBurn = Double.toString(durationX * 292);
				break;
			case "Hiking" : 
				caloriesBurn = Double.toString(durationX * 438);
				break;
			case "Running" :
				caloriesBurn = Double.toString(durationX * 606);
				break;
			case "Swimming" :
				caloriesBurn = Double.toString(durationX * 423);
				break;
			case "Walking" :
				caloriesBurn = Double.toString(durationX * 314);
				break;
		}
		
	}
	
	public void setCaloriesBurn(String caloriesBurn) {
		this.caloriesBurn=caloriesBurn;
	}


	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getExercise_type() {
		return exercise_type;
	}

	public void setExercise_type(String exercise_type) {
		this.exercise_type = exercise_type;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String string) {
		this.duration = string;
	}
}
