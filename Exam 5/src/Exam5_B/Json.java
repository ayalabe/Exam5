package Exam5_B;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class Json {
	
	public void listHomeObjectDeserialize(String src) {
		File file = new File(src);
		try (FileReader fileReader = new FileReader(file)) {

			Gson gson = new Gson();
			//collections need TypeToken
			JsonReader jsonReader = new JsonReader(fileReader);
			Type homeListType = new TypeToken<ArrayList<Home>>(){}.getType();
			List<Home> homeList = gson.fromJson(jsonReader,homeListType);
	
			homeList.forEach(System.out::println);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
