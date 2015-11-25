public class Practice1_2 {
	public static void concatPath(Strng folder, String file){
		if(!folder.endsWith("\\")){
			folder += "\\";
		}
		return folder + file;
	}
}

/* Practice1_3
(1).*
(2)A\d{1,2}
(3)U[A-Z]{3}
"*/