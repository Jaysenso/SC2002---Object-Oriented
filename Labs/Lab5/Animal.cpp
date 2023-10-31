#include "Animal.h"

Animal::Animal() : _name("unknown") {
    cout << "constructing Animal object " << _name << endl;
}

Animal::Animal(string n, COLOR c): _name(n),_color(c) {
    cout << "Name is: " << _name << " with color: ";

    switch (c) {
    case Green:
        cout << "Green" << endl;
        break;
    case Blue:
        cout << "Blue" << endl;
        break;
    case White:
        cout << "White" << endl;
        break;
    case Black:
        cout << "Black" << endl;
        break;
    case Brown:
        cout << "Brown" << endl;
        break;
    default:
        cout << "Error!" << endl;
        break;
    }
}

Animal::~Animal() {
    cout << "destructing Animal object " << _name << endl;
}

void Animal::speak() const {
    cout << "Animal speaks " << endl;
}
void Animal::move() const {
    cout << "Animal moves " << endl;
}
