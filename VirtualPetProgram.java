import java.util.Scanner;
// Create the main class
public class VirtualPetProgram {
    // Create the main method
    public static void main(String[] args) {
        // Initialize the Scanner
        Scanner input = new Scanner(System.in);
        int option;

        // Start the user experience
        System.out.println("Welcome to the Virtual Pet Program!");
        System.out.print("What would you like to name your pet? ");
        // Create the VirtualPet object
        VirtualPet pet = new VirtualPet(input.nextLine());
        // Use the do - while loop for the program to run
        do {
            // Giving the information to the user
            System.out.println("\n-----------------------------------------------------------------");
            System.out.println("Please enter the integer for the option you choose:");
            System.out.println("  1. Check statuses");
            System.out.println("  2. Feed your virtual pet");
            System.out.println("  3. Play with your virtual pet");
            System.out.println("  4. Clean your virtual pet");
            System.out.println("  5. End program");
            System.out.print("\nYour choice: ");

            // Get the choice from the user.
            option = input.nextInt();

            switch (option) {
                case 1:     // Check statuses
                    // Retrieve the values using the Getter methods.
                    System.out.println("\nValues for " + pet.getName());
                    System.out.println("  Happiness: " + pet.getHappiness());
                    System.out.println("  Energy: " + pet.getEnergy());
                    System.out.println("  Hygiene: " + pet.getHygiene());
                    break;
                case 2:     // Feed your virtual pet
                    // Call feed() instance method. VirtualPet's feed() method should be doing all the work.
                    if (pet.feed()) {
                        System.out.println("\nYou fed " + pet.getName() + ".");
                    } else {
                        System.out.println("\nYou couldn't feed " + pet.getName() + " due to a restriction.");
                    }
                    break;
                case 3:     // Play with your virtual pet
                    // Call play() instance method. VirtualPet's play() method should be doing all the work.
                    if (pet.play()) {
                        System.out.println("\nYou played with " + pet.getName() + ".");
                    } else {
                        System.out.println("\nYou couldn't play with " + pet.getName() + " due to a restriction.");
                    }
                    break;
                case 4:     // Clean your virtual pet
                    // Call clean() instance method. VirtualPet's clean() method should be doing all the work.
                    if (pet.clean()) {
                        System.out.println("\nYou cleaned " + pet.getName() + ".");
                    } else {
                        System.out.println("\nYou couldn't clean " + pet.getName() + " due to a restriction.");
                    }
                    break;
                case 5:     // End program
                    // Display a summary depending on how high the happiness is.
                    System.out.println("Thank you for playing! Here is a summary of your pet's experience:");
                    if (pet.getHappiness() >= 100) {
                        System.out.println("  You did a PERFECT job! Your pet loves you!");
                    } else if (pet.getHappiness() >= 80) {
                        System.out.println("  You did pretty well! Your pet likes you.");
                    } else if (pet.getHappiness() >= 60) {
                        System.out.println("  You did okay. Your pet isn't as happy as it could be.");
                    } else {
                        System.out.println("  You could have done a lot better. Your pet isn't very happy.");
                    }
                    break;
                default:        // User selected an invalid option.
                    System.out.println("\nPlease select a valid option.");
            }
        } while (option != 5);

    }
}

// Create the VirtualPet class
class VirtualPet {
    // Initialize the variables
    String name;
    int happiness = 0;
    int energy = 0;
    int hygiene = 0;
    // Create the getter method
    public String getName() {
        return name;
    }
    // Create the setter method
    public void setName(String name) {
        // Check the name to make sure the character is less than 30
        if (name.length() < 30) {
            this.name = name;
        } else {
            this.name = "DEFAULT";
        }
    }
    //Creater the getter and setter methods
    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getHygiene() {
        return hygiene;
    }

    public void setHygiene(int hygiene) {
        this.hygiene = hygiene;
    }
    // Create the boolean feed method and check the energy level with restriction
    public boolean feed() {
        if (energy < 80) {
            happiness += 5;
            updateHappiness(happiness);
            energy += 30;
            updateEnergy(energy);
            return true;
        } else {
            return false;
        }
    }
    // Create the boolean play method and check the energy level with restriction
    public boolean play() {
        if (energy > 30) {
            happiness += 20;
            updateHappiness(happiness);
            energy -= 15;
            updateEnergy(energy);
            hygiene -= 30;
            updateHygiene(hygiene);
            return true;
        } else {
            return false;
        }
    }
    // Create the boolean clean method and check the energy level with restriction
    public boolean clean() {
        if (energy < 70) {
            hygiene += 50;
            updateHygiene(hygiene);
            happiness -= 20;
            updateHappiness(happiness);
            return true;
        } else {
            return false;
        }
    }
    // Create the VirtualPet constructor with a parameter
    public VirtualPet(String name) {
        setName(name);
        happiness = 25;
        energy = 25;
        hygiene = 50;
    }
    // Create the VirtualPet constructor without a parameter
    public VirtualPet() {
        hygiene = 25;
        energy = 25;
        hygiene = 50;
        this.name = "DEFAULT";
    }
    // Create the updateEnergy method to restrict the energy level
    public void updateEnergy(int energy) {
        if (energy < 1) {
            setEnergy(1);
        } else if (energy > 100) {
            setEnergy(100);
        } else {
            setEnergy(energy);
        }
    }
    // Create the updateHappiness method to restrict the happiness level
    public void updateHappiness(int happiness) {
        if (happiness < 1) {
            setHappiness(1);
        } else if (happiness > 100) {
            setHappiness(100);
        } else {
            setHappiness(happiness);
        }
    }
    // Create the updateHygiene method to restrict the hygiene level
    public void updateHygiene(int hygiene) {
        if (hygiene < 1) {
            setHygiene(1);
        } else if (hygiene > 100) {
            setHygiene(100);
        } else {
            setHygiene(hygiene);
        }
    }
}

