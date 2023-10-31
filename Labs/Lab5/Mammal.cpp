#include "Mammal.h"

Mammal::Mammal() : Animal() {

}

Mammal::Mammal(string n, COLOR c) : Animal(n, c) {

}

Mammal::~Mammal() {

}

void Mammal::move() const {
    cout << "Mammal moves " << endl;
}

void Mammal::eat() const {
    cout << "Mammal eats " << endl;
}

