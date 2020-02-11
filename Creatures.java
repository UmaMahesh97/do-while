class Creatures { String getName() { return "Creatures";

}

}
class Bird extends Creature { String getName() {

return "Bird";

}

boolean hasFeather(){ return true;

}

}

public class Tester {

public static void main(String[] args) { Creature c1=new Bird(); System.out.println(c1.getName()); System.out.println(c1.hasFeather()); Creature c2=new Creature(); System.out.println(c2.getName());

}

}