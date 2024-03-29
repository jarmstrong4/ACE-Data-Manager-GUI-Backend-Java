package project1;


import java.util.ArrayList;

public interface AceDataManagerADT {
	public void addPatient (PatientADT p); //Adds a new patient to the data set
	public PatientADT getPatient (String id); //returns the patient with the given identifier,
               // null if the patient is not in the data set
	public ArrayList<String> getRiskFactors (ArrayList<String> aces); // returns an arraylist 
		 // containing all of the risk factors associated with the input list of ACEs
	public void writeToFile (); // write to the file set during instantiation
	public void writeToFile (String fn); // write to the file indicated in parameter
	public ArrayList<String> getAllIDs();
	public String toString(); //Returns a string representation of the ACE patient and 					
	// risk factors data manager
	public void RemovePatient(PatientADT p);

	public String[] getAceList (); // get a string array of the aces
}
