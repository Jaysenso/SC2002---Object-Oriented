#pragma once
#include "Mammal.h"
class Cat : public Mammal
{
private:
	string owner;

public:
	Cat();
	Cat(string n, COLOR c, string owner);
	~Cat();

	virtual void move() const;
	virtual void speak() const;
	virtual void eat() const;
};

