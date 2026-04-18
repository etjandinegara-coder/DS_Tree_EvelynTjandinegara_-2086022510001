package ds_tree_evelyntjandinegara_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreeMLBBTutorial {

    static class ItemNode {
        String name;
        String note;
        List<ItemNode> children;

        ItemNode(String name, String note) {
        this.name = name;
        this.note = note;
        this.children = new ArrayList<>();
        }

        void addChild(ItemNode child) {
        children.add(child);
        }
    }

    static void printTree(ItemNode node, int level) {
        if (node == null) return;

        String indent = " ".repeat(level);
        System.out.println(indent + "- " + node.name + " -> " + node.note);

        for (ItemNode child : node.children) {
        printTree(child, level + 1);
        }
    }

    static void printAllBuildPaths(ItemNode node, List<String> path) {
        if (node == null) return;

        path.add(node.name);

        if (node.children.isEmpty()) {
        System.out.println(String.join(" -> ", path));
        } else {
        for (ItemNode child : node.children) {
        printAllBuildPaths(child, path);
            }
        }

        path.remove(path.size() - 1);
    }

    static int countNodes(ItemNode node) {
        if (node == null) return 0;

        int total = 1;
        for (ItemNode child : node.children) {
        total += countNodes(child);
        }

        return total;
    }

    static int countLeaves(ItemNode node) {
        if (node == null) return 0;
        if (node.children.isEmpty()) return 1;

        int total = 0;
        for (ItemNode child : node.children) {
        total += countLeaves(child);
        }
        
        return total;
    }

    static int height(ItemNode node) {
        if (node == null) return 0;
        if (node.children.isEmpty()) return 1;

        int maxChildHeight = 0;
        for (ItemNode child : node.children) {
        maxChildHeight = Math.max(maxChildHeight, height(child));
        }

        return 1 + maxChildHeight;
    }

    static boolean findPath(ItemNode node, String target, List<String> path) {
        if (node == null) return false;

        path.add(node.name);

        if (node.name.equalsIgnoreCase(target)) {
        
            return true;
        }

        for (ItemNode child : node.children) {
            if (findPath(child, target, path)) {
            
                return true;
            }
        }

        path.remove(path.size() - 1);
        return false;
    }

    static int countItemOccurrences(ItemNode node, String target) {
        if (node == null) return 0;

        int count = 0;

        if (node.name.equalsIgnoreCase(target)) {
            count = 1;
        }

        for (ItemNode child : node.children) {
            count += countItemOccurrences(child, target);
        }

        return count;
        }

    static void printPathsToImmortal(ItemNode node, List<String> path, String target) {
        if (node == null) return;

        path.add(node.name);

        if (node.name.equalsIgnoreCase(target)) {
            System.out.println(String.join(" -> ", path));
        }

        for (ItemNode child : node.children) {
            printPathsToImmortal(child, path, target);
        }

        path.remove(path.size() - 1);
        }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
        

        ItemNode root = new ItemNode ("Start Build" , "Choose your first major purchase path");


        ItemNode berserkersfury = new ItemNode ("Berserker's Fury" , "Higher burst follow-up");
        ItemNode geniuswand = new ItemNode ("Genius Wand" , "Deal multi-stage damage");
        ItemNode goldenstaff = new ItemNode ("Golden Staff" , "");
        ItemNode immortality = new ItemNode ("Immortality" , "Pages with too many expensive parser function calls");
        root.addChild(berserkersfury);
        root.addChild(geniuswand);
        root.addChild(goldenstaff);
        root.addChild(immortality);

        ItemNode legionsword = new ItemNode ("Legion Sword" , "Physical Attack Items");
        ItemNode javelinone = new ItemNode ("Javelin One" , "Critical Chance Items");
        ItemNode javelintwo = new ItemNode ("Javelin Two" , "Critical Chance Items");
        berserkersfury.addChild(legionsword);
        berserkersfury.addChild(javelinone);
        berserkersfury.addChild(javelintwo);


        ItemNode daggerone = new ItemNode ("Dagger One" , "Attack equipment");
        ItemNode daggertwo = new ItemNode ("Dagger Two" , "Attack equipment");
        legionsword.addChild(daggerone);
        legionsword.addChild(daggertwo);


        ItemNode exoticveil = new ItemNode ("Exotic Veil" , "Magic damage heroes");
        ItemNode magicwand = new ItemNode ("Magic Wand" , "Magic power items");
        geniuswand.addChild(exoticveil);
        geniuswand.addChild(magicwand);

        ItemNode mysticcodexone = new ItemNode ("Mystic Codex One" , "Allowing them to last longer in fights");
        exoticveil.addChild(mysticcodexone);

        ItemNode mysticcodextwo = new ItemNode ("Mystic Codex Two" , "Allowing them to last longer in fights");
        magicwand.addChild(mysticcodextwo);


        ItemNode corrosionscythe = new ItemNode ("Corrosion Scythe" , "");
        goldenstaff.addChild(corrosionscythe);


        System.out.println("Tree Structure");
        printTree(root, 0);

        System.out.println("\nAll Build Paths");
        printAllBuildPaths(root, new ArrayList<>());

        System.out.println("\nTotal Node: " + countNodes(root));
        System.out.println("Leaf Node: " + countLeaves(root));
        System.out.println("Tree Height: " + height(root));
        
        System.out.println("\nPaths ending with Immortality:");
        printPathsToImmortal(root, new ArrayList<>(), "Immortality");

        System.out.print("\nEnter item to find path : ");
        String target = scanner.nextLine();
        
        List<String> path = new ArrayList<>();
        if (findPath(root, target, path)) {
            System.out.println("Path: " + String.join("-> ", path));
        } else {
            System.out.println("item not found");
        }

        System.out.println("\nCount Item Occurrences " + target + " : " + countItemOccurrences(root, target));

        System.out.println("\nBefore adding new level: " + height(root));

        ItemNode bladeofdespair = new ItemNode ("Blade of Despair" , "Maximize late damage");
        daggerone.addChild(bladeofdespair);
        
        System.out.println("After adding new level: " + height(root));

        }
    }
}