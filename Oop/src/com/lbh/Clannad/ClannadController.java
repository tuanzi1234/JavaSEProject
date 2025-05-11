package com.lbh.Clannad;

public class ClannadController {
    public static void main(String[] args) {
        Clannad clannad = new Clannad();
        clannad.setA("067076065078078065068");
        clannad.setB("099108097110110097100");
        ClannadService clannadService = new ClannadService();
        clannadService.clannad(clannad);
    }

}
