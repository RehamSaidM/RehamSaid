import java.io.File;

public class FirstFile {
    public static void main(String[] args) {
        int age = 8;
        Student RehamData = new Student();
        System.out.println("Name: " + RehamData.name);
        System.out.println("Civil ID: " + RehamData.civilIdNumber);
        System.out.println("Mobile Number: " + RehamData.mobileNum);
        System.out.println("Email: " + RehamData.email);
        System.out.println("Address: " + RehamData.address);
        System.out.println("Date of Birth: " + RehamData.dateOfBirth);
        System.out.println("Graduated: " + RehamData.isGraduated);
        System.out.println("Resume Link: " + RehamData.resumeLink);
        System.out.println("Qualification: " + RehamData.qualification);
        System.out.println("Major: " + RehamData.major);
        System.out.println("University: " + RehamData.university);

        if (true){
            String name = "Reham";
            System.out.println(name);
        }
    loopExamples();
    }
//    public static void printFunctionForMyself(){
//        System.out.println(age);
//    }

    public static void loopExamples(){
//        //for loop
        String[] names = {"Reham" , "Asma" , "Mohamed" , "Ahmed" , "Said"};
        for (int i = 0; i < names.length; i++){
            System.out.println("Hi" + " " + names[i]);
        }
        //while loop
        //do-while
        //for-each loop
    }
}