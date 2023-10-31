#include <iostream>
#include <string>
#include <Mammal.h>

Mammal::Mammal() : Animal() {

}

Mammal::Mammal(string n, COLOR c) : Animal() {

}

Mammal :: ~Mammal()  {
	
}

void Mammal :: eat() const {
	cout << "Mammal eat " << endl;
}

void Mammal::speak() const {
	cout << "Mammal speak " << endl;
}