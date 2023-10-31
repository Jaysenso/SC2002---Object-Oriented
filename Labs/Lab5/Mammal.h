#ifndef MAMMAL_H
#define MAMMAL_H

#include "Animal.h"

class Mammal : public Animal {
private:
public:
    Mammal();
    Mammal(string n, COLOR c);  
    ~Mammal();                 

    void move() const;
    virtual void eat() const;
};

#endif 