// Lab5.cpp : This file contains the 'main' function. Program execution begins and ends there.
//
#include <iostream>
#include <vector>

#include "Animal.h"
#include "Mammal.h"
#include "Dog.h"
#include "Cat.h"
#include "Lion.h"

using namespace std;

int main() {

	cout << "---- Q1 : Instantiation/Inheritance/Polymorphism ----" << endl;
	Mammal m = Mammal("Platypus", Green);
	m.speak();
	Dog d = Dog("Golden retriever", Blue, "John");
	d.speak();
	d.move();

	Animal* animalPtr = new Dog("Lassie 1", White, "Andy");
	animalPtr->speak();
	animalPtr->move();
	delete animalPtr;

	cout << "\n---- Q3 : Virtual Function Magic ----" << endl;
	Dog dogi("Lassie 2", White, "Andy");
	Mammal *aniptr = &dogi;
	Mammal &aniRef = dogi;
	Mammal aniVal = dogi;

	aniptr->speak(); //prints Dog woofs
	aniRef.speak(); //prints Dog woofs
	aniVal.speak(); //prints Mammal speak 

	cout << "\n---- Q4 : Build a Zoo ----" << endl;
	int choice;
    vector<Mammal*> zoo;
	 
	do {
		cout << "Select the animal to send to Zoo: " << endl;
		cout << "(1) Dog (2) Cat (3) Lion (4) Move all animals (5) Quit" << endl;
		cin >> choice;
		switch (choice) {
			case 1: {
				Dog* dog = new Dog("Dog", Black, "Jsen");
				zoo.push_back(dog);
				break;
			}
			case 2: {
				Cat* cat = new Cat("Cat", Black, "Jsen");
				zoo.push_back(cat);
				break;
			}
			case 3: {
				Lion* lion = new Lion("Lion", Brown);
				zoo.push_back(lion);
				break;
			}
			case 4: {
				for (int i = 0; i < zoo.size(); i++) {
					zoo[i]->move();
					zoo[i]->speak();
					zoo[i]->eat();
					cout << endl;
				}
				break;
			}
			default:
				break;
		}
	} while (choice != 5);

	cout << "\nProgram exiting..." << endl;

	//for (int i = 0; i < zoo.size(); i++) {
	//	delete zoo[i];
	//}

	while (zoo.size() != 0) {
		int i = zoo.size() - 1;
		delete zoo[i]; //delete zoo[i] does not reduce vector 's size
		zoo.pop_back(); //hence we need to manually remove the last element & reduce its size
	}
	return 0;
};
