//file Student.java
public abstract class Student {
    int x,y;

    void moveTo(int newX, int newY){
        System.out.println("move to x:"+x+" and y:"+y);
    }
  //functions of draw and resize are abstracted here and the functionalities are present in Circle.java
    abstract void draw();
    abstract void resize();
}

//file Circle.java (Circle inherits Student)
public class Circle extends Student{
    void draw(){
        System.out.println("Drawing a circle");
    }
    void resize(){
        System.out.println("Resizing a circle");
    }
}
