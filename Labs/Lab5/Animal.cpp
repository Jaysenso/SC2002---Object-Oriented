#include <iostream>
#include <string>
#include <Animal.h>

Animal :: Animal() : _name("unknown") {
	cout << "constructing Animal object " << _name << endl;
}

Animal::Animal(string n, COLOR c) : _name(n), _color(c) {
	cout << "Constructing Mammal object " << _name <<" with color " << _color << endl;
}

Animal :: ~Animal() {
	cout << "destructing Animal object " << _name << endl;
}

void Animal :: speak() const {
	cout << "Animal speaks " << endl; 
}
 
void Animal :: move() const {
	cout << "Animal moves " << endl;
}


