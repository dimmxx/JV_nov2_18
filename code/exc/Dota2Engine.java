package exc;

public class Dota2Engine {
void actionFight(Hero hero1, Hero hero2) {
	hero1.setHealth(hero2.getStrike());
	hero2.setHealth(hero1.getStrike());
}
}
