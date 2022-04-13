package com.company;

public class Boss {
    public String getHealth;
    public String getDamage;

    public Boss(int i, int i1, String the_zachita) {

    }

    public String getBossDeafanse() {
        return null;
    }

    public class boss {
        private int health;
        private int damage;
        private String bossDeafanse;

        public boss(int health, int damage, String bossDeafanse) {
            this.health = health;
            this.damage = damage;
            this.bossDeafanse = bossDeafanse;
        }


        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public int getDamage() {
            return damage;
        }

        public void setDamage(int damage) {
            this.damage = damage;
        }

        public String getBossDeafanse() {
            return bossDeafanse;
        }

        public void setBossDeafanse(String bossDeafanse) {
            this.bossDeafanse = bossDeafanse;
        }
    }
}
