import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArchiveOps implements Iterable<Archive> {

    private ArrayList<Archive> archiveList = new ArrayList<>();

    public void addToArchiveList(Archive archive) {
        archiveList.add(archive);
    }

    public void addToArchiveList() {
        Scanner scanner = new Scanner(System.in);
        String id;
        String name;

        while (true) {
            System.out.println("Id?");
            id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }
            System.out.println("Name?");
            name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            Archive toAdd = new Archive(id, name);

            if (!archiveList.contains(toAdd)) {
                archiveList.add(toAdd);
            }
        }
    }

    @Override
    public Iterator<Archive> iterator() {
        return archiveList.iterator();
    }
}
