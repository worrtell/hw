package java_sem2.hw._18_03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void PersonList(List<? extends Person> person) {
        for(Person m : person) {
            System.out.println(m);
        }
    }

    public static void MuggleList(List<? super Accounter> accounter) {
        System.out.println("I could be accounter");
    }

    public static void WizardList(List<? super Auror> auror) {
        System.out.println("I could be auror");
    }

    public static void main(String[] args) {
        List<Accounter> mg = new ArrayList<>();
        List<Auror> au = new ArrayList<>();
        List<Muggle> mug = new ArrayList<>();
        List<Wizard> wz = new ArrayList<>();

        mg.add(new Accounter("s", 1));
        mg.add(new Accounter("d", 2));

        au.add(new Auror(7));
        au.add(new Auror(10));

        mug.add(new Muggle("a"));

        wz.add(new Wizard(2));

        PersonList(mg);
        WizardList(wz);
        MuggleList(mug);

    }
}
