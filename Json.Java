import java.util.Scanner;

import org.json.JSONObject;

class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // Part 1

    System.out.print("Put list here: ");

    String l1 = scanner.nextLine();

    System.out.print("Put list 2 here: ");

    String l2 = scanner.nextLine();

    System.out.print("Put list 3 here: ");

    String l3 = scanner.nextLine();

    // Part 2

    System.out.println("1. " + l1);

    System.out.println("2. " + l2);

    System.out.println("3. " + l3);

    scanner.nextLine(); // wait for user input

    // Part 3

    System.out.println("Say 1=Yes, 2=No");

    System.out.print("Mark 1 Done: ");

    String A = scanner.nextLine();

    System.out.print("Mark 2 Done: ");

    String B = scanner.nextLine();

    System.out.print("Mark 3 Done: ");

    String C = scanner.nextLine();

    boolean resultA = A.equals("1");

    boolean resultB = B.equals("1");

    boolean resultC = C.equals("1");

    JSONObject output = new JSONObject();

    JSONObject input = new JSONObject();

    input.put("list1", l1);

    input.put("list2", l2);

    input.put("list3", l3);

    output.put("input", input);

    JSONObject part2 = new JSONObject();

    part2.put("list1", l1);

    part2.put("list2", l2);

    part2.put("list3", l3);

    output.put("part2", part2);

    JSONObject part3 = new JSONObject();

    part3.put("list1Done", resultA);

    part3.put("list2Done", resultB);

    part3.put("list3Done", resultC);

    output.put("part3", part3);

    System.out.println(output.toString(4));

  }

}

