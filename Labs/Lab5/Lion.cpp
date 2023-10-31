#include "Lion.h"


Lion::Lion() : Mammal() {

}

Lion::Lion(string n, COLOR c) : Mammal(n, c) {

}

Lion::~Lion() {

}

void Lion::move() const{
	cout << "Lion moves" << endl;
}
void Lion::speak() const {
	cout << "Lion roars" << endl;
}
void Lion::eat() const {
	cout << "Lion eats" << endl;
}