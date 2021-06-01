package Demo_Chi_Chau;

import java.io.*;

public class DemoCSV {
    public void writeFile(String path, Student student) throws IOException {
        FileWriter fr = new FileWriter(path);
        BufferedWriter bf=new BufferedWriter(fr);
        bf.write(student.getName()+ ","+student.getAge());
        bf.close();
        fr.close();
    }
    public Student readFile(String path) throws IOException {
        FileReader fw= new FileReader(path);
        BufferedReader bw=new BufferedReader(fw);
        String content = bw.readLine();
        String [] value=content.split(",");
        Student student=new Student(value[0],Integer.parseInt(value[1]));
        return student;
    }
}
