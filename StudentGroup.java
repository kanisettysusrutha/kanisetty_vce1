import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	int i,j,length;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() throws IllegalArgumentException{
		//d your implementation here
		for( i=0;i<length;i++)
		{
			Scanner sc=new Scanner(System.in);
			int id=sc.nextInt();
			String fullName=sc.nextString();
			Date birthDate=sc.nextDate();
			double avgMark=sc.nextInt();
			students[i]=new Student(id,fullName,birthDate,avgMark);
		}
			return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		for(i=0;i<length;i++)
		{
		students[i].setId(students[i].getId());
		students[i].setFullName(students[i].getFullName());
		students[i].setBirthDate(students[i].getBirthDate());
		students[i].setAvgMark(students[i].getAvgMark());
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		
		students[index].getId();
		students[index].getFullName();
		students[index].getBirthDate();
		students[index].getAvgMark();
		
		return students;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		students[index].setId(getId());
		students[index].setFullName(getFullName());
		students[index].setBirthDate(getBirthDate());
		students[index].setAvgMark(getAvgMark());
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		students a[]=new students[length+1];
		a[0].setId(student.setId(getId()));
		a[0].setId(student.setFullName(getFullName()));
		a[0].setId(student.setBirthdate(getBirthDate()));
		a[0].setId(student.setAvgMark(getAvgMark()));
		for(j=1;j<length+1;j++)
		{
			a[j].setId(students[j-1].setId(getId()));
			a[j].setId(students[j-1].setFullName(getFullName()));
			a[j].setId(students[j-1].setBirthdate(getBirthDate()));
			a[j].setId(students[j-1].setAvgMark(getAvgMark()));
		}
		students=a;
		length=students.length();
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		students b[]=new students[length+1];
		students=b;
		students[length].setId(student.getId());
		students[length].setId(student.getFullName());
		students[length].setId(student.getBirthDate());
		students[length].setId(student.getAvgMark());
		students=b;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
