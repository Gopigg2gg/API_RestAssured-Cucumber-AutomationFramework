package com.Kiddo.Constants;

import java.util.HashMap;

public class TestData {
	
	public static final int Status_Code_200 = 200;
	public static final int Status_Code_400 = 400;
	public static final int Status_Code_422 = 422;
		
	
// Add Parent Test Data.
	
	public static final String Name = "GoodParents";
	public static final String FirstName = "Gopinath";
	public static final String LastName = "Angusamy";
	public static final String Email = "gopinath@gmail.com";
	public static final String Unit= "US/Imperial";
	public static final String Phone = "9538402411";
	public static final String Pic_url = "https://lh4.googleusercontent.com/-SGMt9dBEFls/AAAAAAAAAAI/AAAAAAAAAAA/AMZuuclhEg6eHb_qjabU9OqrmKCirv3nQg/photo.jpg";
	public static final String OccupationName = "Information Technology";
	public static final int Occupation_id = 11;
	public static final String Company_name = "GoodParents";
	public static final String Latitude = "-0.8621";
	public static final String Longitude = "-134.5762";
	public static final String Address = "ICPL 671 Heidenreich Inlet, Bernhardmouth, USA";
	
// Update Parent Test Data.
	
    public static final String UpdateName = "UpdateGoodParents";
	public static final String UpdateFirstName = "UpdateGopinath";
	public static final String UpdateLastName = "UpdateAngusamy";
	public static final String UpdateEmail = "Updategopi@gmail.com";
	public static final String UpdateUnit= "UpdateUS/Imperial";
	public static final String UpdatePhone = "8825633434";
	public static final String UpdatePic_url = "https://lh4.googleusercontent.com/-SGMt9dBEFls/AAAAAAAAAAI/AAAAAAAAAAA/AMZuuclhEg6eHb_qjabU9OqrmKCirv3nQg/photo.jpg";
	public static final String UpdateOccupationName = "UpdateInformation Technology";
	public static final int UpdateOccupation_id = 11;
	public static final String UpdateCompany_name = "UpdateGoodParents";
	public static final String UpdateLatitude = "-0.90";
	public static final String UpdateLongitude = "-134.90";
	public static final String UpdateAddress = "Update Inlet, Bernhardmouth, USA";
	
// Invalid Parent id 
	
	public static final String InvalidParentiD = "6423e6965179a43a61ad6151";
	public static final String ParentNoChild = "Parents are not available for this Child";
	
	public static final String InvalidChildiD = "63eb694ee82a1b42bae55f13";
	public static final String InvalidDeviceStatus= "Provided device or child id is incorrect";
// Delete Parent Test Data
	
	public static final String Method = "delete";
	public static final String Status = "Parent deleted Successfully";

// Add Child 	

	public static final String ChildFirstName = "ICPL";
	public static final String ChildLastName = "Gopi";
	public static final String ChildDOB = "24, 04, 2015";
	public static final String ChildGender = "Girl";
	public static final String Weight = "9538402411";
	public static final String Height= "78";
	public static final String WeightUnits = "kg";
	public static final String HeightUnits = "cm";
	public static final String Bmi = "34";
	public static final String BmiPercentile = "23";	
	public static final String Gait = "345";
	
//Update AddChild
	
	public static final String UpdateChildFirstName = "UpdateICPL";
	public static final String UpdateChildLastName = "UpdateGopi";
	public static final String UpdateChildDOB = "24, 04, 2023";
	public static final String AsthmaStatus = "true";
	
//Deletechild
	
	public static final String ChildStatus = "Child deleted Successfully";
	
// Add Devices
	public static final String DeviceUUID = "123456";
	public static final String Message = "Device_id or Authorization is missing";
	public static final String Result =  "child_id or Authorization is missing";
	
// Delete Device
	
	public static final String DeviceStatus = "devices for child deleted";
	
//GetGoal
	
	public static final String Invalid_Goal = "child_id is invalid";

//	Get Recommendation

	public static final String Recommendation_Success = "true";
	public static final String Invalid_Recom = "check the parameters of your request, something is off";
	public static final String Emotion = "You child is feeling well, great job!";
	public static final String Bpm = "Keep your child moving - its great for their heart";
	public static final String Temperature = "Regular eating and playing is working";
	public static final String Sleep = "Your child is sleeping well, great job!";
	public static final String Steps =  "Your child is doing well, great job";
	public static final String Act_type = "Your child is doing well, great job";

//PostBio Test Data 
	
	public static final String Status_PostBio = "Successfully synced";
	public static final int Type = 13;
	public static final int Timestamp = 1672568243;
	public static final int Gsr = 4017;
	public static final int Temp = 23;
	public static final int heartrate = 72;
	public static final int spo2 =  95;
	public static final int steps  = 10;
	public static final int activityType  = 10;
	public static final  double activity  = 100.0;	
	public static final int battery  = 100;
	
//FCM Token 
	
	public static final String Server_Message = "Successfully Added New Token Token-test1";
	public static final String Server_Message1 = "Token Token-test1 Already present with User";
	public static final String Successful_Server_Message = "Successfully Fetched";
	public static final String Successful_Update_Message = "Successfully Updated Device token to Token-update1 from  Old Token Token-test1";
	public static final String Invalid_Update_Message = "Cannot find old token in the user's token list ";
	public static final String Successful_Delete_Message = "Successfully deleted Token Token-update1";
	public static final String Device_Android = "android"; 
	public static final String Device_IOS = "ios";
	
//FirmWare

	public static final String Invalid_Firmware = "Please specify hardware version";

//Articles 
	public static final String Invalid_Articles = "Error reducing number of articles: Sample larger than population or is negative";
	public static final String Kids_Es = "kidshealth.org/es/kids/word-zoonosis.html";
	
}
