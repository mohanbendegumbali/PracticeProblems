package com.bridgelabz;

public class CommandArgument {
    public static void main(String[] args) {

        System.out.println("The commandline arguments are:\n");
        for (int x = 0; x < args.length; x++)
            System.out.println("args[" + x + "]: " + args[ x ]);

        }

    }

