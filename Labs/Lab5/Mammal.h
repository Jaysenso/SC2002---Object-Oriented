#pragma once
#ifndef MAMMAL_H
#define MAMMAL_H

#include <Animal.h>

class Mammal : Animal {

public:
	Mammal();
	Mammal(string n, COLOR c);
	~Mammal();

	void eat() const;
	void speak() const;
	
};
#endif



