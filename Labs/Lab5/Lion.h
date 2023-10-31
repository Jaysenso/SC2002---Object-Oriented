#pragma once
#include "Mammal.h"
class Lion : public Mammal
{
public:
	Lion();
	Lion(string n, COLOR c);
	~Lion();

	virtual void move() const;
	virtual void speak() const;
	virtual void eat() const;
};

