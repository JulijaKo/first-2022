package hw1;

import org.junit.jupiter.api.Test;

public class AddPracticeTest {
    @Test
    public void practice() {
        BadLinenSet badLinenSet = new BadLinenSet();

        badLinenSet.setMaterial("Cotton");
        badLinenSet.setStyle("Ethnic");
        badLinenSet.setDuvetCoverSize("2x2");
        badLinenSet.setNumberOfPieces(4);
        badLinenSet.setColor("Green");
        badLinenSet.setEmpty(' ');

        System.out.println("Hello, Guru!");
        System.out.println(badLinenSet.getEmpty());
        System.out.println("BED SET:");
        System.out.println(badLinenSet.getMaterial());
        System.out.println(badLinenSet.getStyle());
        System.out.println(badLinenSet.getDuvetCoverSize());
        System.out.println(badLinenSet.getNumberOfPieces());
        System.out.println(badLinenSet.getColor());
        System.out.println(badLinenSet.getEmpty());

        Bed bed = new Bed();

        bed.setForm("Square");
        bed.setWidth(2.5);
        bed.setMaterial("Velours");
        bed.setMaterialColor("Brown");
        bed.setMattressQuality("Anatomic");
        bed.setTransformationMechanism("Book");

        System.out.println("YOUR DREAM BED:");
        System.out.println(bed.getForm());
        System.out.println(bed.getWidth());
        System.out.println(bed.getMaterial());
        System.out.println(bed.getMaterialColor());
        System.out.println(bed.getMattressQuality());
        System.out.println(bed.getTransformationMechanism());
        System.out.println(badLinenSet.getEmpty());

        Book book = new Book();

        book.setPaperQuality("Offset");
        book.setNumberOfPages(124);
        book.setGenre("Novel");
        book.setAuthor("William Somerset Maugham");
        book.setTitle("Theatre");
        book.setPrice(5.46);

        System.out.println("BOOK:");
        System.out.println(book.getPaperQuality());
        System.out.println(book.getNumberOfPages());
        System.out.println(book.getGenre());
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(book.getPrice());
        System.out.println(badLinenSet.getEmpty());

        Diet diet = new Diet();

        diet.setCalories(1200);
        diet.setTitle("Mediterranean");
        diet.setDuration(10);
        diet.setProducts("Seafood");
        diet.setExpectedResult(5);

        System.out.println("DIET:");
        System.out.println(diet.getCalories());
        System.out.println(diet.getDuration());
        System.out.println(diet.getTitle());
        System.out.println(diet.getProducts());
        System.out.println(diet.getExpectedResult());
        System.out.println(badLinenSet.getEmpty());

        Dish dish = new Dish();

        dish.setColor("Blue");
        dish.setMaterial("Glass");
        dish.setStyle("Modern");
        dish.setSize(16);
        dish.setPattern("Monochromatic");
        dish.setShape("Round");

        System.out.println("DISH:");
        System.out.println(dish.getColor());
        System.out.println(dish.getMaterial());
        System.out.println(dish.getPattern());
        System.out.println(dish.getShape());
        System.out.println(dish.getStyle());
        System.out.println(dish.getSize());
        System.out.println(badLinenSet.getEmpty());

        House house = new House();

        house.setAddress("221B, Baker str.");
        house.setLocation("London");
        house.setNumberOfFlats(6);
        house.setNumberOfFloors(4);
        house.setPutIntoOperation(1815);

        System.out.println("HOUSE:");
        System.out.println(house.getAddress());
        System.out.println(house.getLocation());
        System.out.println(house.getNumberOfFlats());
        System.out.println(house.getNumberOfFloors());
        System.out.println(house.getPutIntoOperation());
        System.out.println(badLinenSet.getEmpty());

        Human human = new Human();

        human.setAge(40);
        human.setEducation("Middle");
        human.setHeight(1.72);
        human.setGender("Male");
        human.setNationality("German");

        System.out.println("HUMAN:");
        System.out.println(human.getAge());
        System.out.println(human.getEducation());
        System.out.println(human.getGender());
        System.out.println(human.getHeight());
        System.out.println(human.getNationality());
        System.out.println(badLinenSet.getEmpty());

        Pencil pencil = new Pencil();

        pencil.setColor("Black");
        pencil.setSize(12.36);
        pencil.setPrice(0.20);
        pencil.setMaterial("Wood");
        pencil.setHardness('2');

        System.out.println("PENCIL:");
        System.out.println(pencil.getColor());
        System.out.println(pencil.getSize());
        System.out.println(pencil.getMaterial());
        System.out.println(pencil.getPrice());
        System.out.println(pencil.getHardness());
        System.out.println(badLinenSet.getEmpty());

        RosesInAVase rosesInAVase = new RosesInAVase();

        rosesInAVase.setColor("Red");
        rosesInAVase.setAmount(7);
        rosesInAVase.setSort("Tea roses");
        rosesInAVase.setVaseForm("Cone");
        rosesInAVase.setVaseMaterial("Glasses");

        System.out.println("ROSES:");
        System.out.println(rosesInAVase.getColor());
        System.out.println(rosesInAVase.getAmount());
        System.out.println(rosesInAVase.getSort());
        System.out.println(rosesInAVase.getVaseForm());
        System.out.println(rosesInAVase.getVaseMaterial());
        System.out.println(badLinenSet.getEmpty());

        Table table = new Table();

        table.setForm("Square");
        table.setHeight(0.75);
        table.setWidth(0.82);
        table.setLength(1.50);
        table.setPurpose("Kitchen");

        System.out.println("TABLE:");
        System.out.println(table.getForm());
        System.out.println(table.getHeight());
        System.out.println(table.getLength());
        System.out.println(table.getWidth());
        System.out.println(table.getPurpose());
        System.out.println(badLinenSet.getEmpty());





    }

}
