import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicateFile {
    public static void main(String[] args) {
        List<String[]> inputList = new ArrayList<>();
        inputList.add(new String[]{
                "home/user1 1.txt(hello) 2.txt(world)",
                "home/user2 3.txt(hello)",
                "home/user3/docs 4.txt(world)",
                "home/user3/docs 5.txt(greetings)"
        });
        FindDuplicateFile.findDuplicatee(inputList.get(0));
    }
    public static List<List<String>> findDuplicatee(String[] paths) {
        Map<String, List<String>> fileMap = new HashMap<>();

        for (String path : paths) {
            String[] values = path.split(" ");
            for (int i = 1; i < values.length; i++) {
                String[] nameContent = values[i].split("\\(");
                String content = nameContent[1].substring(0, nameContent[1].length() - 1);
                String directory = values[0];
                String fileName = nameContent[0];
                String filePath = directory + "/" + fileName;
                fileMap.computeIfAbsent(content, k -> new ArrayList<>()).add(filePath);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for (List<String> pathsWithSameContent : fileMap.values()) {
            if (pathsWithSameContent.size() > 1) {
                result.add(pathsWithSameContent);
            }
        }
        return result;
    }
}