#include <iostream>
using namespace std;

/* 
 - A function to count the number
   of items in a linked list iteratively
   and recursively
*/

struct Node;
void insertInto(Node*& head, int value);
int iteratively(Node* head);
int recursively(Node* head);

/*
 - Custom Node
*/
struct Node {
    int data;
    Node* next;
};

/*
 - Main Function
 - Function to test iteravely function
    and recursively function
*/
int main() {
    Node* head = nullptr;

    for(int i = 0; i < 10; i++){
    insertInto(head, i*2);    
    }


    cout << "Number of nodes (Iterative): "
         << iteratively(head) << endl;

    cout << "Number of nodes (Recursive): "
         << recursively(head) << endl;

    return 0;
}

/* 
 - InsertInto
 - Function to insert a node into the linked list
*/
void insertInto(Node*& head, int value) {
    Node* newNode = new Node;
    newNode->data = value;
    newNode->next = head;
    head = newNode;
}


/* 
 - iteratively
 - Function to iteratively count the no. 
    of nodes in a linked list iteratively
 - Returns
    Total no of nodes in the linked list
*/
int iteratively(Node* head) {
    int count = 0;
    Node* current = head;

    while (current != nullptr) {
        count++;
        current = current->next;
    }

    return count;
}

/* 
 - recursively
 - Function to count the no. of nodes
   in a linked list using recursion
 - Returns 
    Total no. of nodes in the linked list
*/
int recursively(Node* head) {
    if (head == nullptr)
        return 0;
    else
        return 1 + recursively(head->next);
}
