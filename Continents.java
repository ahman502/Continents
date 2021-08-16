/* A program that will print out a continent and the largest city in that continent, based on the value of an integer */

public class Continents {

  //initializing the continent (instance field) to 4
  int continent = 4;

  //constructor method to check the number of continent
  public void checkContinent(int continentNum) {

      continent = continentNum;

      //using switch case statements to print out the right continent and the city based on the int given
      switch(continentNum) {

        //if the int passed is 1
        case 1:
        System.out.println("North America: Mexico City, Mexico");
        break;

        //if the int passed is 2
        case 2:
        System.out.println("South America: Sao Paulo, Brazil");
        break;

        //if the int passed is 3
        case 3:
        System.out.println("Europe: Moscow, Russia");
        break;

        //if the int passed is 4 (our original case because the continent is intialized to 4 in the instance field)
        case 4:
        System.out.println("Africa: Lagos, Nigeria");
        break;

        //if the int passed is 5
        case 5:
        System.out.println("Asia: Shanghai, China");
        break;

        //if the int passed is 6
        case 6:
        System.out.println("Australia: Sydney, Australia");
        break;

       //if the int passed is 7
        case 7:
        System.out.println("Antarctica: McMurdo Station, US");
        break;

        //for any integers other than 1-7
        default:
        System.out.println("Undefined continent!");
        break;
      }
  }

  //main method for testing
	public static void main(String[] args) {

    //new instance of Continents class
		Continents lookUp = new Continents();
    //testing the check continent method on the instance using different ints
    lookUp.checkContinent(4);
    lookUp.checkContinent(5);
    lookUp.checkContinent(8);  //should return undefined continent (default case)
    lookUp.checkContinent(7);
    lookUp.checkContinent(2);
    lookUp.checkContinent(3);
    lookUp.checkContinent(1);
    lookUp.checkContinent(6);

	}
}
