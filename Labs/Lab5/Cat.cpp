#include "Cat.h"
#include <iostream>

Cat::Cat() : Mammal() {

}

Cat::Cat(string n, COLOR c, string owner) :
	Mammal(n, c),
	owner(owner) {

}

Cat::~Cat() {

}

void Cat::move() const {
	cout << "Cat moves" << endl;
}
void Cat::speak() const {
	cout << "Cat meows" << endl;
}
void Cat::eat() const {
	cout << "Cat eats" << endl;
}