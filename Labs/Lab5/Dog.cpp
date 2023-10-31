
#include <iostream>
#include "Dog.h"

Dog::Dog() : Mammal() {

}

Dog::Dog(string n, COLOR c, string owner) : 
	Mammal(n, c), 
	owner(owner) {
}

Dog::~Dog() {

}

void Dog::move() const {
	cout << "Dog moves" << endl;
}
void Dog::speak() const {
	cout << "Dog woofs" << endl;
}
void Dog::eat() const {
	cout << "Dog eats" << endl;
}
