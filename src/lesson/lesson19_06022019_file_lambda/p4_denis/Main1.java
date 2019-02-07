package next.ua;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) throws IOException {
		String c="C:\\3DMark\\redist\\111";
		File file=new File(c);
		System.out.println(file.exists());
		System.out.println(file.mkdir());
		/*
		Scanner in=new Scanner(System.in);
		while(true) {
			File files=new File(currentPath);
			System.out.println(files);
			for(File file : files.listFiles()) {
				if(file.isDirectory())
					System.out.println("\t"+file.getName());
			}
			String move=in.nextLine();
			switch(move) {
			case "..":
				currentPath=files.getParent();
				break;
			default:
				if(new File(currentPath+"/"+move).exists())
				currentPath+="/"+move;
			}
		}
		//in.close();
		//System.out.println(files.getParent());
		/*
		for(File file : files.listFiles()) {
			if(file.isDirectory())
				System.out.println(file.getName());
		}
		for(File file : files.listFiles()) {
			if(file.isFile())
				System.out.println(file.getName());
		}
		
		System.out.println(file.getName());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.listFiles());
	*/
		
		Path p1=Paths.get("C:\\3DMark\\redist\\1.exe");
		Path p2=Paths.get("C:\\3DMark\\redist\\111\\2.exe");
		System.out.println(Files.exists(p1));
		//Files.copy(p1, p2);
		Files.move(p1, p2,StandardCopyOption.REPLACE_EXISTING);
		
	}

}
