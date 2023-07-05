#pragma once

#include "MaxHeap.hpp"

using namespace std;

namespace NewUnknownAirlineUpgradeSystem 
{
    class NUASystem
    {
        public:
            waitingList::MaxHeap waitingList;
            vector<FrequentFlyer> returned_passengers;
            int cancel_counter;
            
            NUASystem() : waitingList(10)
                        , returned_passengers()
                        , cancel_counter(0)
            {/*cout << "CCon" << endl;*/}

            ~NUASystem() {/*cout << "DCon" << endl;*/}

            void systemUpgrade(waitingList::MaxHeap priorityQueue,int num_of_requests, int num_of_cancellation);

            void insertRequests(vector<FrequentFlyer> unorganized_waiting_list);
    };
}
