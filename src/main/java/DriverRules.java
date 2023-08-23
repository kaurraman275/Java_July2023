public class DriverRules {

        int age;
        String name;
        public double ageCalculator(int i) throws AgeLimitException{
            try {
                if (age < 18) {
                    throw new AgeLimitException("Age limit is less than 18 years");
                }
            }catch(Exception e){
                System.out.println("It should be under age limit only");
            }


            return age;
        }}
