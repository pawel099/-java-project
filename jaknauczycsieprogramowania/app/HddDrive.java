package jaknauczycsieprogramowania.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HddDrive implements Drive {

	List<File> files = new ArrayList<>();



	@Override
	public void addFile(File File) {
		files.add(File);


	}

	@Override
	public void listFiles() {
		files.forEach(System.out::println);

	}

	@Override
	public File findFile(String name) {
		Optional<File> foundFile = files.stream()
				.filter(file->file.getName.equals(name))
				.findFirst();

		return null;
	}
}
