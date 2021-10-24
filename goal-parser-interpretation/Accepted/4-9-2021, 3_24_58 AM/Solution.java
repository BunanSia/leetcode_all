// https://leetcode.com/problems/goal-parser-interpretation

class Solution {
    public String interpret(String command) {
         if(command==null || command.indexOf('(')<0){
            return command;
        }
        command=command.replaceAll("\\(al\\)", "al");
        command=command.replaceAll("\\(\\)", "o");
        return command;
    }
}