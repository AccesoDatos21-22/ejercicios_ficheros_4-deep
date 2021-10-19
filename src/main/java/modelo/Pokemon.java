package modelo;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;
import java.util.Objects;

@XmlRootElement(name = "pokemon")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Pokemon implements Serializable {
	private String name;
	private int life;
	private int attack;
	private int defense;
	private int specialAttack;
	private int specialdefense;
	private int speed;

	public Pokemon(String name, int life, int attack, int defense, int specialAttack, int specialdefense, int speed) {
		this.name = name;
		this.life = life;
		this.attack = attack;
		this.defense = defense;
		this.specialAttack = specialAttack;
		this.specialdefense = specialdefense;
		this.speed = speed;
	}

	public Pokemon() {
		this.name=null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAtack() {
		return attack;
	}

	public void setAtack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getSpecialAttack() {
		return specialAttack;
	}

	public void setSpecialAttack(int specialAttack) {
		this.specialAttack = specialAttack;
	}

	public int getSpecialdefense() {
		return specialdefense;
	}

	public void setSpecialdefense(int specialdefense) {
		this.specialdefense = specialdefense;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;

	}

	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", life=" + life + ", attack=" + attack + ", defense=" + defense
				+ ", specialAttack=" + specialAttack + ", specialdefense=" + specialdefense + ", speed=" + speed + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(attack, defense, life, name, specialAttack, specialdefense, speed);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		return attack == other.attack && defense == other.defense && life == other.life
				&& Objects.equals(name, other.name) && specialAttack == other.specialAttack
				&& specialdefense == other.specialdefense && speed == other.speed;
	}


}