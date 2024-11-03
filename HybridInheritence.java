//HybridInheritence : 3 or more classes can be inherited from single parent class -- contains alll types of inheritence.

class ParentClass {
    void parentMethod() {
        System.out.println("Parent Method");
    }
}

class ChildClass extends ParentClass {
    void childMethod() {
        System.out.println("Child Method");
    }
}

class GrandChildClass extends ChildClass {
    void grandChildMethod() {
        System.out.println("GrandChild Method");
    }
}


public class HybridInheritence {
    public static void main(String[] args) {
        GrandChildClass grandChild = new GrandChildClass();
        grandChild.parentMethod();
        grandChild.childMethod();
        grandChild.grandChildMethod();
    }
}
