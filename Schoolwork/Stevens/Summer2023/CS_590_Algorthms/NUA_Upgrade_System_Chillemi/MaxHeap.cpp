#include "MaxHeap.hpp"

using namespace std;

namespace waitingList
{
  int MaxHeap::getParent(int position)
  {
    return (position - 1) / 2;
  }

  int MaxHeap::getLeftChild(int position)
  {
    return (position * 2) + 1;
  }

  int MaxHeap::getRightChild(int position)
  {
    return (position * 2) + 2;
  }

  bool MaxHeap::isNodeALeaf(int position)
  {
    if(position > (size / 2) && position <= size)
    {
      return true;
    }

    return false;
  }

  void MaxHeap::swap(int fposition, int sposition)
  {
    NewUnknownAirlineUpgradeSystem::FrequentFlyer temp;
    temp = binHeapPQ[fposition];
    binHeapPQ[fposition] = binHeapPQ[sposition];
    binHeapPQ[sposition] = temp;
  }
    void MaxHeap::maxHeapify(int position)
    {
      if(isNodeALeaf(position))
      {
        return;
      }

      if(binHeapPQ[position] < binHeapPQ[getLeftChild(position)] || binHeapPQ[position] < binHeapPQ[getRightChild(position)])
      {
        if(binHeapPQ[getLeftChild(position)] > binHeapPQ[getRightChild(position)])
        {
          swap(position,getLeftChild(position));
          maxHeapify(getLeftChild(position));
        }
        else
        {
          swap(position,getRightChild(position));
          maxHeapify(getRightChild(position));
        }
      }

    }
    
    NewUnknownAirlineUpgradeSystem::FrequentFlyer MaxHeap::removeMax()
    {
      NewUnknownAirlineUpgradeSystem::FrequentFlyer frontItem = binHeapPQ[0];
      binHeapPQ[0] = binHeapPQ[--size];
      maxHeapify(0);
      return frontItem;
    }
 
    void MaxHeap::insert(const NewUnknownAirlineUpgradeSystem::FrequentFlyer &frequent_flyer)
    {
      binHeapPQ[size] = frequent_flyer;
      //cout << "Before WHILE" << endl;
      int current_position = size;
      while(binHeapPQ[current_position] > binHeapPQ[getParent(current_position)])
      {
        //cout << "Inside WHILE" << endl;
        swap(current_position, getParent(current_position));
        //cout << "After Swap" << endl;
        current_position = getParent(current_position);
      }
      //cout << "After WHILE" << endl;
      size++;
    }


    void MaxHeap::constructHeap(vector<NewUnknownAirlineUpgradeSystem::FrequentFlyer> list)
    {
      int last_non_leaf_node = (list.size()/2) -1;

      for (int subtree_root_index = last_non_leaf_node; subtree_root_index >=0; subtree_root_index-=1)
      {
        //maxHeapify(list, list.size(), subtree_root_index);

      }

      binHeapPQ = list;
    }
    
} 

