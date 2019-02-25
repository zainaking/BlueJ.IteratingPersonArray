



 

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
         String result = "";
        
        int count = 0;

       
        while (count<= personArray.length-1){

            result += personArray[count].toString();
            count ++;

        }



        
        return result;
        
    }



    public String forLoop() {
        
        String result = "";
        // assume there is a `counter`
        int count = 0;

        // while `counter` is less than length of array
        // begin loop
        while (count<= personArray.length-1){

            result += personArray[count].toString();
            count ++;
             
        }
        
         return result;
    } 



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
        // begin loop
        // get `string Representation` of `currentPerson`
        // append `stringRepresentation` to `result` variable
        // end loop
        for(Person currentPerson : personArray ) {


            String stringRepresentation = currentPerson.toString();


            result += stringRepresentation;



        }




        return result;
        
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
