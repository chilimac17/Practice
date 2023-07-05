#pragma once

#include "FrequentFlyer.hpp"
#include <vector>

using namespace std;
namespace waitingList
{
    
    class MaxHeap
    {
        public:
        
            vector<NewUnknownAirlineUpgradeSystem::FrequentFlyer> binHeapPQ;
            int size;
            int max_size;

            MaxHeap(int maxSize)
            {
                /*cout << "CCon" << endl;*/
                this->max_size = maxSize;
                this->size = 0;
                vector<NewUnknownAirlineUpgradeSystem::FrequentFlyer> newHeap(maxSize);
                binHeapPQ = newHeap;
            }
            ~MaxHeap(){/*cout << "DCon" << endl;*/}

            
            int getParent(int position);

            int getLeftChild(int position);

            int getRightChild(int position);

            bool isNodeALeaf(int position);

            void swap(int fposition, int sposition);

            void maxHeapify(int position);
            
            NewUnknownAirlineUpgradeSystem::FrequentFlyer removeMax();

            void insert(const NewUnknownAirlineUpgradeSystem::FrequentFlyer &frequent_flyer);

            void constructHeap(vector<NewUnknownAirlineUpgradeSystem::FrequentFlyer> list);

            

 
    };
} 
