public class library {
    public  String name, surName;
    public  int bookId;
    public  int studentNum;


    public  library (String name, String surname, int bookId, int studentNum){

        this.name = name;
        this.surName = surname;
        this.bookId = bookId;
        this.studentNum = studentNum;

    }

    public  String getName(){
        return  name;
    }
    public String getSurname(){
        return surName;
    }
    public  int getBookId(){return bookId;}
    public int getStudentNum(){
        return studentNum;
    }

}
