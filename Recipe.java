import java.util.Scanner;

// Class - Defined as a template the describes the behavior/state that the object of its type support
// Object - Have states and behaviors. 
class Recipe{

	String title;
	String contents;

	public static void main(String[] args){
		title = getFileName();
		getContents();
		// Creating a recipe object
		Recipe recipe = new Recipe(title, contents);
	}

	// Constructor
	public Recipe(String title, String contents){
		title = this.title;
		contents = this.contents;
		// String title = fileName;name of the file being read
		// String contents = everything in the file (title, ingredients, steps, from)
	}

	// Ask the user for the file name of the recipe
	public static getFileName(){
		Scanner scan = new Scanner(System.in); // Created a scanner object
		System.out.printlin("File name of the recipe: ");
		String fileName = scan.nextLine(); // Read user input
		return fileName;
	}

	public static getContents(String fileName, String contents){
		String fileName = this.fileName;
		String line = null;

		try{
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while((line = bufferedReader.readline()) != null){
				contents = line;
			}
			return contents;
			// Always close files
			bufferedReader.close();

		}

		catch(FileNotFoundException ex){
			System.out.println("Unable to open file '" + fileName + "'");	
		}
		catch(IOException ex){
			System.out.println("Error reading file '" + fileName + "'");
			// Or we could just do this
			// ex.printStackTrace();
		}
	}


	/*

	// Read the file
	String fileName = "x";
	String line = null;

	try{
		//FileReader reads text fiels in the default encoding
		FileReader fileReader = new FileReader(fileName)

		// Always wrap FileReader in BufferedReader
		BufferedReader bufferedReader = new BufferedReader(fileReader)

		while((line = bufferedReader.readline()) != null){
			System.out.println(line);
		}
		// Always close files
		bufferedReader.close()

	}

	catch(FileNotFoundException ex){
		System.out.println("Unable to open file '" + fileName + "'");	
	}
	catch(IOException ex){
		System.out.println("Error reading file '" + fileName + "'");
		// Or we could just do this
		// ex.printStackTrace();
	}







	// Set the contents to a string variable
	// Set the name of the file to a string title
	// Make a recipe with the contents and title 
	
	*/
}





// Resources
// https://www.caveofprogramming.com/java/java-file-reading-and-writing-files-in-java.html
// https://www.tutorialspoint.com/java/java_object_classes.htm