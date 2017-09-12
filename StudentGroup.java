import java.util.Date;
import java.util.*;

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
		/*for( i=0;i<length;i++)
		{
			Scanner sc=new Scanner(System.in);
			int id=sc.nextInt();
			String fullName=sc.next();
			Date birthDate=sc.nextDate();
			double avgMark=sc.nextInt();
			students[i]=new Student(id,fullName,birthDate,avgMark);
		}*/
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
		Student s1=new Student();
		s1.setId(students[index].getId());
		s1.setFullName(students[index].getFullName());
		s1.setBirthDate(students[index].getBirthDate());
		s1.setAvgMark(students[index].getAvgMark());
		
		return s1;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		students[index].setId(student.getId());
		students[index].setFullName(student.getFullName());
		students[index].setBirthDate(student.getBirthDate());
		students[index].setAvgMark(student.getAvgMark());
		
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		Student a[]=new Student[length+1];
		a[0].setId(student.getId());
		a[0].setFullName(student.getFullName());
		a[0].setBirthDate(student.getBirthDate());
		a[0].setAvgMark(student.getAvgMark());
		for(j=1;j<length+1;j++)
		{
			a[j].setId(students[j-1].getId());
			a[j].setFullName(students[j-1].getFullName());
			a[j].setBirthDate(students[j-1].getBirthDate());
			a[j].setAvgMark(students[j-1].getAvgMark());
		}
		students=a;
		length=students.length;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		Student b[]=new Student[length+1];
		
		b[length].getId();
		b[length].getFullName();
		b[length].getBirthDate();
		b[length].getAvgMark();
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
