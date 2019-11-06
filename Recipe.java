
class Recipe{

	public static void main(String[] args){
		// Creating a recipe object
		Recipe recipe = new Recipe();
	}

	// Constructor
	public Recipe(){
	}







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

}





// Resources
// https://www.caveofprogramming.com/java/java-file-reading-and-writing-files-in-java.html