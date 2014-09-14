class SeatingChart{
	private Student[][] seats;

	/* @ param 	studentList – students needing seats
	 * @ param	rows – the number of rows of seats
	 * @ param	cols – the number of columns of seats
	 */
	public SeatingChart(ArrayList<Student> studentList, int cols, int rows){
		// Code to initialize seats 
	}
}

class Student{
	private String name;
	private int absences;

	// Constructor – creates a Student object
	public Student(String studentName){
		name = studentName;
	}

	public String toString(){
		return name;
	}

	public String getName(){
		return name;
	}

	public int getAbsenceCount(){
		return absences;
	}
}