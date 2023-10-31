#pragma once
#include "Mammal.h"



class Dog : public Mammal
{
private:
	string owner;

public:
	Dog();
	Dog(string n, COLOR c, string owner);
	~Dog();

	virtual void move() const;
	virtual void speak() const;
	virtual void eat() const;
};

