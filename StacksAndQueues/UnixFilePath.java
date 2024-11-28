package StacksAndQueues;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

public class UnixFilePath {
    public String simplifyPath(String path) {

        String[] elements = path.split("/");
        StringBuilder answer = new StringBuilder();
        Stack<String> simplifiedPath = new Stack<>();
        System.out.println(Arrays.toString(elements));
        for (int i = 1; i < elements.length; i++) {
            if(Objects.equals(elements[i], "."))continue;
            if(Objects.equals(elements[i], ""))continue;
            if(Objects.equals(elements[i], "..")){
                if(!simplifiedPath.isEmpty()){
                    simplifiedPath.pop();
                }
                continue;

            }
            simplifiedPath.push(elements[i]);

        }
        for (String dir : simplifiedPath) {
            answer.append("/").append(dir);
        }

        return !answer.isEmpty() ? answer.toString(): "/";
    }
}
