class SeatingChart{
	private Student[][] seats;

	/* @ param	studentList – list of students in the class
	 * @ param	rows – number of rows in the classroom
	 * @ param  cols – number of columns in the classroom
	 * @ consturcts – a seatching chart that places the students in seats
	 */
	public SeatingChart(List<Student> studentList, int rows, int cols){
		seats = new Student[cols][rows];
		int studentIndex = 0;
		for(int c = 0; c < cols; c++){
		    for(int r = 0; r < rows; r++){
		        if(studentIndex < studentList.size()){
		            seats[c][r] = studentList.get(studentIndex);
		            studentIndex++;
		        }
		    }
		}
	}

	/* @ param	allowedAbsences – an integer >= 0
	 * @ return	the number of students removed from seats
	 */
	public int removeAbsentStudents(int allowedAbsences){
		// Ensures that SeatingChart seats only contains students with
		// fewer than allowedAbsences absences.
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
		return "[Name: " + name + ", absences: " + absences + "]";
	}

	public String getName(){
		return name;
	}

	public int getAbsenceCount(){
		return absences;
	}
}